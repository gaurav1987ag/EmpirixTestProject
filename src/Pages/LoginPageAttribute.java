package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestCore.CoreFile;

public class LoginPageAttribute extends CoreFile {
	
	public static WebElement Username() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/form/fieldset/div[1]/input"));
	}
	public static WebElement Password() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/form/fieldset/div[2]/input"));
	}
	public static WebElement SignInButton() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/form/fieldset/div[4]/input"));
	}
	public static WebElement VerifyText() {
		return driver.findElement(By.xpath("//*[@id=\"logo\"]/span[2]"));
	}
}
