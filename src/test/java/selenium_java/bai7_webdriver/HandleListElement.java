package selenium_java.bai7_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bai5_locators.LocatorCRM;
import selenium_java.bai5_locators.bt_locators.BTLocatorCRMLeads;

import java.time.Duration;
import java.util.List;

public class HandleListElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        System.out.println("Trước login "+driver.getCurrentUrl());
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        System.out.println("Sau login "+driver.getCurrentUrl());
        //get all element menu
        List<WebElement> listmenu = driver.findElements(By.xpath(LocatorCRM.listMenu));
        System.out.println("Số lượng menu: " + listmenu.size());
        for (int i = 0; i < listmenu.size(); i++) {
            System.out.println("Menu thứ " + (i + 1) + ": " + listmenu.get(i).getText());
        }
        System.out.println(listmenu.get(0).getText().equals("Dashboard"));
        System.out.println(listmenu.get(1).getText().equals("Customers"));
        Thread.sleep(2000);
        driver.quit();
    }
}
