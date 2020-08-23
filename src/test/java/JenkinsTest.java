import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenkinsTest {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Test
    public void someJenkinsTest() {
        System.out.println("I see you!");
        LOGGER.info("Hi! I'm logger!");

        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://delfi.lv");
        System.out.println(driver.getTitle());
    }
}
