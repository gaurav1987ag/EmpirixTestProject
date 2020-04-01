package TestCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pages.LoginPageAttribute;
import Pages.RequiredTabPageAttribute;
import Pages.SwitchLanguagePageAttribute;
import TestCore.CoreFile;

public class RequiredTabAccessCase extends CoreFile {
	
	@Test
	public static void SwichLanguage() {
		
		try {
			Thread.sleep(3000);
			System.out.println("Click on the Dasboard Tab.");
			Reporter.log("Click on the Dasboard Tab.");
			RequiredTabPageAttribute.DashboardTab().click();
			System.out.println("Verify the URL of Dashboard Tab.");
			Reporter.log("Verify the URL of Dashboard Tab.");
			Thread.sleep(3000);
			String dasboardURL=driver.getCurrentUrl();
			
			if(dasboardURL.equals("https://services.empirix.com/dashboard")) {
				Reporter.log("Dasboard Tab is accessible.");
				System.out.println("Dasboard Tab is accessible.");
			}else {
				Reporter.log("Dasboard Tab is not accessible.");
				System.out.println("Dasboard Tab is not accessible.");
				Assert.fail();
			}
			
			Thread.sleep(3000);
			System.out.println("Click on the Alerts Tab.");
			Reporter.log("Click on the Alerts Tab.");
			RequiredTabPageAttribute.AlertsTab().click();
			System.out.println("Verify the URL of Alerts Tab.");
			Reporter.log("Verify the URL of Alerts Tab.");
			Thread.sleep(3000);
			String AlertsURL=driver.getCurrentUrl();
			
			if(AlertsURL.equals("https://services.empirix.com/alerts")) {
				Reporter.log("Alerts Tab is accessible.");
				System.out.println("Alerts Tab is accessible.");
			}else {
				Reporter.log("Alert Tab is not accessible.");
				System.out.println("Alert Tab is not accessible.");
				Assert.fail();
			}
			
			Thread.sleep(3000);
			System.out.println("Click on the Tests Tab.");
			Reporter.log("Click on the Tests Tab.");
			RequiredTabPageAttribute.TestsTab().click();
			System.out.println("Verify the URL of Tests Tab.");
			Reporter.log("Verify the URL of Tests Tab.");
			Thread.sleep(3000);
			String TestsURL=driver.getCurrentUrl();
			
			if(TestsURL.equals("https://services.empirix.com/tests")) {
				Reporter.log("Tests Tab is accessible.");
				System.out.println("Tests Tab is accessible.");
			}else {
				Reporter.log("Tests Tab is not accessible.");
				System.out.println("Tests Tab is not accessible.");
				Assert.fail();
			}
			
			Thread.sleep(3000);
			System.out.println("Click on the Variables Tab.");
			Reporter.log("Click on the Variables Tab.");
			RequiredTabPageAttribute.VariablesTab().click();
			System.out.println("Verify the URL of Variables Tab.");
			Reporter.log("Verify the URL of Variables Tab.");
			Thread.sleep(3000);
			String VariablesURL=driver.getCurrentUrl();
			
			if(VariablesURL.equals("https://services.empirix.com/variables")) {
				Reporter.log("Variables Tab is accessible.");
				System.out.println("Variables Tab is accessible.");
			}else {
				Reporter.log("Variables Tab is not accessible.");
				System.out.println("Variables Tab is not accessible.");
				Assert.fail();
			}
			
			Thread.sleep(3000);
			System.out.println("Click on the Notifications Tab.");
			Reporter.log("Click on the Notifications Tab.");
			RequiredTabPageAttribute.NotificationTab().click();
			System.out.println("Verify the URL of Notifications Tab.");
			Reporter.log("Verify the URL of Notifications Tab.");
			Thread.sleep(3000);
			String NotificationsURL=driver.getCurrentUrl();
			
			if(NotificationsURL.equals("https://services.empirix.com/notifi")) {
				Reporter.log("Notifications Tab is accessible.");
				System.out.println("Notifications Tab is accessible.");
			}else {
				Reporter.log("Notifications Tab is not accessible.");
				System.out.println("Notifications Tab is not accessible.");
				Assert.fail();
			}
			
		}catch(Exception ex){
			System.out.println("User is not able to access the tabs. Error is:  " + ex);
			Reporter.log("User is not able to access the tabs. Error is:  " + ex);
			Assert.fail();
			
		}		
	}
}
