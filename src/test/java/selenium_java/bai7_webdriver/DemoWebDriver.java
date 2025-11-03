package selenium_java.bai7_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bai5_locators.bt_locators.BTLocatorCRMLeads;

import java.time.Duration;

public class DemoWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);
        driver.quit();
    }
}
