import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverSettings {

     public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Android_Projects\\CRM_Studio_Test\\src\\resources\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "D:\\Android_Projects\\CRM_Studio_Test\\src\\resources\\geckodriver.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        System.out.println("Start Test!");
        driver.get("https://demo.crm.studio");
        driver.manage().window().maximize();

    }
    @After
    public void closeUp() throws InterruptedException {
        Thread.sleep(3000L);
        driver.quit();
        System.out.println("Test close!");
    }
}
