package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navbar {

    WebDriver driverNav;

    By homeLink = By.xpath("//button[@class ='nav-item active']/span[contains(text(), 'Home')]");
    By aboutUsLink = By.xpath("//button[@class ='nav-item ']/span[contains(text(), 'About Us')]");
    By testimonialsLink = By.xpath("//button[@class ='nav-item ' ]/span[contains(text(), 'Testimonials')]");
    By mentorsLink = By.xpath("//button[@class ='nav-item ' ]/span[contains(text(), 'Mentors')]");
    By graduatesLink = By.xpath("//button[@class ='nav-item ' ]/span[contains(text(), 'Graduates')]");
    By contactUsLink = By.xpath("//button[@class ='nav-item ' ]/span[contains(text(), 'Contact Us')]");

    //Learn dropdown elements
    By learnLink = By.xpath("//button[@class ='nav-dropdown-trigger  ' ]/span[text()='Learn']");

    By curriculumOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[contains( text(), 'Curriculum')]");
    By learningMaterialsOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'Learning Materials']");
    By performanceTestingOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'Performance Testing']");


    //Connect dropdown elements
    By connectLink = By.xpath("//button[@class ='nav-dropdown-trigger  ' ]/span[text()='Connect']");

    By enrolOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'Enrol Now']");
    By privacyPolicyOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'Privacy Policy']");
    By termsAndConditionsOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'Terms and Conditions']");


    // Logged-in elements

    //My learning dropdown elements
    By myLearningLink = By.xpath("//button[@class ='nav-dropdown-trigger  ' ]/span[text()='My Learning']");

    By dashboardOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'Dashboard']");
    By myCoursesOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'My Courses']");
    By paymentsOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'Payments']");
    By recordingsOption = By.xpath("//button[@class= 'nav-dropdown-item ']/span[text()= 'Recordings']");


    //Menu dropdown elements
    By menuButton = By.xpath("//button[@class ='user-pill open' ]/span[text()='Menu']");

    By myProfileOption = By.xpath("//button[@class = 'nav-dropdown-item ']/span[text()= 'My Profile']");
    By writeReviewOption = By.xpath("//button[@class = 'nav-dropdown-item']/span[text()='Write Review']");
    By instructorPanelOption = By.xpath("//button[@class = 'nav-dropdown-item']/span[text()='Instructor Panel']");
    By adminPanelOption = By.xpath("//button[@class = 'nav-dropdown-item']/span[text()='Admin Panel']");
    By logoutOption = By.xpath("//button[@class = 'nav-dropdown-item']/span[text()='Logout']");

    // Logged-out element
    By mainLoginButtonLink = By.xpath("//button[@class = 'user-pill']/span[text()='Login']");


    public Navbar(WebDriver drive) {
        this.driverNav = drive;
    }


    public void NavigateToHomepage() {
        driverNav.findElement(homeLink).click();
    }

    public void NavigateToAboutPage() {
        driverNav.findElement(aboutUsLink).click();
    }

    public void NavigateToTestimonialsPage() {

        driverNav.findElement(testimonialsLink).click();
    }

    public void NavigateToGraduatesPage() {

        driverNav.findElement(graduatesLink).click();
    }

    public void NavigateToMentorsPage() {
        driverNav.findElement(mentorsLink).click();

    }

    public void NavigateToContactPage() {

        driverNav.findElement(contactUsLink).click();
    }

    public void dropdownLearn() {
        driverNav.findElement(learnLink).click();

    }

    //LEARN DROPDOWN METHODS:

    public void selectCurriculum() {
        driverNav.findElement(learnLink).click();
        driverNav.findElement(curriculumOption).click();
    }

    public void selectLearningMaterials() {
        driverNav.findElement(learnLink).click();
        driverNav.findElement(learningMaterialsOption).click();

    }

    public void selectPerformanceTesting() {

        driverNav.findElement(learnLink).click();
        driverNav.findElement(performanceTestingOption).click();
    }


    public void dropdownConnect() {
        driverNav.findElement(connectLink).click();


    }

    //CONNECT DROPDOWN METHODS
    public void selectEnrol() {
        driverNav.findElement(connectLink).click();
        driverNav.findElement(enrolOption).click();

    }

    public void selectPrivacyPolicy() {
        driverNav.findElement(connectLink).click();
        driverNav.findElement(privacyPolicyOption).click();

    }

    public void selectTermsAndConditions() {
        driverNav.findElement(connectLink).click();
        driverNav.findElement(termsAndConditionsOption).click();

    }

    public void dropdownMyLearning() {
        driverNav.findElement(myLearningLink).click();

    }

    //MY LEARNING DROPDOWN METHODS

    public void selectDashboard() {
        driverNav.findElement(myLearningLink).click();
        driverNav.findElement(dashboardOption).click();


    }

    public void selectPayments() {
        driverNav.findElement(myLearningLink).click();
        driverNav.findElement(paymentsOption).click();

    }

    public void selectRecordings() {
        driverNav.findElement(myLearningLink).click();
        driverNav.findElement(recordingsOption).click();

    }

    public void selectMyCourses() {
        driverNav.findElement(myLearningLink).click();
        driverNav.findElement(myCoursesOption).click();

    }


    public void menuDropdown() {

        driverNav.findElement(menuButton).click();

    }

    //MENU DROPDOWN METHODS
    public void selectMyProfile() {

        driverNav.findElement(menuButton).click();
        driverNav.findElement(myProfileOption).click();
    }

    public void selectWriteReview() {
        driverNav.findElement(menuButton).click();
        driverNav.findElement(writeReviewOption).click();

    }

    public void selectInstructorPanel() {
        driverNav.findElement(menuButton).click();
        driverNav.findElement(instructorPanelOption).click();


    }

    public void selectAdminPanel() {
        driverNav.findElement(menuButton).click();
        driverNav.findElement(adminPanelOption).click();

    }

    public void selectLogout() {

        driverNav.findElement(menuButton).click();
        driverNav.findElement(logoutOption);
    }

    public void NavigateToLoginPage() {
        driverNav.findElement(mainLoginButtonLink).click();

    }


}
