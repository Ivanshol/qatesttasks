package step.test.localhost;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import step.page.StepPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public StepPage step;

    @BeforeEach
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        step = PageFactory.initElements(driver, StepPage.class);
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }
}
