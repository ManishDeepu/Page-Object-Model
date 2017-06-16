package medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Manish on 6/10/2017.
 */
public class Claims {
    WebDriver driver;

    public Claims(WebDriver driver){
        this.driver = driver;
    }

    By claims = By.linkText("Claims & Appeals");
    By file_Claim = By.xpath(".//*[@id='content-column']/section/div[2]/h2/a");

    public void claim_Page(){
        System.out.println("Url is"+ driver.getCurrentUrl());
        driver.findElement(claims).click();
    }

    public void filing()throws InterruptedException{
       // Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(file_Claim)).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"File a claim | Medicare.gov");
    }

}
