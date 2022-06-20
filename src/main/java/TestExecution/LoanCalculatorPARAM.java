package TestExecution;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoanCalculatorPARAM {
	
	WebDriver driver;
	
//	@Given("^User navigates to https://www\\.calculators\\.org/$")
//	public void user_navigates_to_https_www_calculators_org() throws Throwable {
	
	@Given("^User navigate to https://www\\.calculators\\.org/$")
	public void user_navigate_to_https_www_calculators_org() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.calculators.org/");
		System.out.println("Start the browser");

	}

//	@Given("^Click on Loan link(\\d+)$")
//	public void click_on_Loan_link(int arg1) throws Throwable {
		
	@Given("^click on loan link from the menu bar$")
	public void click_on_loan_link_from_the_menu_bar() throws Throwable {		
		driver.findElement(By.id("menu-item-918")).click();
		System.out.println("Select loan link from the menu bar");


	}

//	@Then("^enter the Loan amount,Upfront_Fee,Interest Rate,Term and Years$")
//	public void enter_the_Loan_amount_Upfront_Fee_Interest_Rate_Term_and_Years(DataTable testdata) throws Throwable {
		
	@Then("^User I want to fill the loan form and get the monthly payment$")
	public void user_I_want_to_fill_the_loan_form_and_get_the_monthly_payment(DataTable testdata ) throws Throwable {	
		
		
//		Map<String, String> testDataAsMap = testdata.asMap(String.class, String.class);
		
//		List<String> testDataAsList = testdata.asList(String.class);
		
	   java.util.Map<String, String> testDataAsMap =testdata.asMap(String.class,String.class);
		
		
		 driver.findElement(By.name("principal")).sendKeys(testDataAsMap.get("Loan Amount"));
		 driver.findElement(By.name("fee")).sendKeys(testDataAsMap.get("Upfront Fee"));
		 driver.findElement(By.name("interest_rate")).sendKeys(testDataAsMap.get("Interest Rate"));
		 driver.findElement(By.name("num_years")).sendKeys(testDataAsMap.get("Term"));
		 driver.findElement(By.name("ppy")).sendKeys(testDataAsMap.get("Payment PR Year"));
		
		 System.out.println(testDataAsMap.toString());


	}
//	@Then("^Click on Calculate button(\\d+)$")
//	public void click_on_Calculate_button(int arg1) throws Throwable {
	
	@Then("^Click on calculate button$")
	public void click_on_calculate_button() throws Throwable {		
		driver.findElement(By.cssSelector("input.button-action.button.replace.blue")).click();
		System.out.println("Click on the calculate button");
		System.out.println("test4");


	}

	@Then("^Validate the Payment Amount$")
	public void validate_the_Payment_Amount() throws Throwable {
		String PaymentAmount = driver.findElement(By.name("payment")).getText();
		System.out.println("The payment amount is " + PaymentAmount);


	}

//	@Then("^Validate the total interest rate$")
//	public void validate_the_total_interest_rate() throws Throwable {
		
    @Then("^Validate the total interest$")
    public void validate_the_total_interest() throws Throwable {	
		String TotalInterestRate = driver.findElement(By.name("totalint")).getText();
		System.out.println("The total imterest rate is " + TotalInterestRate);
		System.out.println("test6");


	}
	@Then("^Close the browser(\\d+)$")
	public void close_the_browser(int arg1) throws Throwable {
		driver.close();
		System.out.println("test7");


	}
}
