package TestExecution;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class jobSearchParamDT1 {
	
	WebDriver driver;
	
	@Given("^that I navigates to https://jobserve\\.co\\.uk$")
	public void that_I_navigates_to_https_jobserve_co_uk() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.jobserve.com/gb/en/Job-Search/");
		System.out.println("Start the browser");      
		System.out.println("Browser check");

	} 
	@When("^I enter the job \"([^\"]*)\" and job \"([^\"]*)\" \\. Click search button$")
	public void i_enter_the_job_and_job_Click_search_button(String title, String location) throws Throwable {
		 driver.findElement(By.id("txtKey")).clear();
		 driver.findElement(By.id("txtKey")).sendKeys(title);
		 driver.findElement(By.id("txtLoc")).clear();
		 driver.findElement(By.id("txtLoc")).sendKeys(location);
		 driver.findElement(By.id("btnSearch")).click();
		 System.out.println("Enter search criteris");

	}
	@When("^I should see the number of the jobs find  and the job title$")
	public void i_should_see_the_number_of_the_jobs_find_and_the_job_title() throws Throwable {
		
		driver.findElement(By.cssSelector("span.resultnumber")).getText();
	    try  { 
	    	String SearchResults = driver.findElement(By.cssSelector("span.resultnumber")).getText();
	    //	String SearchResults = driver.findElement(By.cssSelector("jobshead")).getText();
	    	System.out.println(" The search count returned is " + SearchResults);
	    	System.out.println("Pass");
	    }catch (Exception e ){
	    	System.out.println("Object does not exists");
	    	System.out.println("Fail"); 

	    }
		driver.findElement(By.id("td_jobpositionlink")).getText();
	    try  { 
	    	String SearchResults = driver.findElement(By.id("td_jobpositionlink")).getText();
	    	System.out.println(" The job title found is " + SearchResults);
	    	System.out.println("Pass");
	    }catch (Exception e ){
	    	System.out.println("Object does not exists");
	    	System.out.println("Fail"); 
	    }  
	    	    
	    driver.findElement(By.id("resultrole")).getText();
	    try {    	
			 String jobTitle = driver.findElement(By.id("resultRole")).getText();
			 System.out.println("The job title found is " + jobTitle);
			 System.out.println("Pass");	    	
	    }catch (Exception e) { 	
	    	System.out.println("The job title test is not present");
			System.out.println("Pass");
			
	    } 
		 System.out.println("To validate the search result result");
	   
	}
	@When("^close the browser(\\d+)$")
	public void close_the_browser(int arg1) throws Throwable {
		driver.close();
		System.out.println("Close the browser");
	  
	}
}
