package Tests;

import Pages.Cysec_RealAccount_Registration_Page;
import Pages.Iiroc_RealAccount_Registration_Page;
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

public class LandingPageTest1_Iiroc extends BaseTest {
    @BeforeMethod
    public void setUp() {
        baseSetUp("CHROME", "113");
    }

    @Test
    @Parameters({"regulative"})
    public void iiroc_RealAccount_Registration(String regulative) {

        driver.get("https://www.fortrade.com/minilps2/en/real-new/");
        Iiroc_RealAccount_Registration_Page iiroc_realAccount_registration_page = new Iiroc_RealAccount_Registration_Page(driver);
        iiroc_realAccount_registration_page.iirocAccountRegistration("Testq","Testa"
        ,"test@"+System.currentTimeMillis()+"mailinator.com","1",System.currentTimeMillis()+
        "","Canada","Alberta","4800","CAD","Aa1111"
        ,"14","5","1989","326524789"
        ,"Employed","C$20,000-C$70,000","Employment"
        ,"C$35,000 - C$70,000","Capital Growth","No"
        ,"No","Yes, from a relevant role in financial services"
        ,"Between 1 and 2 years","I trade FX & CFDs 1-2 times a week."
        ,"Between 1 and 2 years","I trade 1-2 times a week."
        ,"$20k-$30k");
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
        iiroc_realAccount_registration_page.clickElement(iiroc_realAccount_registration_page.continueBtn, "Continue button");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body[data-lcreg='"+regulative +"']")));
        WebElement attribute = driver.findElement(By.cssSelector("body[data-lcreg='"+regulative+"']"));
        String regulativeValue = attribute.getAttribute("data-lcreg");
        Assert.assertEquals(regulativeValue,regulative);
    }

    @AfterMethod
    public void tearDown() {
    baseTearDown();
    }
}
