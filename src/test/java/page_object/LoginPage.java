package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private final WebDriver driver = new ChromeDriver();
    private final By USERNAME_XPATH = By.xpath("//input[@data-test='username']");
    private final By PASSWORD_XPATH = By.xpath("//input[@data-test='password']");
    private final By LOGIN_XPATH = By.xpath("//input[@data-test='login-button']");

    public void fillUsernameField(String input) {
        driver.findElement(USERNAME_XPATH).sendKeys(input);
    }
    public void fillPasswordField(String input) {
        driver.findElement(PASSWORD_XPATH).sendKeys(input);
    }
    public void clickLoginButton() {
        driver.findElement(LOGIN_XPATH);
    }
}
