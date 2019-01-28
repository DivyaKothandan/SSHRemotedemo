package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefs {
	
	WebDriver driver;
	
	@Given("^Launch URL of the application$")
	public void launchUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		System.out.println("URL is launched : " + driver.getTitle());
	}


	@When("^User is already in Login Page of the application$")
	public void loginPage()
	{
		
		System.out.println("User is already in Login Page of the application");
		
	}
	

	@Then("^User enters username and Password$")
	public void enterCrenditals()
	{
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("DivyaKothandan");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("krishnan");
		
		System.out.println("Credentails are entered");
		
	}
	

	/*@Then("^User clicks Login button$")
	public void loginButton()
	{
		WebElement login = driver.findElement(By.xpath("//input[@type = 'submit']"));
		login.submit();
	}*/
	

	@Then("^User is in Homepage$")
	public void homePage()
	{
		
		System.out.println("User is in homepage" + driver.getTitle());
		
	}
	
	@Then("^User close the browser$")
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}
