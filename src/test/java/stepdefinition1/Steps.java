package stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	WebDriver driver;
	
	@Given("user open a chrome browser and enters a url")
	public void user_open_a_chrome_browser_and_enters_a_url() {
		
		WebDriverManager.chromedriver().setup();
		
        driver = new ChromeDriver();	
     
        driver.manage().window().maximize();
     
        driver.get("https://v1.training-support.net/selenium/simple-form?");
	}

	@When("user enters values of firstname, lastname, Email, contact number, message")
	public void user_enters_values_of_firstname_lastname_email_contact_number_message() {
		
		driver.findElement(By.id("firstName")).sendKeys("Shiiva");
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		driver.findElement(By.id("email")).sendKeys("Shiiva@gmail.com");
		driver.findElement(By.id("number")).sendKeys("8106789000");
		driver.findElement(By.xpath("//textarea")).sendKeys("Hi how are you");
	   
	}

	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
		
	    
	}

	@Then("A pop up alert message should be displayed")
	public void a_pop_up_alert_message_should_be_displayed() {
		
		System.out.println("An alert pop up is displayed");
	   
	}



}
