package selenium_java.bai7_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bai5_locators.bt_locators.BTLocatorCRMLeads;

import java.time.Duration;
import java.util.List;

public class HandleNewWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
//        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
//        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
//        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        //get all element menu
//        List<WebElement> listmenu = driver.findElements(By.xpath("//ul[@id='side-menu']/li[contains(@class,'menu-item')]"));
//        System.out.println("Số lượng menu: " + listmenu.size());
//        for (int i = 0; i < listmenu.size(); i++) {
//            System.out.println("Menu thứ " + (i + 1) + ": " + listmenu.get(i).getText());
//        }
//        System.out.println(listmenu.get(0).getText().equals("Dashboard"));
//        System.out.println(listmenu.get(1).getText().equals("Customers"));
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://google.com");
        driver.switchTo().newWindow(WindowType.WINDOW);
        //Thread.sleep(2000);
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);
        driver.quit();
    }
}
