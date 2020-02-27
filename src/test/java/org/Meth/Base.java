package org.Meth;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	protected static WebDriver driver;

	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHIVA\\Desktop\\core java\\BlueAir\\driver\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void lauchUrl(String url) {
		driver.get(url);
	}

	public void send(WebElement e, String s) {
		e.sendKeys(s);
	}

	public void click(WebElement e) {
		e.click();
	}

	public void js(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
	}

	protected void scroll(int scroll) throws AWTException {
		Robot r = new Robot();
		r.mouseWheel(scroll);
	}

	public String gettext(WebElement e) {
		return e.getText();
	}

	public boolean isDis(WebElement e) {
		// return e.isEnabled();
		return e.isDisplayed();
	}

	public boolean asse(WebElement e) {
		Assert.assertEquals("wsxft0987", e.getAttribute("value"));
		return true;
	}

	public boolean issel(WebElement e) {
		return e.isSelected();
	}

}
