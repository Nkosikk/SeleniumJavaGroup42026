import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Listeners;

@Listeners(ExtentReportListener.class)

public class InstructorTaskFlowTest {

    static String baseUrl = "https://www.ndosiautomation.co.za/APIDEV";
    static String instructorToken;
    static String taskId;
    static String groupId = "f552e054-8b24-41c2-a0ce-24018a205783";

    @Test
    public void testInstructorLogin() {
        String requestBody = "{ \"email\": \"nqubeko.qatest@example.com\", \"password\": \"SecurePass123#\" }";

        Response response = given()
                .baseUri(baseUrl)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .body("success", equalTo(true))
                .body("data.user.role", equalTo("instructor"))
                .extract().response();

        instructorToken = response.jsonPath().getString("data.token");
        System.out.println("Saved instructor token");
    }
    @Test(dependsOnMethods = "testInstructorLogin")
    public void testCreateTask() {
        String requestBody = "{ \"title\": \"Automation Practice Task\", "
                + "\"description\": \"Testing the instructor task creation flow\", "
                + "\"groupId\": \"" + groupId + "\", "
                + "\"priority\": \"medium\", "
                + "\"dueDate\": \"2026-09-01T12:00:00.000Z\" }";

        Response response = given()
                .baseUri(baseUrl)
                .header("Authorization", "Bearer " + instructorToken)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/instructor/tasks")
                .then()
                .statusCode(201)
                .body("success", equalTo(true))
                .body("data.id", notNullValue())
                .extract().response();

        taskId = response.jsonPath().getString("data.id");
        System.out.println("Saved taskId: " + taskId);
    }
    @Test(dependsOnMethods = "testCreateTask")
    public void testGetTasksByGroup() {
        given()
                .baseUri(baseUrl)
                .header("Authorization", "Bearer " + instructorToken)
                .queryParam("groupId", groupId)
                .when()
                .get("/instructor/tasks")
                .then()
                .statusCode(200)
                .body("success", equalTo(true))
                .body("data.tasks.Id", hasItem(taskId));
    }
    @Test(dependsOnMethods = "testGetTasksByGroup")
    public void testUpdateTask() {
        String requestBody = "{ \"title\": \"Automation Practice Task - Updated\", "
                + "\"description\": \"Testing the instructor task update flow\", "
                + "\"groupId\": \"" + groupId + "\", "
                + "\"priority\": \"high\", "
                + "\"dueDate\": \"2026-09-05T12:00:00.000Z\" }";

        given()
                .baseUri(baseUrl)
                .header("Authorization", "Bearer " + instructorToken)
                .header("Content-Type", "application/json")
                .pathParam("id", taskId)
                .body(requestBody)
                .when()
                .put("/instructor/tasks/{id}")
                .then()
                .statusCode(200)
                .body("success", equalTo(true))
                .body("data.id", equalTo(taskId));
    }
    @Test(dependsOnMethods = "testUpdateTask")
    public void testGetTaskCompletions() {
        given()
                .baseUri(baseUrl)
                .header("Authorization", "Bearer " + instructorToken)
                .pathParam("id", taskId)
                .when()
                .get("/instructor/tasks/{id}/completions")
                .then()
                .statusCode(200)
                .body("data.task.title", equalTo("Automation Practice Task - Updated"))
                .body("data.task.priority", equalTo("high"));
    }
    @Test(dependsOnMethods = "testGetTaskCompletions")
    public void testDeleteTask() {
        given()
                .baseUri(baseUrl)
                .header("Authorization", "Bearer " + instructorToken)
                .pathParam("id", taskId)
                .when()
                .delete("/instructor/tasks/{id}")
                .then()
                .statusCode(200)
                .body("success", equalTo(true))
                .body("message", equalTo("Task deleted successfully"));
    }
    @Test(dependsOnMethods = "testDeleteTask")
    public void testDeleteTaskAlreadyDeleted_ReturnsNotFound() {
        given()
                .baseUri(baseUrl)
                .header("Authorization", "Bearer " + instructorToken)
                .pathParam("id", taskId)
                .when()
                .delete("/instructor/tasks/{id}")
                .then()
                .statusCode(404)
                .body("success", equalTo(false))
                .body("error_code", equalTo("NOT_FOUND"));
    }
   }