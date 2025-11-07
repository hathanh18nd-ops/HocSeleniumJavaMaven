package selenium_java.bai5_locators;

public class LocatorCRM {
    public static String url = "https://crm.anhtester.com/admin/authentication";
    //locator for login page
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String labelRememberMe = "//label[@for='remember']";
    public static String linkForgetPassword = "//a[normalize-space()='Forgot Password?']";
    public static String alerErrorMessage = "//div[contains(@class,'alert-danger')]";
    public static String alerErrorEmailRequired = "//div[normalize-space()='The Email Address field is required.']";
    public static String alerErrorPasswordRequired = "//div[normalize-space()='The Password field is required.']";
    //locator for Menu
    public static String listMenu = "//ul[@id='side-menu']/li[contains(@class,'menu-item')]";
    public static String menuDashboard = "//span[@class='menu-text' and normalize-space()='Dashboard']";
    public static String menuCustomers = "//span[@class='menu-text' and normalize-space()='Customers']";
    public static String menuSales = "//span[@class='menu-text' and normalize-space()='Sales']";
    public static String menuSubscriptions = "//span[@class='menu-text' and normalize-space()='Subscriptions']";
    public static String menuExpenses = "//span[@class='menu-text' and normalize-space()='Expenses']";
    public static String menuContracts = "//span[@class='menu-text' and normalize-space()='Contracts']";
    public static String menuProjects = "//span[@class='menu-text' and normalize-space()='Projects']";
    public static String menuTasks = "//span[@class='menu-text' and normalize-space()='Tasks']";
    public static String menuSupport = "//span[@class='menu-text' and normalize-space()='Support']";
    public static String menuLeads = "//span[@class='menu-text' and normalize-space()='Leads']";
    public static String menuEstimateRequest = "//span[@class='menu-text' and normalize-space()='Estimate Request']";
    public static String menuKnowledgeBase = "//span[@class='menu-text' and normalize-space()='Knowledge Base']";
    public static String menuUtilities = "//span[@class='menu-text' and normalize-space()='Utilities']";
    public static String menuReports = "//span[@class='menu-text' and normalize-space()='Reports']";
    //locator for Dashboard Page
    public static String dashboardOptions = "//div[normalize-space()='Dashboard Options']";
    public static String listCheckbox = "//div[@id='dashboard-options']//input[@type='checkbox']";
    //locator for Customers Page
    public static String buttonNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomer = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[normalize-space()='Contacts' and contains(@href,'all_contacts')]";
    public static String headerCustomerPage = "//span[normalize-space()='Customers Summary']";
    public static String inputSearchCustomer = "//div[@id='clients_filter']//input[@type='search']";
    public static String labelTotalCustomer = "//div[@id='wrapper']/descendant::span[normalize-space()='Total Customers']";
    public static String labelTotalCustomerNumber = "//div[@id='wrapper']/descendant::span[normalize-space()='Total Customers']/preceding-sibling::span";
    public static String labelActiveCustomer = "//div[@id='wrapper']/descendant::span[normalize-space()='Active Customers']";
    public static String labelActiveCustomerNumber = "//div[@id='wrapper']/descendant::span[normalize-space()='Active Customers']/preceding-sibling::span";
    public static String labelInactiveCustomer = "//div[@id='wrapper']/descendant::span[normalize-space()='Inactive Customers']";
    public static String labelInactiveCustomerNumber = "//div[@id='wrapper']/descendant::span[normalize-space()='Inactive Customers']/preceding-sibling::span";
    public static String labelActiveContacts = "//div[@id='wrapper']/descendant::span[normalize-space()='Active Contacts']";
    public static String labelActiveContactsNumber = "//div[@id='wrapper']/descendant::span[normalize-space()='Active Contacts']/preceding-sibling::span";
    public static String labelInactiveContacts = "//div[@id='wrapper']/descendant::span[normalize-space()='Inactive Contacts']";
    public static String labelInactiveContactsNumber = "//div[@id='wrapper']/descendant::span[normalize-space()='Inactive Contacts']/preceding-sibling::span";
    public static String labelContactsLoggedInToday = "//div[@id='wrapper']/descendant::span[@data-title='Contacts Logged In Today']";
    public static String labelContactsLoggedInTodayNumber = "//div[@id='wrapper']/descendant::span[@data-title='Contacts Logged In Today']/preceding-sibling::span";
    //locator for New Customers Page
    public static String inputCompany = "//input[@id='company']";
    public static String inputVAT = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroups = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroups = "//button[@data-id='groups_in[]']/following-sibling::div//input[@type='search']";
    public static String dropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//button[@data-id='default_currency']/following-sibling::div//input[@type='search']";
    public static String dropdownDefaultLanguage = "//button[@data-id='default_language']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']";
    public static String inputSearchCountry = "//button[@data-id='country']/following-sibling::div//input[@type='search']";
    public static String buttonSaveAndCreateContact = "//div[@id='profile-save-section']/button[normalize-space()='Save and create contact']";
    public static String buttonSave = "//div[@id='profile-save-section']/button[normalize-space()='Save']";// '/'==descendant::
}
