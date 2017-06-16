package medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Manish on 6/9/2017.
 */
public class HomePage {
    WebDriver driver;
    String baseUrl ="https://www.medicare.gov/";
    public HomePage(WebDriver drv){
        this.driver = drv;
    }

    By signUpLink = By.linkText("Sign Up / Change Plans");
    By drugCoverage = By.xpath(".//*[@id='left-column']/ul/li[5]/a");
    By medicarePlan = By.xpath(".//*[@id='left-column']/ul/li[5]/ul/li[1]/a");
    public void visitHomePage(){
        driver.get(baseUrl);
    }

    public void openSignUpPage(){
        driver.findElement(signUpLink).click();
    }

    public void getCoverge(){
        driver.findElement(drugCoverage).click();
    }

    public void plan(){
        WebDriverWait wait = new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.elementToBeClickable(medicarePlan)).click();
        //Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"How to switch your Medicare drug plan | Medicare.gov");
    }

    public void navigateBack(){
        driver.navigate().back();
    }
}
