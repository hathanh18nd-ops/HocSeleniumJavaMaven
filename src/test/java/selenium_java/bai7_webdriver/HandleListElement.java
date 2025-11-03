package selenium_java.bai7_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        //get all element menu
        List<WebElement> Listmenu = driver.findElements(By.xpath("//ul[@id='side-menu']/li[contains(@class,'menu-item')]"));
        System.out.println("Số lượng menu: " + Listmenu.size());
        for (int i = 0; i < Listmenu.size(); i++) {
            System.out.println("Menu thứ " + (i + 1) + ": " + Listmenu.get(i).getText());
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
