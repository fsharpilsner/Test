package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class 1TestNG {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://automationpractice.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1TestNG() throws Exception {
    driver.get(baseUrl + "/index.php?controller=authentication&back=my-account");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("shop8@domainz.com");
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("Shopp1z");
    driver.findElement(By.id("SubmitLogin")).click();
    driver.findElement(By.linkText("Women")).click();
    driver.findElement(By.cssSelector("div.content_scene_cat_bg")).click();
    driver.findElement(By.cssSelector("a.img > img.replace-2x")).click();
    driver.findElement(By.cssSelector("a.quick-view > span")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | fancybox-frame1485140474134 | ]]
    driver.findElement(By.id("color_14")).click();
    driver.findElement(By.name("Submit")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
    driver.findElement(By.cssSelector("a[title=\"Match your favorites blouses with the right accessories for the perfect look.\"]")).click();
    driver.findElement(By.cssSelector("a.product_img_link > img.replace-2x.img-responsive")).click();
    driver.findElement(By.id("color_8")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
    driver.findElement(By.cssSelector("div.breadcrumb.clearfix > a[title=\"Tops\"]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'T-shirts')])[3]")).click();
    driver.findElement(By.cssSelector("li.sfHover > a.sf-with-ul")).click();
    driver.findElement(By.cssSelector("a[title=\"Browse our different dresses to choose the perfect dress for an unforgettable evening!\"]")).click();
    driver.findElement(By.cssSelector("a.product_img_link > img.replace-2x.img-responsive")).click();
    driver.findElement(By.id("color_24")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
    driver.findElement(By.cssSelector("div.breadcrumb.clearfix > a[title=\"Dresses\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.\"]")).click();
    driver.findElement(By.xpath("//img[@alt='Printed Chiffon Dress']")).click();
    driver.findElement(By.id("color_15")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
    driver.findElement(By.cssSelector("#2_8_0_10901 > i.icon-trash")).click();
    driver.findElement(By.cssSelector("i.icon-trash")).click();
    driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
    driver.findElement(By.linkText("Sign out")).click();
  }

  @AfterClass(alwaysRun = true)
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
