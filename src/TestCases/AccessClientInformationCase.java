package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pages.AccessClientInformationPageAttribute;
import Pages.LoginPageAttribute;
import Pages.SwitchLanguagePageAttribute;
import TestCore.CoreFile;

public class AccessClientInformationCase extends CoreFile {
	
	@Test
	public static void SwichLanguage() {
		
		try {
			Thread.sleep(30000);
			System.out.println("Click on the Profile dropdown tab.");
			Reporter.log("Click on the Profile dropdown tab.");
			SwitchLanguagePageAttribute.ProfileDropDown().click();
			Reporter.log("Dropdown List is available on page.");
			
			Thread.sleep(5000);
			System.out.println("Click on the Client tab in profile.");
			Reporter.log("Click on the Client tab in profile.");
			AccessClientInformationPageAttribute.ClientLinkDropdown().click();
			
			Thread.sleep(10000);
			System.out.println("Get the Client Name on client information tab.");
			Reporter.log("Get the Client Name nn client information tab.");
			String clientName= AccessClientInformationPageAttribute.ClientName().getText();
			
			Thread.sleep(3000);
			System.out.println("Verify the Client Name is available on information tab.");
			Reporter.log("Verify the Client Name is available on information tab.");
			if(clientName.equals("Empirix_QA_Training")) {

				System.out.println("We are getting client information on information tab and client name is: "+clientName);
				Reporter.log("We are getting client information on information tab and client name is: "+clientName);
				
			}else {
				System.out.println("Client Name is not available on information tab.");
				Reporter.log("Client Name is not available on information tab.");
				Assert.fail();
			}			
			
			Thread.sleep(3000);
			System.out.println("Logout the profile.");
			Reporter.log("Logout the profile.");
			SwitchLanguagePageAttribute.ProfileDropDown().click();
			Thread.sleep(2000);
			AccessClientInformationPageAttribute.LogOutProfile().click();
					
		}catch(Exception ex){
			System.out.println("We are not getting client information on information tab. Error is: " + ex);
			Reporter.log("We are not getting client information on information tab. Error is: " + ex);
			Assert.fail();
			
		}	
	}
}
