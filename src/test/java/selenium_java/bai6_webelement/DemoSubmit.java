package selenium_java.bai6_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bai5_locators.bt_locators.BTLocatorCRMLeads;

import java.time.Duration;

public class DemoSubmit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

        //isdplayed
//        boolean checkedLoginPage = driver.findElement(By.xpath(BTLocatorCRMLeads.headerLoginPage)).isDisplayed();
//        System.out.println("Login page is displayed: " + checkedLoginPage);
        //isEnabled https://angular-reactive-forms-zvzqvd.stackblitz.io/, button bubmit
//        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
//        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
//        boolean checkButtonSubmitEnabled = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
//        System.out.println("Button Submit is enabled: " + checkButtonSubmitEnabled);
//        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
//        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).submit();
//        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
