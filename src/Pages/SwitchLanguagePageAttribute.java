package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestCore.CoreFile;

public class SwitchLanguagePageAttribute extends CoreFile {
	
	public static WebElement ProfileDropDown() {
		return driver.findElement(By.className("caret"));
	}
	public static WebElement JapaneseText() {
		return driver.findElement(By.xpath("//*[text()='Japanese']"));
	}
	public static WebElement EnglishText() {
		return driver.findElement(By.xpath("//*[text()='English']"));
	}
}
