package Testing;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class crossBrowserTest {

    WebDriver driver;

   
	
	@BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser) {
        System.out.println("Launching " + browser + " browser...");

        if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "D:\\eclips\\msedgedriver.exe");
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            driver = new EdgeDriver(options);
            System.out.println("Edge browser launched successfully.");
        } 
//        else if (browser.equalsIgnoreCase("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "D:\\eclips\\chromedriver-win64\\chromedriver.exe");
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--start-maximized");
//            driver = new ChromeDriver(options);
//            System.out.println("Chrome browser launched successfully.");
//        }else if (browser.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "D:\\eclips\\geckodriver.exe");
//            FirefoxOptions options = new FirefoxOptions();
//            options.addArguments("--start-maximized"); // Note: Firefox does not support this directly; workaround explained below.
//            driver = new FirefoxDriver(options);
//            System.out.println("Firefox browser launched successfully.");
//        }
 else {
            System.out.println("Unsupported browser: " + browser);
        }
    }

	 @Test
	  public void signup() throws Exception {
	    driver.get("https://www.thetestingworld.com/testings/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("fld_username")).click();
	    driver.findElement(By.name("fld_username")).sendKeys("maruf");
	    {
	      WebElement element = driver.findElement(By.name("fld_email"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.name("fld_email"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.name("fld_email"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.name("fld_email")).click();
	    driver.findElement(By.name("fld_email")).sendKeys("maruf@gmail.com");
	    driver.findElement(By.name("fld_password")).click();
	    driver.findElement(By.name("fld_password")).sendKeys("1234");
	    driver.findElement(By.name("fld_cpassword")).click();
	    driver.findElement(By.name("fld_cpassword")).sendKeys("1234");
	    driver.findElement(By.id("datepicker")).click();
	    driver.findElement(By.id("datepicker")).sendKeys("10/12/1990");
	    driver.findElement(By.name("phone")).click();
	    driver.findElement(By.name("phone")).sendKeys("01712345623");
	    driver.findElement(By.name("address")).click();
	    driver.findElement(By.name("address")).sendKeys("BUP,mirpur 12,Dhaka.");
	    driver.findElement(By.name("sex")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("sex"));
	      dropdown.findElement(By.xpath("//option[. = 'Male']")).click();
	    }
	    driver.findElement(By.id("stateId")).click();
	    driver.findElement(By.id("countryId")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("countryId"));
	      dropdown.findElement(By.xpath("//option[. = 'Bangladesh']")).click();
	    }
	    driver.findElement(By.id("stateId")).click();
	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    {
	      WebElement dropdown = driver.findElement(By.id("stateId"));
	      dropdown.findElement(By.xpath("//option[. = 'Dhaka']")).click();
	    }
	    driver.findElement(By.id("cityId")).click();
	    try {
	      Thread.sleep(4000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    {
	      WebElement dropdown = driver.findElement(By.id("cityId"));
	      dropdown.findElement(By.xpath("//option[. = 'Dhaka']")).click();
	    }
	    driver.findElement(By.name("zip")).click();
	    driver.findElement(By.name("zip")).sendKeys("1216");
	    driver.findElement(By.name("terms")).click();
	  }
	


 
    
	@AfterMethod
	@AfterClass
    public void tearDown() {
        // Wait a few seconds before closing to ensure page is loaded and interactions are completed
        try {
            Thread.sleep(3000); // Wait for 3 seconds before closing the browser
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        if (driver != null) {
            driver.quit();  // Close the browser
            System.out.println("Browser closed successfully.");
        }
    }
}