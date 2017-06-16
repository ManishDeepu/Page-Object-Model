import Steps.SignUp;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Manish on 6/9/2017.
 */
public class Test1 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\maade\\Desktop\\geckodriver.exe");
        driver =new FirefoxDriver();
       // String baseUrl ="https://www.medicare.gov/";
       // driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,30);
    }

    @AfterMethod
    public void closeBrowser(){
       // driver.close();
        driver.quit();
    }

    @Test
    public void verifySignUppage()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,20);
    SignUp steps = new SignUp(driver);
        steps.openSignUp();
        steps.claimingPage();
        steps.MenuItems();
        Thread.sleep(2000);
        steps.Footersection();

  /*      WebElement bottomfooter = driver.findElement(By.xpath(".//*[@id='footer-column1']/ul"));

        //listing out the noofelements in bottom footer section 1
        List<WebElement> liTems = bottomfooter.findElements(By.tagName("a"));
        int  Size= liTems.size();
        for(WebElement li:liTems) {
            String link = li.getAttribute("href");
            System.out.println(link);


        }

        int noofitems = liTems.size();
        List<String> links = new ArrayList<String>();
        // List<String> links = new ArrayList<String>();

        for(int i=0; i<liTems.size(); i++){

            try{
                String link = liTems.get(i).getAttribute("href");
                 links.add(link);
            }catch (UnreachableBrowserException e){
                System.out.println("Error" + e.getMessage());
            }
        }

        //
        //
        System.out.println("list of links" + links.size());
        for (int j = 0; j < links.size(); j++) {
            System.out.println("Opening link " + links.get(j));
            driver.get(links.get(j));
            driver.navigate().back();
            Thread.sleep(5000);
        }
    }*/
    }

}
