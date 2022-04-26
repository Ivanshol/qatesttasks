package step.page;

import org.junit.jupiter.api.Assertions;
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
        return tabLoaded;
    }
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void clickKeywordTabLink(){

        this.click(By.cssSelector(super.keywordsTabLink));
    }
    public void verifyKeywordTabIsLoaded(){
        Assertions.assertTrue(this.testTabIsLoaded(By.xpath(super.keywordsTabVerifier)));
    }

    public void clickParametersTabLink(){

        this.click(By.cssSelector(super.parametersTabLink));
    }

    public void verifyParametersTabIsLoaded(){
        Assertions.assertTrue(this.testTabIsLoaded(By.xpath(super.parametersTabVerifier)));
    }

    public void clickExecutionsTabLink(){
        this.click(By.cssSelector(super.executionsTabLink));
    }

    public void verifyExecutionsTabIsLoaded(){
        Assertions.assertTrue(this.testTabIsLoaded(By.xpath(super.executionsTabVerifier)));
    }

    public void clickSchedulerTabLink(){
        this.click(By.cssSelector(super.schedulerTabLink));
    }

    public void verifySchedulerTabIsLoaded(){
        Assertions.assertTrue(this.testTabIsLoaded(By.xpath(super.schedulerTabVerifier)));
    }

}
