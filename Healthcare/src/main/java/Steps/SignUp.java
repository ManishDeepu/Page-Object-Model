package Steps;

import medicare.Claims;
import medicare.Footers;
import medicare.HomePage;
import medicare.MenuItems_Claims;
import org.openqa.selenium.WebDriver;

/**
 * Created by Manish on 6/9/2017.
 */
public class SignUp {

    WebDriver driver;
    HomePage objHome;
    Claims objClaim;
    MenuItems_Claims objMenu;
    Footers objFooter;
    public  SignUp(WebDriver driver){
        this.driver=driver;
        objHome = new HomePage(driver);
        objClaim = new Claims(driver);
        objMenu = new MenuItems_Claims(driver);
        objFooter = new Footers(driver);
    }
    public void openSignUp(){
        objHome.visitHomePage();
        objHome.openSignUpPage();
        objHome.getCoverge();
        objHome.plan();
        objHome.navigateBack();
    }

    public void claimingPage() throws InterruptedException {
        objClaim.claim_Page();
        objClaim.filing();
    }

    public void MenuItems() throws InterruptedException {
      //  Thread.sleep(2000);
        objMenu.verifyMenuItesm();
    }

    public void Footersection() throws InterruptedException{
        Thread.sleep(2000);
        objFooter.bottom_Footers();
    }
}
