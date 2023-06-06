package Tests;

import Pages.Cysec_RealAccount_Registration_Page;
import Pages.FSC_RealAccount_Registration_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class LandingPageTest1_Cysec extends BaseTest {
    @BeforeMethod
    public void setUp() {
        baseSetUp("CHROME", "113");
    }

    @Test
    @Parameters({"regulative"})
    public void cysec_RealAccount_Registration(String regulative) {

        driver.get("https://www.fortrade.com/minilps2/en/real-new/");
        Cysec_RealAccount_Registration_Page cysec_realAccount_registration_page = new Cysec_RealAccount_Registration_Page(driver);
        cysec_realAccount_registration_page.cysecAccountRegistration("Testq","Testa"
        ,"test"+System.currentTimeMillis()+"@mailinator.com","357",System.currentTimeMillis()+""
        ,"Cyprus","Republic of Cyprus","64","EUR","Aa1111"
        ,"26","6","1981","No","Employed"
        ,"Education","More then €250,000","Bank Savings"
        ,"€100,000 – €250,000","Capital Growth","No"
        ,"Yes, a relevant financial qualification","Between 1 and 2 years"
        ,"I trade Fx & CFDs on a daily basis.","Between 1 and 2 years"
        ,"I trade 1-2 times a week.","50,000 - 100,000 per year"
        ,"5 - 10 trades per month","Occasionally (up to 25 trades per year)"
        ,"Regularly (between 25 and 100 trades per year)","Frequently (over 100 trades per year)"
        ,"Up to 1:5","Medium term growth: moderate exposure to risk"
        ,"Short term (intraday or a few days) for speculative and/or hedging purposes");
//        /**
//         * ID of the original window
//         */
//        String originalWindow = driver.getWindowHandle();
//        /**
//         *Checking if there is no other windows open already
//         */
//        assert driver.getWindowHandles().size() == 1;
//        /**
//         * Wait for the new tab or the window
//         */
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(numberOfWindowsToBe(2));
//        /**
//         * Loop through until we find a new window handle or tab
//         */
//        for (String windowHandle : driver.getWindowHandles()) {
//            if (!originalWindow.contentEquals(windowHandle)) {
//                driver.switchTo().window(windowHandle);
//                break;
//            }
//        }
//        /**
//         * Wait for the new tab to finish loading content
//         */
//        wait.until(titleIs("Access trading platform | Fortrade"));

        WebDriverWait wdWait = new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='welcomePopup']"+
                "//..//div[@id='startTradingButton']")));
        wdWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='welcomePopup']" +
                "//..//div[@id='startTradingButton']"))));
        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='welcomePopup']" +
                "//..//div[@id='startTradingButton']"))));
        cysec_realAccount_registration_page.clickElement(cysec_realAccount_registration_page.continueBtn, "Continue button");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body[data-lcreg='"+regulative +"']")));
        WebElement attribute = driver.findElement(By.cssSelector("body[data-lcreg='"+regulative+"']"));
        String regulativeValue = attribute.getAttribute("data-lcreg");
        Assert.assertEquals(regulativeValue,regulative);
    }

    @AfterMethod
    public void tearDown() {
    //baseTearDown();
    }
}
