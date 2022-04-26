package page;

import org.junit.Assert;
import org.assertj.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StepPage extends StepPageSelectors {
    public WebDriver driver;
    public WebDriverWait wait;

    public StepPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        boolean tabLoaded = driver.findElement(elementBy).isDisplayed();
    }

    public boolean testTabIsLoaded(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        boolean tabLoaded = driver.findElement(elementBy).isDisplayed();
        /*System.out.print("Is the Tab Displayed?: ");
        System.out.println(tabLoaded);*/
        return tabLoaded;
    }
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void clickKeywordTabLink(){//clickKeywordTabLink
        this.click(By.cssSelector(super.keywordsTabLink));//keywordsTabLink
    }
    public void verifyKeywordTabIsLoaded(){
        Assert.assertTrue(this.testTabIsLoaded(By.xpath(super.keywordsTabVerifier)));
    }

    public void clickParametersTabLink(){
        this.click(By.cssSelector(super.parametersTabLink));
    }

    public void verifyParametersTabIsLoaded(){
        Assert.assertTrue(this.testTabIsLoaded(By.xpath(super.parametersTabVerifier)));
    }

    public void clickExecutionsTabLink(){
        this.click(By.cssSelector(super.executionsTabLink));
    }

    public void verifyExecutionsTabIsLoaded(){
        Assert.assertTrue(this.testTabIsLoaded(By.xpath(super.executionsTabVerifier)));
    }

    public void clickSchedulerTabLink(){
        this.click(By.cssSelector(super.schedulerTabLink));
    }

    public void verifySchedulerTabIsLoaded(){
        Assert.assertTrue(this.testTabIsLoaded(By.xpath(super.schedulerTabVerifier)));
    }

}
