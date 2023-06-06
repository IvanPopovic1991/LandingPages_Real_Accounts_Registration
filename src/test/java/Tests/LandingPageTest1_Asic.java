package Tests;

import Pages.Asic_RealAccount_Registration_Page;
import Pages.FCA_RealAccount_Registration_Page;
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

public class LandingPageTest1_Asic extends BaseTest{
    @BeforeMethod
        public void setUp(){
        baseSetUp("CHROME","113");
    }
    @Test
    @Parameters({"regulative"})
    public void ASIC_RealAccount_Registration(String regulative){
    driver.get("https://www.fortrade.com/minilps2/en/real-new/");
       Asic_RealAccount_Registration_Page asic_realAccount_registration_page = new Asic_RealAccount_Registration_Page(driver);
       asic_realAccount_registration_page.asicAccountRegistration("Testq","Testa","test"+
       System.currentTimeMillis()+"@mailinator.com","61",System.currentTimeMillis()+""
       , "Australia","58","AUD","Aa1111","15"
       ,"6","1975","Employed","AU$15,000-AU$50,000"
       , "Investments","AU$5,000 - AU$25,000","Capital Growth"
       ,"All the above","Between 6 months and 1 year"
       ,"I trade Fx & CFDs on a daily basis.","Between 6 months and 1 year"
       , "I trade on a daily basis.");
        /**
         * ID of the original window
         */
        String originalWindow = driver.getWindowHandle();
        /**
         *Checking if there is no other windows open already
         */
        assert driver.getWindowHandles().size() == 1;
        /**
         * Wait for the new tab or the window
         */
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(numberOfWindowsToBe(2));
        /**
         * Loop through until we find a new window handle or tab
         */
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        /**
         * Wait for the new tab to finish loading content
         */
        wait.until(titleIs("Access trading platform | Fortrade"));

        WebDriverWait wdWait = new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='welcomePopup']"+
        "//..//div[@id='startTradingButton']")));
        wdWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='welcomePopup']" +
        "//..//div[@id='startTradingButton']"))));
        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='welcomePopup']" +
        "//..//div[@id='startTradingButton']"))));
        asic_realAccount_registration_page.clickElement(asic_realAccount_registration_page.continueBtn, "Continue button");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body[data-lcreg='"+regulative +"']")));
        WebElement attribute = driver.findElement(By.cssSelector("body[data-lcreg='"+regulative+"']"));
        String regulativeValue = attribute.getAttribute("data-lcreg");
        Assert.assertEquals(regulativeValue,regulative);
    }
    @AfterMethod
        public void tearDown(){
        baseTearDown();
    }
}
