package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElement(WebElement element, String log) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            System.out.println("Clicked : " + log);
        } catch (StaleElementReferenceException e) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            System.out.println("Clicked : " + log);
        }
    }
    public void typeText(WebElement element, String text, String log){
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.clear();
            element.sendKeys(text);
            System.out.println("Typed : "+text+" into "+log);
        }catch (StaleElementReferenceException e){
            element.clear();
            element.sendKeys(text);
            System.out.println("Typed : "+text+" into "+log);
        }
    }
    public void selectDropdownElement(WebElement element, String text, String log){
        try{
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Select select = new Select(element);
            select.selectByVisibleText(text);
            System.out.println("Selected : " + text + " " +log);
        }
        catch (StaleElementReferenceException e){
            Select select = new Select(element);
            select.selectByVisibleText(text);
            System.out.println("Selected : " + text + " " +log);
        }
    }
    public String getText(By by, String log){
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
            System.out.println("The "+log+" element is present");
            return driver.findElement(by).getText();
        }catch (StaleElementReferenceException e){
            System.out.println("The "+log+" element is present");
            return driver.findElement(by).getText();
        }
    }
}
