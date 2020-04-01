package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pages.LoginPageAttribute;
import Pages.SwitchLanguagePageAttribute;
import TestCore.CoreFile;

public class SwitchLanguageCase extends CoreFile {
	
	@Test
	public static void SwichLanguage() {
		
		try {
			Thread.sleep(30000);
			System.out.println("Click on the Profile dropdown tab.");
			Reporter.log("Click on the Profile dropdown tab.");
			SwitchLanguagePageAttribute.ProfileDropDown().click();
			Reporter.log("Dropdown List is available on page.");
			
			Thread.sleep(10000);
			System.out.println("Get the language is selected on user profile.");
			Reporter.log("Get the language is selected on user profile.");
			String fontWeight= SwitchLanguagePageAttribute.EnglishText().getCssValue("font-weight");

			if(fontWeight.equals("700")){
				
				System.out.println("English language is selected on user profile.");
				Reporter.log("English language is selected on user profile.");
				
				System.out.println("Select the Japanease Language.");
				Reporter.log("Select the Japanease Language.");
				SwitchLanguagePageAttribute.JapaneseText().click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
			}else {
				System.out.println("Japanease language is selected on user profile.");
				Reporter.log("Japanease language is selected on user profile.");
				
				System.out.println("Select the English Language.");
				Reporter.log("Select the English Language.");
				SwitchLanguagePageAttribute.EnglishText().click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
			}
			
			Thread.sleep(10000);
			System.out.println("Click on the Profile dropdown tab.");
			Reporter.log("Click on the Profile dropdown tab.");
			SwitchLanguagePageAttribute.ProfileDropDown().click();
			
			Thread.sleep(2000);
			System.out.println("Dropdown List is available on page.");
			Reporter.log("Dropdown List is available on page.");
			
			String fontWeight1= SwitchLanguagePageAttribute.JapaneseText().getCssValue("font-weight");
			
			if(fontWeight1.equals("700")) {
				System.out.println("Japanease language is selected on user profile.");
				Reporter.log("Japanease language is selected on user profile.");
				
				System.out.println("Select the English Language.");
				Reporter.log("Select the English Language.");
				SwitchLanguagePageAttribute.EnglishText().click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
			}else {
				System.out.println("English language is selected on user profile.");
				Reporter.log("English language is selected on user profile.");
				
				System.out.println("Select the Japanease Language.");
				Reporter.log("Select the Japanease Language.");
				SwitchLanguagePageAttribute.JapaneseText().click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
			}
			
		}catch(Exception ex){
			System.out.println("User is not able to switch language. Error is: " + ex);
			Reporter.log("User is not able to switch language. Error is: " + ex);
			Assert.fail();
		}	
	}
}
