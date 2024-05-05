package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.LoginPage;

public class LoginTest {

    public static final By USERNAME_XPATH = By.xpath("//input[@data-test='username']");
    public static final By PASSWORD_XPATH = By.xpath("//input[@data-test='password']");
    public static final By LOGIN_XPATH = By.xpath("//input[@data-test='login-button']");

    @Test
    public void testLogin(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage();

        loginPage.fillUsernameField("standard_user");
        loginPage.fillPasswordField("secret_sauce");
        loginPage.clickLoginButton();

    }
}
