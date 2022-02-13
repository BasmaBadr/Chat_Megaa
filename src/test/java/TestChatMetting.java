import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;

import java.util.concurrent.TimeUnit;


public class TestChatMetting extends TestBase {
    public static WebDriver driver;

    @Test(invocationCount = 3)
    public void openMeeting() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options_chrome = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        options_chrome.addArguments(new String[] {"start-maximized"});
        options_chrome.addArguments(new String[] {"--use-fake-ui-for-media-stream"});
        options_chrome.addArguments(new String[] {"--use-fake-device-for-media-stream"});
        driver=new ChromeDriver(options_chrome);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://meet.taskedin.net/general");

    }
    }


