package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class PasswordValidation {

	static WebDriver browser;

	@Before
	public void setup() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\FirefoxDriver\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
		
		browser = new FirefoxDriver(options);
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
	}

	// undefined character
	@Test
	public void Tests1() 
	{
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("gosdv#");
		
		browser.findElement(By.name("validate")).click();
		
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		String expected = "Invalid Value";
		
		assertEquals(result, expected);
	}
	
	// password too short
	@Test
	public void Tests2() 
	{
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("goZr2");
		browser.findElement(By.name("validate")).click();
		
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		String expected = "Invalid Value";
		
		assertEquals(result, expected);
	}
	
	// password too long
	@Test
	public void Tests3() 
	{
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("goZr2**dsa");
		browser.findElement(By.name("validate")).click();
		
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		String expected = "Invalid Value";
		
		assertEquals(result, expected);
	}

	// password just right
	@Test
	public void Tests4() 
	{
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("goZr2*a");
		browser.findElement(By.name("validate")).click();
		
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		String expected = "Valid Value";
		
		assertEquals(result, expected);
	}
	
	// same character 7 times
	@Test
	public void Tests5() 
	{
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("*******");
		browser.findElement(By.name("validate")).click();
		
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		String expected = "Valid Value";
		
		assertEquals(result, expected);
	}
}
