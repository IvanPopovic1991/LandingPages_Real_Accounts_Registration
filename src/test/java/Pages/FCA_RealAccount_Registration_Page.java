package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCA_RealAccount_Registration_Page extends BasePage {
    public FCA_RealAccount_Registration_Page(WebDriver driver) {
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
    @FindBy(xpath = "//select[@name='EstimatedAnnualIncome']")
    WebElement annualIncome;
    @FindBy(xpath = "//select[@name='SourceofFunds']")
    WebElement sourceOfFunds;
    @FindBy(xpath = "//select[@name='ValueOfSavingAndInvestments']")
    WebElement valueOfSavingAndInvestments;
    @FindBy(xpath = "//select[@name='InvestmentObjectives']")
    WebElement reasonForTrading;
    @FindBy(xpath = "//select[@name='KnowledgeOfTrading']")
    WebElement knowledgeOfTrading;
    @FindBy(xpath = "//select[@name='TradingExperience']")
    WebElement tradingExperience;
    @FindBy(xpath = "//select[@name='FrequencyOfTrades']")
    WebElement frequencyOfTrading;
    @FindBy(xpath = "//select[@name='OtherTradingExperience']")
    WebElement otherTradingExperience;
    @FindBy(xpath = "//select[@name='FrequencyOtherTradingExperience']")
    WebElement frequencyOfOtherOnlineTrading;
    @FindBy(xpath = "//span[@for='FinancailQCheckbox']//div//p[1]")
    WebElement checkboxIHaveReadTheRiskWarningBellowAndWishToProceed;
    @FindBy(xpath = "//div[@class='fcaClass']//strong[text()='By checking the box to the left, I agree that I have " +
            "read, understand, and accept the ']")
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

    public void selectAnnualIncome(String annualIncomeValue) {
        selectDropdownElement(annualIncome, annualIncomeValue, "from annual income field");
    }

    public void selectSourceOfFunds(String sourceOfFundsValue) {
        selectDropdownElement(sourceOfFunds, sourceOfFundsValue, "from source of funds field");
    }

    public void selectValueOfSavingAndInvestments(String valueOfSavingAndInvestmentsValue) {
        selectDropdownElement(valueOfSavingAndInvestments, valueOfSavingAndInvestmentsValue, "from Value of Saving and" +
                "Investments");
    }

    public void selectReasonForTrading(String reasonForTradingValue) {
        selectDropdownElement(reasonForTrading, reasonForTradingValue, "from reason for trading field");
    }

    public void selectKnowledgeOfTrading(String knowledgeOfTradingValue) {
        selectDropdownElement(knowledgeOfTrading, knowledgeOfTradingValue, "from Knowledge of trading field");
    }

    public void selectTradingExperience(String tradingExperienceValue) {
        selectDropdownElement(tradingExperience, tradingExperienceValue, "from trading experience field");
    }

    public void selectFrequencyOfTrading(String frequencyOfTradingValue) {
        selectDropdownElement(frequencyOfTrading, frequencyOfTradingValue, "from Frequency Of Trading field");
    }

    public void selectOtherTradingExperience(String otherTradingExperienceValue) {
        selectDropdownElement(otherTradingExperience, otherTradingExperienceValue, "from Other Online Trading Experience");
    }

    public void selectFrequencyOfOtherOnlineTrading(String frequencyOfOtherOnlineTradingValue) {
        selectDropdownElement(frequencyOfOtherOnlineTrading, frequencyOfOtherOnlineTradingValue, "from Frequency Of Other" +
        "Online Trading field");
    }

    public void clickCheckboxIHaveReadTheRiskWarningBellowAndWishToProceed() {
        clickElement(checkboxIHaveReadTheRiskWarningBellowAndWishToProceed, "checkbox I Have Read The Risk Warning " +
        "Bellow And Wish To Proceed ");
    }

    public void clickTermsAndConditions() {
        clickElement(termsAndConditions, "terms and conditions checkbox");
    }

    public void clickSendButton() {
        clickElement(sendBtn, "send button ");
    }

    public void fcaAccountRegistration(String firstNameValue, String lastNameValue, String emailValue, String countryCodeValue,
       String phoneValue, String countryValue, String addressValue, String currencyValue, String passwordValue,
       String dateOfBirthdayValue, String dateOfBirthdayMonthValue, String dateOfBirthYearValue, String employmentStatusValue,
       String annualIncomeValue, String sourceOfFundsValue, String valueOfSavingAndInvestmentsValue,
       String reasonForTradingValue, String knowledgeOfTradingValue, String tradingExperienceValue, String frequencyOfTradingValue
       , String otherTradingExperienceValue, String frequencyOfOtherOnlineTradingValue) {
        clickStartNowBtn();
        enterFirstName(firstNameValue);
        enterLastName(lastNameValue);
        enterEmail(emailValue);
        enterCountryCode(countryCodeValue);
        enterPhone(phoneValue);
        selectCountry(countryValue);
        enterAddress(addressValue);
        selectCurrency(currencyValue);
        enterPassword(passwordValue);
        selectDateOfBirthday(dateOfBirthdayValue, dateOfBirthdayMonthValue, dateOfBirthYearValue);
        selectEmploymentStatus(employmentStatusValue);
        selectAnnualIncome(annualIncomeValue);
        selectSourceOfFunds(sourceOfFundsValue);
        selectValueOfSavingAndInvestments(valueOfSavingAndInvestmentsValue);
        selectReasonForTrading(reasonForTradingValue);
        selectKnowledgeOfTrading(knowledgeOfTradingValue);
        selectTradingExperience(tradingExperienceValue);
        selectFrequencyOfTrading(frequencyOfTradingValue);
        selectOtherTradingExperience(otherTradingExperienceValue);
        selectFrequencyOfOtherOnlineTrading(frequencyOfOtherOnlineTradingValue);
        clickCheckboxIHaveReadTheRiskWarningBellowAndWishToProceed();
        clickTermsAndConditions();
        clickSendButton();
    }
}
