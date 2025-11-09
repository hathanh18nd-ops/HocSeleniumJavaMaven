package selenium_java.thuchanhcrm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import selenium_java.bai5_locators.LocatorCRM;
import selenium_java.common.BaseTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddNewCustomer extends BaseTest {
    public static void loginCRM() {
        driver.get(LocatorCRM.url);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();
    }

    public static void openAddNewCustomerPage() {
//        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
//        driver.findElement(By.xpath(LocatorCRM.buttonNewCustomer)).click();
    }

    public static void addNewCustomer(String customerName) throws InterruptedException {
        driver.findElement(By.xpath(LocatorCRM.buttonNewCustomer)).click();
        driver.findElement(By.xpath(LocatorCRM.inputCompany)).sendKeys(customerName);
        driver.findElement(By.xpath(LocatorCRM.inputVAT)).sendKeys("12");
        driver.findElement(By.xpath(LocatorCRM.inputPhone)).sendKeys("0818888888");
        driver.findElement(By.xpath(LocatorCRM.inputWebsite)).sendKeys("hapttest.com");
        driver.findElement(By.xpath(LocatorCRM.dropdownGroups)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputSearchGroups)).sendKeys("vip", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.dropdownGroups)).click();
        driver.findElement(By.xpath(LocatorCRM.dropdownCurrency)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputSearchCurrency)).sendKeys("usd", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.dropdownDefaultLanguage)).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath(LocatorCRM.clickValueDefaultLanguage)).click();
//        driver.findElement(By.xpath(LocatorCRM.selectValueLanguage("Czech"))).click();
        driver.findElement(By.xpath(String.format(LocatorCRM.clickValueDefaultLanguageDynamic, "English"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputAddress)).sendKeys("Hanoi, Vietnam");
        driver.findElement(By.xpath(LocatorCRM.inputCity)).sendKeys("Hanoi");
        driver.findElement(By.xpath(LocatorCRM.inputState)).sendKeys("Ba Dinh");
        driver.findElement(By.xpath(LocatorCRM.inputZipCode)).sendKeys("100000");
        driver.findElement(By.xpath(LocatorCRM.dropdownCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputSearchCountry)).sendKeys("viet", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.buttonSave)).click();
        Thread.sleep(2000);
    }

    public static void checkResults(String customerName) throws InterruptedException {
        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        int numberTotalCustomerS = Integer.parseInt(driver.findElement(By.xpath(LocatorCRM.labelTotalCustomerNumber)).getText());
        driver.findElement(By.xpath(LocatorCRM.inputSearchCustomer)).clear();
        driver.findElement(By.xpath(LocatorCRM.inputSearchCustomer)).sendKeys(customerName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(LocatorCRM.valueRowColume)).getText();
        System.out.println("First row colume company name: " + firsRowColume);
    }

    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCRM();
        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        int numberTotalCustomerF = Integer.parseInt(driver.findElement(By.xpath(LocatorCRM.labelTotalCustomerNumber)).getText());
//        openAddNewCustomerPage();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formattedDateTime = now.format(formatter);
        addNewCustomer("Hapt Test Company " + formattedDateTime);//Hapt Test Company 20251108102628, Hapt Test Company
        checkResults("Hapt Test Company " + formattedDateTime);
        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        int numberTotalCustomerS = Integer.parseInt(driver.findElement(By.xpath(LocatorCRM.labelTotalCustomerNumber)).getText());
        boolean check = (numberTotalCustomerS == numberTotalCustomerF + 1);
        System.out.println("Check add new customer: " + check);
        if (numberTotalCustomerS == numberTotalCustomerF + 1) {
            System.out.println("Add new customer successfully");
        } else {
            System.out.println("Add new customer failed");
        }
        closeDriver();

    }
}
