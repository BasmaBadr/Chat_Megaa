import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    WebDriver driver;
    Alert alert;

    // create constructor
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button) {
        button.click();
    }

    protected static void setTextElmentText(WebElement textElment, String value) {
        textElment.sendKeys(value);

    }

    public void alert() {
        alert = driver.switchTo().alert();
        alert.accept();
    }
}