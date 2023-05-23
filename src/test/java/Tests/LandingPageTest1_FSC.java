package Tests;

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

public class LandingPageTest1_FSC extends BaseTest {
    @BeforeMethod
    public void setUp() {
        baseSetUp("CHROME", "113");
    }

    @Test
    @Parameters({"regulative"})
    public void FSC_RealAccount_Registration(String regulative) {

        driver.get("https://www.fortrade.com/minilps2/en/real-new/");

        FSC_RealAccount_Registration_Page fscRealAccountRegistration = new FSC_RealAccount_Registration_Page(driver);
        fscRealAccountRegistration.fscRealAccountRegistration("Testq", "Testa",
                "test" + System.currentTimeMillis() + "@mailinator.com", "381", ""
                        + System.currentTimeMillis(), "Serbia", "460", "Serbia", "Serbia",
                "USD", "Aa1111", "10", "10", "1995",
                "Employed", "Marketing/Advertising", "$15,000-$50,000",
                "Employment", "None");
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

        WebDriverWait wdWait = new WebDriverWait(driver, 10);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='welcomePopup']" +
                "//..//div[@id='startTradingButton']")));
        wdWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='welcomePo" +
                "pup']//..//div[@id='startTradingButton']"))));
        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='" +
                "welcomePopup']//..//div[@id='startTradingButton']"))));
        fscRealAccountRegistration.clickElement(fscRealAccountRegistration.continueBtn, "Continue button");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body[data-lcreg='" + regulative + "']")));
        WebElement attribute = driver.findElement(By.cssSelector("body[data-lcreg='" + regulative + "']"));
        String regulativeValue = attribute.getAttribute("data-lcreg");
        Assert.assertEquals(regulativeValue, regulative);
    }

    @AfterMethod
    public void tearDown() {
    driver.quit();
    }
}
