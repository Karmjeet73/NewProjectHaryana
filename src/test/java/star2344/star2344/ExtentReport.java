package star2344.star2344;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
    ExtentSparkReporter createreport;
    ExtentReports createtest;
    ExtentTest createlog;

    @BeforeTest
    public void setup() {
        createreport = new ExtentSparkReporter("MynewReport.html");
        createtest = new ExtentReports();
        createtest.attachReporter(createreport);
        createtest.setSystemInfo("Operating_System", "Windows");
        createtest.setSystemInfo("Browser", "Chrome");
        createtest.setSystemInfo("Environment", "Testing");
        createtest.setSystemInfo("User", "Karmjeet");
        createreport.config().setDocumentTitle("MyDemoProject");
        createreport.config().setReportName("Project_Name");
        createreport.config().setTheme(Theme.DARK);
    }

    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            createlog = createtest.createTest("Login Test");
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
            createlog.info("Navigated to OrangeHRM login page");
            driver.manage().window().maximize();
            Thread.sleep(5000);

            WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
            username.sendKeys("Admin");  // Replace with actual username
            createlog.info("Entered username");

            WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
            password.sendKeys("admin123");  // Replace with actual password
            createlog.info("Entered password");

            WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
            submit.click();
            createlog.info("Clicked submit button");

            Thread.sleep(5000);

            String title = driver.getTitle();
            createlog.info("Page title after login: " + title);
            if (title.equals("OrangeHRM")) {
                createlog.pass("Login test passed");
            } else {
                createlog.fail("Login test failed");
            }
        } catch (Exception e) {
            createlog.fail(e.getMessage());
        } finally {
            driver.quit();
            createlog.info("Browser closed");
            createtest.flush();
        }
    }
}
