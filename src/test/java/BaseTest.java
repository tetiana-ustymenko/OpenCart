import driver.DriverRepository;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        DriverRepository.downloadWebDriver();
    }

    @BeforeClass
    public void createDriver() {
        DriverRepository.instanceWebBrowser();
    }

    @AfterSuite
    public void closeBrowser() {
        DriverRepository.closeBrowser();
    }
}