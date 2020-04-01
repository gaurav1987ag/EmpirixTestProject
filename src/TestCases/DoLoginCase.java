package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pages.LoginPageAttribute;
import Pages.RequiredTabPageAttribute;
import TestCore.CoreFile;

public class DoLoginCase extends CoreFile {
	
	@Test
	public static void Login() {
		
		try {
		    driver.navigate().refresh();
			Thread.sleep(20000);
			System.out.println("Enter the Username.");
			Reporter.log("Enter the Username.");
			LoginPageAttribute.Username().sendKeys("QA_traininguser12");
			
			Thread.sleep(2000);
			System.out.println("Enter the Password.");
			Reporter.log("Enter the Password.");
			LoginPageAttribute.Password().sendKeys("Empirix!");
			
			Thread.sleep(2000);
			System.out.println("Click on Sign In button.");
			Reporter.log("Click on the Sign In button.");
			LoginPageAttribute.SignInButton().click();
			
			/*Thread.sleep(5000);
			driver.get(driver.getCurrentUrl());
			System.out.println("Verify user is able to do login.");
			Reporter.log("Verify user is able to do login.");

			if(driver.getCurrentUrl().equals("https://services.empirix.com")) {
				System.out.println("User is able to do login.");
				Reporter.log("User is able to do login.");
			}else {
				System.out.println("User is not able to do login.");
				Reporter.log("User is not able to do login.");
				Assert.fail();
			}*/
			
		}catch(Exception ex){
			System.out.println("User is not able to do login. Error is: " + ex);
			Assert.fail();
			
		}
	}
}
