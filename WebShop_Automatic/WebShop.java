package vecka4;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.support.ui.Select;

public class WebShop {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\kaveh\\Downloads\\geckodriver.exe");
	FirefoxProfile profile = null;
    driver = new FirefoxDriver();
    driver = new FirefoxDriver(new FirefoxBinary(), profile);
    baseUrl = "http://automationpractice.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testWebShop() throws Exception {
    driver.get(baseUrl + "/index.php");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).clear();
    driver.findElement(By.id("email_create")).sendKeys("shoppez190@domainz.com");
    driver.findElement(By.id("SubmitCreate")).click();
    driver.findElement(By.id("id_gender1")).click();
    driver.findElement(By.id("customer_firstname")).clear();
    driver.findElement(By.id("customer_firstname")).sendKeys("Shoppy");
    driver.findElement(By.id("customer_lastname")).clear();
    driver.findElement(By.id("customer_lastname")).sendKeys("Shoopz");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("Shopp1z");
    
    //new Select(driver.findElement(By.id("days"))).selectByVisibleText("4");
    //new Select(driver.findElement(By.xpath("//select[@id='days']"))).selectByVisibleText("regexp:4\\s+");
    new Select(driver.findElement(By.xpath("//select[@id='days']"))).selectByIndex(4);
    driver.findElement(By.cssSelector("option[value=\"4\"]")).click();
    

    //new Select(driver.findElement(By.id("months"))).selectByVisibleText("March");
    new Select(driver.findElement(By.xpath("//select[@id='months']"))).selectByIndex(11);
    driver.findElement(By.cssSelector("#months > option[value=\"12\"]")).click();

    //new Select(driver.findElement(By.id("years"))).selectByVisibleText("2009");
    new Select(driver.findElement(By.xpath("//select[@id='years']"))).selectByIndex(18);
    driver.findElement(By.cssSelector("option[value=\"2009\"]")).click();
    
    driver.findElement(By.id("newsletter")).click();
    driver.findElement(By.id("optin")).click();
    driver.findElement(By.id("firstname")).clear();
    driver.findElement(By.id("firstname")).sendKeys("Shoppy");
    driver.findElement(By.id("lastname")).clear();
    driver.findElement(By.id("lastname")).sendKeys("Shoopz");
    driver.findElement(By.id("company")).clear();
    driver.findElement(By.id("company")).sendKeys("Shop Everywhere");
    driver.findElement(By.id("address1")).clear();
    driver.findElement(By.id("address1")).sendKeys("Kungsträdgården 16, Box 144234 Mr Sh");
    driver.findElement(By.id("city")).clear();
    driver.findElement(By.id("city")).sendKeys("Seattle");
    new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Indiana");
    driver.findElement(By.cssSelector("#id_state > option[value=\"14\"]")).click();
    driver.findElement(By.id("postcode")).clear();
    driver.findElement(By.id("postcode")).sendKeys("10304");
    driver.findElement(By.id("phone_mobile")).clear();
    driver.findElement(By.id("phone_mobile")).sendKeys("+7178630459");
    driver.findElement(By.id("submitAccount")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
