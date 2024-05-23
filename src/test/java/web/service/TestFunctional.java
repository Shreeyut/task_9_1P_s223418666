package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFunctional {
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
	
		driver.navigate().to(
				"http://127.0.0.1:8080/login");
		sleep(2);
		
	
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("01-02-2000");
	
	
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		
	
		
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("q1"));
		
		driver.close();
	}@Test
	public void testLoginFail() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
	
		driver.navigate().to(
				"http://127.0.0.1:8080/login");
		sleep(2);
		
	
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass2");
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("01-02-2000");
	
	
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		 
	
		
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("login"));
		
		driver.close();
	}
	@Test
	public void testq1Success() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
	
		driver.navigate().to(
				"http://127.0.0.1:8080/q1");
		sleep(2);
		
	
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("1");

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("2");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("3");
	
	
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		
	
		
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("q2"));
		
		driver.close();
	}
	@Test
	public void testq2Success() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
	
		driver.navigate().to(
				"http://127.0.0.1:8080/q2");
		sleep(2);
		
	
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("2");

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("1");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("1");
	
	
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		
	
		
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("q3"));
		
		driver.close();
	}
	@Test
	public void testq3Success() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
	
		driver.navigate().to(
				"http://127.0.0.1:8080/q3");
		sleep(2);
		
	
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("2");

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("2");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("4");
	
	
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		
	
		
		boolean isTextPresent = driver.findElement(By.tagName("body")).getText().contains("All Correct");
		Assert.assertTrue(isTextPresent);
		
		driver.close();
	}
	@Test
	public void testq1MissingData() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
	
		driver.navigate().to(
				"http://127.0.0.1:8080/q1");
		sleep(2);
		
	
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("2");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("4");
	
	
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		
	
		
		boolean isTextPresent = driver.findElement(By.tagName("body")).getText().contains("Please provide valid inputs");
		Assert.assertTrue(isTextPresent);
		
		driver.close();
	}
	@Test
	public void testq2MissingData() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
	
		driver.navigate().to(
				"http://127.0.0.1:8080/q2");
		sleep(2);
		
	
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("2");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("4");
	
	
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		
	
		
		boolean isTextPresent = driver.findElement(By.tagName("body")).getText().contains("Please provide valid inputs");
		Assert.assertTrue(isTextPresent);
		
		driver.close();
	}
	@Test
	public void testq3MissingData() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/guest1/Downloads/chromedriver-win64(2)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
	
		driver.navigate().to(
				"http://127.0.0.1:8080/q3");
		sleep(2);
		
	
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("2");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("4");
	
	
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		
	
		
		boolean isTextPresent = driver.findElement(By.tagName("body")).getText().contains("Please provide valid inputs");
		Assert.assertTrue(isTextPresent);
		
		driver.close();
	}
}
