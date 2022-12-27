package AdvSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///E:/Qspiders/Selenium/UploadFile.html");
		WebElement ele = driver.findElement(By.id("f1"));
		ele.sendKeys("C:\\Users\\Deepa\\Desktop\\testcases.png");
	}

}
