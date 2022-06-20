
package TestExecution;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchMyProduct {
	
	WebDriver driver;
	
	@Before
	@Given("^that user is on https://ebay\\.com$")
	public void that_user_is_on_https_ebay_com() throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ebay.com");
		

	}
     @Test
	@When("^User enter the search keyword and click on submit$")
	public void user_enter_the_search_keyword_and_click_on_submit(DataTable testData) throws Throwable {

		Map<String, String> testDataAsMap = testData.asMap(String.class, String.class);	
		
	
 //   	driver.findElement(By.name("_nkw")).clear();
		driver.findElement(By.name("_nkw")).sendKeys(testDataAsMap.get("Product Name"));
//		driver.findElement(By.id("gh-ac")).sendKeys(testDataAsMap.get("item Name2"));
		System.out.println(testDataAsMap.toString());
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		driver.findElement(By.id("gh-btn")).click();
	}

	@Then("^application should return the products including the count$")
	public void application_should_return_the_products_including_the_count() throws Throwable {
		driver.findElement(By.cssSelector("h1.srp-controls__count-heading")).getText(); 
		
		try {
		String ProductCount = driver.findElement(By.cssSelector("")).getText();
		System.out.println("Product Search result found is " + ProductCount);
		
	 	}catch(Exception exp){
		System.out.println("Application is unable to find the locator, therefore failed the test");
		  throw exp;
		  
	 	    }
		/*		
//       * Two dimensional data table script				
		List<String> testDataAsList = testData.asList(String.class);
		driver.findElement(By.id("gh-ac")).clear();
		driver.findElement(By.id("gh-ac")).sendKeys(testDataAsList.get(0));
		driver.findElement(By.id("gh-ac")).sendKeys(testDataAsList.get(1));
		driver.findElement(By.id("gh-btn")).click();
*/		
		 try {
		      String searchResult = driver.findElement(By.cssSelector("srp-controls__count-heading")).getText();
		      System.out.println(" Search ressult count found is" + searchResult );
		      System.out.println(" Passed the text");
		    } catch (Exception e) {
		      System.out.println(" Failed the test as the object does not exist");
		      
		    } 		
	}
    @After
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}

}
