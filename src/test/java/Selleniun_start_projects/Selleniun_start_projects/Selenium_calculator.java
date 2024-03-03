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
	public void Tests1() 
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
	
	// minus
	@Test
	public void Tests2() 
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
	
	// multiply
	@Test
	public void Tests3() 
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
	
	// divide
	@Test
	public void Tests4() 
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
	
	// divide by zero
	@Test
	public void Tests5() 
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
	
	// equals negative number
	@Test 
	public void Tests6() 
	{
		browser.findElement(By.id("button03")).click();
		browser.findElement(By.id("buttonminus")).click();
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
		String Expected = "-3";
		assertEquals(Expected, result);
	}
	
	// decimal numbers add
	@Test
	public void Tests7() 
	{
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondot")).click();
		browser.findElement(By.id("button02")).click();
		browser.findElement(By.id("button03")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondot")).click();
		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("button07")).click();
		
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
		String Expected = "0.4";
		assertEquals(Expected, result);
	}
	
	// clear entry
	@Test
	public void Tests8() 
	{
		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button07")).click();
		browser.findElement(By.id("buttonclearentry")).click();
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
		String Expected = "10";
		assertEquals(Expected, result);
	}
	
	// all clear
	@Test
	public void Tests9() 
	{
		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button07")).click();
		browser.findElement(By.id("buttonallclear")).click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "";
		assertEquals(Expected, result);
	}
	
	// memory recall
	@Test
	public void Tests10() 
	{
		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttonmemoryplus")).click();
		browser.findElement(By.id("buttonallclear")).click();	
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}
		
		browser.findElement(By.id("buttonmemoryrecall")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		String Expected = "4";
		assertEquals(Expected, result);
	}
	
	// memory recall plus another number to memory -> checking memory calculation
		@Test
		public void Tests11() 
		{
			browser.findElement(By.id("button08")).click();
			browser.findElement(By.id("buttonmemoryplus")).click();
			browser.findElement(By.id("buttonallclear")).click();
			browser.findElement(By.id("button04")).click();
			browser.findElement(By.id("buttonmemoryplus")).click();
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				Thread.currentThread().interrupt();
			}
			
			browser.findElement(By.id("buttonmemoryrecall")).click();
			
			String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
			String Expected = "12";
			assertEquals(Expected, result);
		}
}



