package selenium_java.bai6_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bai5_locators.LocatorCRM;
import selenium_java.bai5_locators.bt_locators.BTLocatorCRMLeads;

import java.time.Duration;

public class DemoGetText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
        //get attribute value
        String inputEmailValue = driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).getAttribute("value");
        System.out.println("Attribute email value: " + inputEmailValue);
        String inputPasswordlValue = driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).getAttribute("value");
        System.out.println("Attribute password value: " + inputPasswordlValue);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        String inputPasswordlValues = driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).getAttribute("value");
        System.out.println("Attribute password value: " + inputPasswordlValues);
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
//        System.out.println(driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).getSize().height);
//        System.out.println(driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).getSize().width);
//        System.out.println(driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).getLocation().x);
//        System.out.println(driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).getLocation().y);
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        System.out.println("header Customers: " + driver.findElement(By.xpath(LocatorCRM.headerCustomerPage)).getText());
        String headerCustomersText = driver.findElement(By.xpath(LocatorCRM.headerCustomerPage)).getText();
        if (headerCustomersText.equals("Customers Summary")){
            System.out.println("Header Customers is correct");
        } else {
            System.out.println("Header Customers is incorrect");
        }
        System.out.println("get text: "+driver.findElement(By.xpath(LocatorCRM.labelActiveCustomerNumber)).getText());
        System.out.println("get tagname: "+driver.findElement(By.xpath(LocatorCRM.labelActiveCustomerNumber)).getTagName());
        System.out.println("get Css Value: "+driver.findElement(By.xpath(LocatorCRM.labelActiveCustomerNumber)).getCssValue("color"));
        System.out.println("get Css Value: "+driver.findElement(By.xpath(LocatorCRM.labelActiveCustomerNumber)).getCssValue("font-family"));
        System.out.println("get Css Value: "+driver.findElement(By.xpath(LocatorCRM.labelActiveCustomerNumber)).getCssValue("font-size"));
        Thread.sleep(2000);
        driver.quit();

    }
}
