package selenium_java.bai8_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bai5_locators.bt_locators.BTLocatorCRMLeads;

import java.time.Duration;
import java.util.List;

public class HandleCheckbox {
    public static void handleCheckbox() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        driver.findElement(By.xpath("//div[normalize-space()='Dashboard Options']")).click();
        List<WebElement> checkbox = driver.findElements(By.xpath("//div[@id='dashboard-options']//input[@type='checkbox']"));
        System.out.println("Tong so phan tu: " + checkbox.size());
//        for (int i = 0; i < checkbox.size(); i++) {
//            if (checkbox.get(i).isSelected()) {
//                System.out.println(i + 1 + " is selected");
//            } else {
//                System.out.println(i + 1 + " is not selected");
//                checkbox.get(i).click();
//                System.out.println(i + 1 + " is now selected");
//            }
//        }
        boolean check = false;
        for (int i = 0; i < checkbox.size(); i++) {
            if (checkbox.get(i).isSelected()) {
                System.out.println(i + 1 + " is selected");
                check = true;
            } else {
                System.out.println(i + 1 + " is not selected");
                check = false;
                break;

//                checkbox.get(i).click();
//                System.out.println(i + 1 + " is now selected");
            }
        }
        Thread.sleep(1000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        handleCheckbox();
    }
}
