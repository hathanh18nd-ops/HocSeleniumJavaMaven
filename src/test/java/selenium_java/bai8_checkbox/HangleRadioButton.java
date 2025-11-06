package selenium_java.bai8_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bai5_locators.LocatorCRM;
import selenium_java.bai5_locators.bt_locators.BTLocatorCRMLeads;

import java.time.Duration;
import java.util.List;

public class HangleRadioButton {
    public static void handleRadio() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        driver.findElement(By.xpath(LocatorCRM.menuSales)).click();
        driver.findElement(By.xpath("//span[normalize-space()='Proposals']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Proposal']")).click();
//        boolean checkRadio = driver.findElement(By.xpath("//input[@type='radio' and @data-text='Qty']")).isSelected();
        boolean checkRadio = driver.findElement(By.xpath("//input[@type='radio' and @data-text='Hours']")).isSelected();
        System.out.println("checkRadio :" + checkRadio);
//        driver.findElement(By.xpath("//input[@type='radio' and @data-text='Qty']")).click();
        driver.findElement(By.xpath("//input[@type='radio' and @data-text='Hours']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    public static void handleListRadio() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        driver.findElement(By.xpath(LocatorCRM.menuSales)).click();
        driver.findElement(By.xpath("//span[normalize-space()='Proposals']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Proposal']")).click();
        List<WebElement> radioButtons = driver.findElements(By.xpath("//span[normalize-space()='Show quantity as:']/following-sibling::div/input"));
        System.out.println("Tong so radio: " + radioButtons.size());
        int check1 = 0;
        int check2 = 0;
        for (int i=0; i < radioButtons.size(); i++) {
            if(radioButtons.get(i).isSelected()) {
                System.out.println(i + 1 + " is selected");
                check1++;
            }else {
                System.out.println(i + 1 + " is not selected");
                check2++;
            }
        }
        System.out.println("Total radio is selected: "+check1);
        System.out.println("Total radio is not selected: "+check2);
//        boolean checkRadio = driver.findElement(By.xpath("//input[@type='radio' and @data-text='Qty']")).isSelected();
//        boolean checkRadio = driver.findElement(By.xpath("//input[@type='radio' and @data-text='Hours']")).isSelected();
//        System.out.println("checkRadio :" + checkRadio);
//        driver.findElement(By.xpath("//input[@type='radio' and @data-text='Qty']")).click();
//        driver.findElement(By.xpath("//input[@type='radio' and @data-text='Hours']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
//        handleRadio();
        handleListRadio();
    }
}
