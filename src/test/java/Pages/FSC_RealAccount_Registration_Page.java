package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FSC_RealAccount_Registration_Page extends BasePage {

    public FSC_RealAccount_Registration_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href='#Subscribe']")
    WebElement getStartedNowBtn;
    @FindBy(xpath = "//input[@name='FirstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@name='LastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@name='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@name='PhoneCountryCode']")
    WebElement countryCode;
    @FindBy(xpath = "//input[@name='Phone']")
    WebElement phone;
    @FindBy(xpath = "//select[@name='Country']")
    WebElement country;
    @FindBy(xpath = "//input[@name='Address']")
    WebElement address;
    @FindBy(xpath = "//input[@name='Address']//..//div//ul//li[2]")
    WebElement addressData;
    //FSC, cysec
    @FindBy(xpath = "//select[@name='CountryOfCitizenship']")
    WebElement countyOfCitizenship;
    @FindBy(xpath = "//select[@name='PlaceOfBirth']")
    WebElement placeOfBirth;
    @FindBy(xpath = "//select[@name='Currency']")
    WebElement currency;
    @FindBy(xpath = "//input[@name='Password']")
    WebElement password;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthday;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfBirthdayMonth;
    @FindBy(xpath = "//select[@name='DateOfBirth']")
    WebElement dateOfBirthYear;
    @FindBy(xpath = "//select[@name='EmploymentStatus']")
    WebElement employmentStatus;
    @FindBy(xpath = "//select[@name='ProfessionDescription']")
    WebElement profession;
    @FindBy(xpath = "//select[@name='EstimatedAnnualIncome']")
    WebElement annualIncome;
    @FindBy(xpath = "//select[@name='SourceofFunds']")
    WebElement sourceOfFunds;
    @FindBy(xpath = "//select[@name='TradingExperience']")
    WebElement tradingExperience;
    @FindBy(xpath ="//div[@class='fscClass']//strong")
    WebElement termsAndConditions;
    @FindBy(xpath = "//input[@name='Send']")
    WebElement sendBtn;
    @FindBy(xpath = "//div[@class='welcomePopup']//..//div[@id='startTradingButton']")
    public WebElement continueBtn;

    public void clickStartNowBtn() {
        clickElement(getStartedNowBtn, "get started now button");
    }

    public void enterFirstName(String firstNameValue) {
        typeText(firstName, firstNameValue, "first name field");
    }

    public void enterLastName(String lastNameValue) {
        typeText(lastName, lastNameValue, "last name field");
    }

    public void enterEmail(String emailValue) {
        typeText(email, emailValue, "email field");
    }

    public void enterCountryCode(String countryCodeValue) {
        typeText(countryCode, countryCodeValue, "country code field");
    }

    public void enterPhone(String phoneValue) {
        typeText(phone, phoneValue, "phone field");
    }

    public void selectCountry(String countryValue) {
        selectDropdownElement(country, countryValue, "from country field");
    }

    public void enterAddress(String addressValue) {
        typeText(address, addressValue, "address field");
        clickElement(addressData, "address data");
    }

    public void selectCountyOfCitizenship(String countyOfCitizenshipValue) {
        selectDropdownElement(countyOfCitizenship, countyOfCitizenshipValue, "from county of citizenship field");
    }

    public void selectPlaceOfBirth(String placeOfBirthValue) {
        selectDropdownElement(placeOfBirth, placeOfBirthValue, "from place of birth field");
    }

    public void selectCurrency(String currencyValue) {
        selectDropdownElement(currency, currencyValue, "from currency field");
    }

    public void enterPassword(String passwordValue) {
        typeText(password, passwordValue, "password field");
    }

    public void selectDateOfBirthday(String dateOfBirthdayValue, String dateOfBirthdayMonthValue, String dateOfBirthYearValue) {
        selectDropdownElement(dateOfBirthday, dateOfBirthdayValue, "from date of birth field");
        selectDropdownElement(dateOfBirthdayMonth, dateOfBirthdayMonthValue, "from month of birth field");
        selectDropdownElement(dateOfBirthYear, dateOfBirthYearValue, "from year of birth field");
    }

    public void selectEmploymentStatus(String employmentStatusValue) {
        selectDropdownElement(employmentStatus, employmentStatusValue, "from employment status field");
    }

    public void selectProfession(String professionValue) {
        selectDropdownElement(profession, professionValue, "from profession field");
    }

    public void selectAnnualIncome(String annualIncomeValue) {
        selectDropdownElement(annualIncome, annualIncomeValue, "from annual income field");
    }

    public void selectSourceOfFunds(String sourceOfFundsValue) {
        selectDropdownElement(sourceOfFunds, sourceOfFundsValue, "from source of funds field");
    }

    public void selectTradingExperience(String tradingExperienceValue) {
        selectDropdownElement(tradingExperience, tradingExperienceValue, "from trading experience field");
    }

    public void clickTermsAndConditions() {
        clickElement(termsAndConditions, "terms and conditions checkbox");
    }
    public void clickSendButton() {
        clickElement(sendBtn, "send button ");
    }
    public void fscRealAccountRegistration(String firstNameValue, String lastNameValue, String emailValue, String
        countryCodeValue, String phoneValue, String countryValue, String addressValue, String countyOfCitizenshipValue
        ,String placeOfBirthValue, String currencyValue, String passwordValue, String dateOfBirthdayValue,
        String dateOfBirthdayMonthValue, String dateOfBirthYearValue, String employmentStatusValue, String professionValue,
        String annualIncomeValue, String sourceOfFundsValue, String tradingExperienceValue) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,250)");
        clickStartNowBtn();
        enterFirstName(firstNameValue);
        enterLastName(lastNameValue);
        enterEmail(emailValue);
        enterCountryCode(countryCodeValue);
        enterPhone(phoneValue);
        selectCountry(countryValue);
        enterAddress(addressValue);
        selectCountyOfCitizenship(countyOfCitizenshipValue);
        selectPlaceOfBirth(placeOfBirthValue);
        selectCurrency(currencyValue);
        enterPassword(passwordValue);
        selectDateOfBirthday(dateOfBirthdayValue, dateOfBirthdayMonthValue, dateOfBirthYearValue);
        selectEmploymentStatus(employmentStatusValue);
        selectProfession(professionValue);
        selectAnnualIncome(annualIncomeValue);
        selectSourceOfFunds(sourceOfFundsValue);
        selectTradingExperience(tradingExperienceValue);
        clickTermsAndConditions();
        clickSendButton();
    }

}

