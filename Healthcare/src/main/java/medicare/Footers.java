package medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manish on 6/12/2017.
 */
public class Footers {
    WebDriver driver;

    public Footers(WebDriver driver) {
        this.driver = driver;
    }

    public void bottom_Footers() {
        WebElement bottomfooter = driver.findElement(By.xpath(".//*[@id='footer-column1']/ul"));

        //listing out the noofelements in bottom footer section 1
        List<WebElement> liTems = bottomfooter.findElements(By.tagName("a"));
        int Size = liTems.size();
        for (WebElement li : liTems) {
            String link = li.getAttribute("href");
            System.out.println(link);
        }

       /* int noofitems = liTems.size();
        List<String> links = new ArrayList<String>();
        // List<String> links = new ArrayList<String>();

        for (int i = 0; i < liTems.size(); i++) {

            try {
                String link = liTems.get(i).getAttribute("href");
                links.add(link);
            } catch (UnreachableBrowserException e) {
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
        }*/
    }
}
