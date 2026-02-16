package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStepDefinition {
    WebDriver driver;


    @Given("browser is open")
    public void browser_is_open() {
        driver=new ChromeDriver();

    }
    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");

    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");


    }
    @When("user clicks on login")
    public void user_clicks_on_login() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        boolean logo=driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
        if(logo){
            System.out.println("User is on Home Page");
        }else{
            System.out.println("Home Page not getting displayed");
        }
        driver.quit();

    }


    @When("user inputs {string} and {string}")
    public void userInputsAnd(String username, String password) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

    }
}
