package Selleniun_start_projects.Selleniun_start_projects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Before;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.lang.Thread;
import org.openqa.selenium.support.ui.Select;

public class TriangleType {

	static WebDriver browser;

	@Before
	public void setup() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\FirefoxDriver\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
		
		browser = new FirefoxDriver(options);
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
	}

	// not a triangle -> c > a + b
	// a == b
	@Test
	public void Tests1() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("1");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("1");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("3");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Error: Not a Triangle";
		assertEquals(result, expected);
	}
	
	// not a triangle -> a > b + c
	// b == c
	@Test
	public void Tests2() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("7");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("3");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("3");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Error: Not a Triangle";
		assertEquals(result, expected);
	}
	
	// not a triangle -> b > a + c
	// a == c
	@Test
	public void Tests3() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("2");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("2");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Error: Not a Triangle";
		assertEquals(result, expected);
	}
	
	// not a triangle
	// a != c | a != b | b != c 
	@Test
	public void Tests4() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("1");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("7");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Error: Not a Triangle";
		assertEquals(result, expected);
	}
	
	// scalene
	@Test
	public void Tests5() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("4");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("6");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Scalene";
		assertEquals(result, expected);
	}
	
	// Isosceles
	// b == c
	@Test
	public void Tests6() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("3");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("3");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Isosceles";
		assertEquals(result, expected);
	}
	
	// Isosceles
	// a == c
	@Test
	public void Tests7() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("8");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("9");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("8");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Isosceles";
		assertEquals(result, expected);
	}
	
	// Isosceles
	// a == b
	@Test
	public void Tests8() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("3");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("3");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("5");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Isosceles";
		assertEquals(result, expected);
	}
	
	// Isosceles
	// a == b
	@Test
	public void Tests9() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("10");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("10");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("10");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Equilateral";
		assertEquals(result, expected);
	}
	
	// side a not a number
	@Test
	public void Tests10() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("g");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("3");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("4");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Error: Side 1 is not a Number";
		assertEquals(result, expected);
	}
	
	// side b not a number
	@Test
	public void Tests11() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("4");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("h");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("4");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Error: Side 2 is not a Number";
		assertEquals(result, expected);
	}
	
	// side c not a number
	@Test
	public void Tests12() 
	{
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("4");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("n");
		
		browser.findElement(By.id("identify-triangle-action")).click();
		
		String result = browser.findElement(By.id("triangle-type")).getText();
		String expected = "Error: Side 3 is not a Number";
		assertEquals(result, expected);
	}
	
	

}