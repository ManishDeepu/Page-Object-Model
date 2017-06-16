package medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Manish on 6/12/2017.
 */
public class MenuItems_Claims {

    WebDriver driver;

    public MenuItems_Claims(WebDriver drv) {
        this.driver = drv;
    }

    //By menuItems = By.xpath(".//*[@id='topnav']");

    public void verifyMenuItesm() throws InterruptedException {
        WebElement leftNavBar = driver.findElement(By.cssSelector("nav#topnav"));

        // listing out the elements present on menu bar
        List<WebElement> liTems = leftNavBar.findElements(By.tagName("a"));
        int Size = liTems.size();
        for (WebElement li : liTems) {
            String link = li.getAttribute("href");
            System.out.println(link);
        }
        Thread.sleep(2000);
      /*  List<WebElement> liTems = leftNavBar.findElements(By.tagName("li"));
        System.out.println("list items available " + liTems.size());
        int noofIlinkstems = liTems.size();

        List<String> links = new ArrayList<String>();

        for (int i = 0; i < liTems.size(); i++) {
            WebElement element = liTems.get(i);
            try {
                String Link = element.findElement(By.tagName("a")).getAttribute("href");
                links.add(Link);
            } catch (NoSuchElementException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        System.out.println("list of link items " + links.size());
/*
        for (int j = 0; j < links.size(); j++) {
            System.out.println("Opening link " + links.get(j));
            driver.get(links.get(j));
            driver.navigate().back();
        }*/
    }
}
