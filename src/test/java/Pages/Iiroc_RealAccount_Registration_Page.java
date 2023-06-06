package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iiroc_RealAccount_Registration_Page extends BasePage{
    public Iiroc_RealAccount_Registration_Page(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//input[@name='FirstName']")
    WebElement firstName;
    @FindBy (xpath = "//input[@name='LastName']")
    WebElement lastName;
    @FindBy (xpath = "//input[@name='Email']")
    WebElement email;
    @FindBy (xpath = "//input[@name='PhoneCountryCode']")
    WebElement countryCode;
    @FindBy (xpath = "//input[@name='Phone']")
    WebElement phone;
    @FindBy (xpath = "//select[@name='Country']")
    WebElement country;
    @FindBy (xpath = "//select[@name='Province']")
    WebElement province;
    @FindBy (xpath = "//input[@name='Address']")
    WebElement address;
    @FindBy (xpath = "//input[@name='Address']//..//div//ul//li[2]")
    WebElement addressData;
    @FindBy (xpath = "//select[@name='Currency']")
    WebElement currency;
    @FindBy (xpath = "//input[@name='Password']")
    WebElement password;
    @FindBy (xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthday;
    @FindBy (xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfBirthdayMonth;
    @FindBy (xpath = "//select[@name='DateOfBirth']")
    WebElement dateOfBirthYear;
    @FindBy (xpath = "//input[@name='SocialSecurity']")
    WebElement socialInsuranceNumber;
    @FindBy (xpath = "//select[@name='EmploymentStatus']")
    WebElement employmentStatus;
    @FindBy (xpath = "//select[@name='EstimatedAnnualIncome']")
    WebElement annualIncome;
    @FindBy (xpath = "//select[@name='SourceofFunds']")
    WebElement sourceOfFunds;
    @FindBy (xpath = "//select[@name='ValueOfSavingAndInvestments']")
    WebElement valueOfSavingAndInvestments;
    @FindBy (xpath = "//select[@name='InvestmentObjectives']")
    WebElement reasonForTrading;
    @FindBy (xpath = "//select[@name='PublicallyTradedCompany']")
    WebElement areYouAnInsiderOfPubliclyTradedCompany;
    @FindBy (xpath = "//select[@name='PoliticallyExposedPerson']")
    WebElement doYouHoldAProminentPublicFunction;
    @FindBy (xpath = "//select[@name='KnowledgeOfTrading']")
    WebElement knowledgeOfTrading;
    @FindBy (xpath = "//select[@name='TradingExperience']")
    WebElement tradingExperience;
    @FindBy (xpath = "//select[@name='FrequencyOfTrades']")
    WebElement frequencyOfTrading;
    @FindBy (xpath = "//select[@name='OtherTradingExperience']")
    WebElement otherTradingExperience;
    @FindBy (xpath = "//select[@name='FrequencyOtherTradingExperience']")
    WebElement frequencyOfOtherOnlineTrading;
    @FindBy (xpath = "//select[@name='WillingToLose']")
    WebElement cumulativeRiskLimit;
//    @FindBy (xpath = "//input[@name='FinancailQCheckbox']")
//    WebElement checkboxIHaveReadTheRiskWarningBellowAndWishToProceed;
    @FindBy (xpath = "//label[@class='checkboxItem TermsAgreement']//..//div[@class='iirocClass' and text()='" +
            "By checking the box to the left, I agree that I have read, understand, and accept the ']")
    WebElement checkboxTermsAndConditions;
    @FindBy (xpath = "//input[@name='Send']")
    WebElement sendBtn;
    @FindBy(xpath = "//div[@class='welcomePopup']//..//div[@id='startTradingButton']")
    public WebElement continueBtn;
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

    public void enterPhoneNumber(String phoneNumberValue) {
        typeText(phone, phoneNumberValue, "phone number field");
    }

    public void selectCountryOfResidence(String countryOfResidenceValue) {
        selectDropdownElement(country, countryOfResidenceValue, "from country of residence field");
    }
    public void selectProvince(String provinceValue){
        selectDropdownElement(province,provinceValue,"from province field");
    }
    public void enterAddress(String addressValue) {
        typeText(address, addressValue, "address field");
        clickElement(addressData, " address");
    }

    public void selectCurrency(String currencyValue) {
        selectDropdownElement(currency, currencyValue, "from currency field");
    }

    public void enterPassword(String passwordValue) {
        typeText(password, passwordValue, "password field");
    }

    public void selectDateOfBirthday(String dateOfBirthdayValue, String dateOfBirthdayMonthValue, String dateOfBirthYearValue) {
        selectDropdownElement(dateOfBirthday, dateOfBirthdayValue, "from date of birthday");
        selectDropdownElement(dateOfBirthdayMonth, dateOfBirthdayMonthValue, "from month of birthday");
        selectDropdownElement(dateOfBirthYear, dateOfBirthYearValue, "from year of birth field");
    }
    public void enterSocialInsuranceNumber(String socialInsuranceNumberValue){
        typeText(socialInsuranceNumber,socialInsuranceNumberValue,"social insurance number field");
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

    public void selectValueOfSavingsAndInvestments(String valueOfSavingAndInvestmentsValue) {
        selectDropdownElement(valueOfSavingAndInvestments, valueOfSavingAndInvestmentsValue,
                "from value of saving and investments field");
    }

    public void selectReasonForTrading(String reasonForTradingValue){
        selectDropdownElement(reasonForTrading,reasonForTradingValue,"from reason for trading field");
    }
    public void selectAreYouAnInsiderOfPubliclyTradedCompany(String areYouAnInsiderOfPubliclyTradedCompanyValue){
        selectDropdownElement(areYouAnInsiderOfPubliclyTradedCompany,areYouAnInsiderOfPubliclyTradedCompanyValue,
                "from are you an insider of publicly traded company field");
    }
    public void selectDoYouHoldAProminentPublicFunction(String doYouHoldAProminentPublicFunctionValue){
        selectDropdownElement(doYouHoldAProminentPublicFunction,doYouHoldAProminentPublicFunctionValue,"from Do you" +
                "hold prominent public function field");
    }
    public void selectKnowledgeOfTrading(String knowledgeOfTradingValue){
        selectDropdownElement(knowledgeOfTrading,knowledgeOfTradingValue,"from knowledge of trading field");
    }
    public void selectTradingExperience(String tradingExperienceValue){
        selectDropdownElement(tradingExperience,tradingExperienceValue,"from FX & CFD trading experience field");
    }
    public void selectFrequencyOfTrades(String frequencyOfTradesValue){
        selectDropdownElement(frequencyOfTrading,frequencyOfTradesValue,"from frequency of trades (FX & CFDs) field");
    }
    public void selectOtherOnlineTradingExperience(String otherTradingExpValue){
        selectDropdownElement(otherTradingExperience,otherTradingExpValue,"from other online trading experience field");
    }
    public void selectFrequencyOfOtherOnlineTrading(String frequencyOfOtherOnlineTradingValue){
        selectDropdownElement(frequencyOfOtherOnlineTrading,frequencyOfOtherOnlineTradingValue,
                "from frequency of other online trading field");
    }
    public void selectCumulativeRiskLimit(String cumulativeRiskLimitValue){
        selectDropdownElement(cumulativeRiskLimit,cumulativeRiskLimitValue,"from cumulative risk field");
    }
    public void clickTermsAndConditions() {
        clickElement(checkboxTermsAndConditions, "terms and conditions checkbox");
    }
    public void clickSendBtn(){
        clickElement(sendBtn,"I agree button");
    }

    public void  iirocAccountRegistration(String firstNameValue,String lastNameValue,String emailValue, String countryCodeValue
    ,String phoneNumberValue,String countryOfResidenceValue,String provinceValue,String addressValue,String currencyValue
    ,String passwordValue,String dateOfBirthdayValue,String dateOfBirthdayMonthValue,String dateOfBirthYearValue
    ,String socialInsuranceNumberValue,String employmentStatusValue,String annualIncomeValue,String sourceOfFundsValue
    ,String valueOfSavingAndInvestmentsValue,String reasonForTradingValue,String areYouAnInsiderOfPubliclyTradedCompanyValue
    ,String doYouHoldAProminentPublicFunctionValue,String knowledgeOfTradingValue,String tradingExperienceValue
    ,String frequencyOfTradesValue,String otherTradingExpValue,String frequencyOfOtherOnlineTradingValue
    ,String cumulativeRiskLimitValue){
        enterFirstName(firstNameValue);
        enterLastName(lastNameValue);
        enterEmail(emailValue);
        enterCountryCode(countryCodeValue);
        enterPhoneNumber(phoneNumberValue);
        selectCountryOfResidence(countryOfResidenceValue);
        selectProvince(provinceValue);
        enterAddress(addressValue);
        selectCurrency(currencyValue);
        enterPassword(passwordValue);
        selectDateOfBirthday(dateOfBirthdayValue,dateOfBirthdayMonthValue,dateOfBirthYearValue);
        enterSocialInsuranceNumber(socialInsuranceNumberValue);
        selectEmploymentStatus(employmentStatusValue);
        selectAnnualIncome(annualIncomeValue);
        selectSourceOfFunds(sourceOfFundsValue);
        selectValueOfSavingsAndInvestments(valueOfSavingAndInvestmentsValue);
        selectReasonForTrading(reasonForTradingValue);
        selectAreYouAnInsiderOfPubliclyTradedCompany(areYouAnInsiderOfPubliclyTradedCompanyValue);
        selectDoYouHoldAProminentPublicFunction(doYouHoldAProminentPublicFunctionValue);
        selectKnowledgeOfTrading(knowledgeOfTradingValue);
        selectTradingExperience(tradingExperienceValue);
        selectFrequencyOfTrades(frequencyOfTradesValue);
        selectOtherOnlineTradingExperience(otherTradingExpValue);
        selectFrequencyOfOtherOnlineTrading(frequencyOfOtherOnlineTradingValue);
        selectCumulativeRiskLimit(cumulativeRiskLimitValue);
        clickTermsAndConditions();
        clickSendBtn();
    }
}
