
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumTest {

	public static void main(String[] args) {

		// Initialize Firefox Driver
		System.setProperty("webdriver.gecko.driver", "E:/Selenium Files/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver frdriver = new FirefoxDriver();

		// Initialize Chrome Driver
		System.setProperty("webdriver.chrome.driver", "E:/Selenium Files/chromedriver_win32/chromedriver.exe");
		WebDriver chdriver = new ChromeDriver();

		// Initialize IE
		System.setProperty("webdriver.ie.driver", "E:/Selenium Files/IEDriverServer_x64_3.4.0/IEDriverServer.exe");

		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);

		WebDriver iedriver = new InternetExplorerDriver(caps);

		// Code for Firefox
		frdriver.get("http://newtours.demoaut.com/");
		frdriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("demo");
		frdriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("demo");
		frdriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"))
				.click();

		frdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		frdriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
				.click();

		// Code for Chorome
		chdriver.get("http://newtours.demoaut.com/");
		chdriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("demo");
		chdriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("demo");
		chdriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"))
				.click();
		chdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chdriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
				.click();

		// Code for IE
		iedriver.get("http://newtours.demoaut.com/");
		iedriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("demo");
		iedriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("demo");
		iedriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"))
				.click();
		iedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iedriver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
				.click();

	}

}
