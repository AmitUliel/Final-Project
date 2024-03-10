package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.lang.System;

public class Selenium_calculator {

	static WebDriver browser;

	@Before
	public void setup() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\FirefoxDriver\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
		
		browser = new FirefoxDriver(options);
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/calculator.html";
		browser.get(url);
	}

	// add
	@Test
	public void add1() 
	{
		browser.findElement(By.id("button07")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button03")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "10";
		assertEquals(Expected, result);
	}
	
	@Test
	public void add2() 
	{
		browser.findElement(By.id("buttonallclear")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button02")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "-2";
		assertEquals(Expected, result);
	}
	
	// minus
	@Test
	public void minus1() 
	{
		browser.findElement(By.id("button06")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button02")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "4";
		assertEquals(Expected, result);
	}
	
	@Test
	public void minus2() 
	{
		browser.findElement(By.id("buttonallclear")).click();	
		browser.findElement(By.id("buttonminus")).click();	
		browser.findElement(By.id("button03")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button02")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "-5";
		assertEquals(Expected, result);
	}
	
	// multiply
	@Test
	public void multiply1() 
	{
		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button06")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "54";
		assertEquals(Expected, result);
	}
	
	@Test
	public void multiply2() 
	{
		browser.findElement(By.id("buttonallclear")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button05")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "-45";
		assertEquals(Expected, result);
	}
	
	// divide
	@Test
	public void divide1() 
	{
		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("button00")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "10";
		assertEquals(Expected, result);
	}
	
	@Test
	public void divide2() 
	{
		browser.findElement(By.id("buttonallclear")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button03")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "-30";
		assertEquals(Expected, result);
	}
	
	// divide by zero
	@Test
	public void divideByZero() 
	{
		browser.findElement(By.id("button03")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button00")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "Infinity";
		assertEquals(Expected, result);
	}
	
}



