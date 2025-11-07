package selenium_java.bai8_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandleDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/select-menu");
        Select select = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
//        select.selectByVisibleText("Black");
//        select.selectByValue("5");
        select.selectByIndex(5);
        Thread.sleep(2000);
        driver.quit();
    }
}
