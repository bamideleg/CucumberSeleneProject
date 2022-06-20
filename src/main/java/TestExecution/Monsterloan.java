package TestExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Monsterloan {
	
	WebDriver driver;
	 
@Given("^User is on https://www\\.calculators\\.org/$")
public void user_is_on_https_www_calculators_org() throws Throwable {	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.calculators.org/");
	System.out.println("Start the browser");

	
}
@Given("^Click on Loan link$")
public void click_on_Loan_link() throws Throwable {	
	driver.findElement(By.id("menu-item-918")).click();
	System.out.println("Select loan link from the menu bar");

}
@Then("^enter the LoanAmount$")
public void enter_the_LoanAmount() throws Throwable {
	driver.findElement(By.name("principal")).sendKeys("600000");
	System.out.println("Under constrcution");

}
@Then("^enter the Upfront_Fee$")
public void enter_the_Upfront_Fee() throws Throwable {
	driver.findElement(By.name("fee")).sendKeys("200000");
	System.out.println("Enter Upfront fee or deposit");

}
@Then("^enter the Interest_Rate$")
public void enter_the_Interest_Rate() throws Throwable {
	driver.findElement(By.name("interest_rate")).sendKeys("10");
	System.out.println("Enter interest rate");


}
@Then("^enter the Term$")
public void enter_the_Term() throws Throwable {
	driver.findElement(By.name("num_years")).sendKeys("4");
	System.out.println("Enter the number of years to pay back the loan");
 
}
@Then("^enter the Payment Per Year$")
public void enter_the_Payment_Per_Year() throws Throwable {
	driver.findElement(By.name("ppy")).sendKeys("400");
	System.out.println("Enter the monthly payment for the loan");

}
@Then("^Click on Calculate button$")
public void click_on_Calculate_button() throws Throwable {
	driver.findElement(By.cssSelector("input.button-action.button.replace.blue")).click();
	System.out.println("Click on the calculate button");

}

@Then("^Check that monthly is display$")
public void check_that_monthly_is_display() throws Throwable {
	String MonthlyPayment = driver.findElement(By.name("payment")).getText();
	System.out.println(" The monthly payment is " + MonthlyPayment);
}
@Then("^check that interest rate is display$")
public void check_that_interest_rate_is_display() throws Throwable {
	String TotalInTerestRate = driver.findElement(By.name("totalint")).getText();
	System.out.println(" The monthly payment is " + TotalInTerestRate);
}

@Then("^closed the browser$")
public void closed_the_browser() throws Throwable {
	driver.close(); 
}


}
