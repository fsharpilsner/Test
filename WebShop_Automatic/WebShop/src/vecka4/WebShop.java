package vecka4;

import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.support.ui.Select;

@RunWith(value=Parameterized.class)
public class WebShop {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  //private String email_Text;
  
  private String email;
  public WebShop(String email){
        
        this.email = email;
  }
  
  
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
    
    //driver.findElement(By.id("email_create")).sendKeys("shoppez190@domainz.com");
    
    driver.findElement(By.id("email_create")).sendKeys(email);
    
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

  
  @Parameters
  public static Collection<String []> data(){
		  
      String[][] data = new String[][] {
    	  {"FFFFgenrate_ad@hosty.se"}, {"fffffgravida.molestie@aaliquet.ca"}, {"tempus.non.lacinia@Nullatincidunt.org"},
    	  {"ac.facilisis@ipsumcursusvestibulum.co.uk"}, {"malesuada@temporloremeget.ca"}, {"non.luctus.sit@utpharetra.com"},
    	  {"eu.augue@tacitisociosqu.net"}, {"scelerisque.sed@sempererat.ca"}, {"malesuada.vel.convallis@nisi.com"},
    	  {"sed.facilisis@mattisvelit.edu"}, {"gravida.sagittis.Duis@vitae.org"}, {"Class.aptent.taciti@egestasSed.com"},
    	  {"eros.turpis@felis.org"}, {"est.mauris@quam.org"}, {"In.condimentum@NullamnislMaecenas.ca"},
    	  {"fermentum.vel.mauris@Suspendissealiquet.edu"}, {"pede.nec@perinceptoshymenaeos.ca"}, {"sed.dui.Fusce@Aliquameratvolutpat.co.uk"},
    	  {"est@inconsequatenim.org"}, {"pede.nec@perinceptoshymenaeos.ca"}, {"Suspendisse.tristique@nondapibus.edu"},
    	  {"quis.diam@auctorullamcorpernisl.org"}, {"ac@quamvel.edu"}, {"Nulla.semper@Aliquam.com"},
    	  {"porttitor.eros@odio.edu"}, {"risus.In@egetnisi.co.uk"}, {"Morbi.non@nuncsed.edu"},
    	  {"dui@Sedeget.co.uk"}, {"adipiscing.elit@placerat.co.uk"}, {"vehicula@turpis.co.uk"},
    	  {"fames.ac@turpisNullaaliquet.co.uk"}, {"mi.Aliquam.gravida@lorem.net"}, {"aliquet.Proin@DonecegestasDuis.com"},
    	  {"risus.Nulla.eget@euismodmauriseu.edu"}, {"Donec.nibh@nullaIntegerurna.org"}, {"lobortis.ultrices@dui.ca"},
    	  {"massa@egestasurna.net"}, {"luctus.vulputate.nisi@Integer.ca"}, {"elit.pellentesque@feugiatLoremipsum.edu"},
    	  {"Duis@tellusAenean.net"}, {"lorem.tristique.aliquet@quisdiam.edu"}, {"mollis.lectus.pede@nuncac.co.uk"},
    	  {"mauris@atauctorullamcorper.ca"}, {"vel@etnetuset.ca"}, {"nec@augueSedmolestie.com"},
    	  {"orci.quis@semperauctor.edu"}, {"a.purus.Duis@mauris.org"}, {"mauris.sagittis@vestibulummassa.ca"},
    	  {"risus@purus.org"}, {"varius.Nam.porttitor@orciquislectus.edu"}, {"a.tortor.Nunc@tempusscelerisque.org"},
    	  {"Nam.consequat.dolor@arcuMorbisit.co.uk"}, {"convallis.erat.eget@velitinaliquet.com"}, {"turpis@libero.net"},
     	  {"sem@Aenean.co.uk"}, {"vulputate@dolornonummy.com"}, {"sem@cursus.org"},
      	  {"arcu.Sed.et@euplacerat.org"}, {"Aenean@sit.net"}, {"in.magna@Morbineque.ca"},
      	  {"neque.et@nisiaodio.ca"}, {"augue.ac.ipsum@IntegermollisInteger.org"}, {"nunc.sed.pede@Quisqueimperdiet.edu"},
      	  {"Quisque.varius.Nam@Aliquam.ca"}, {"magnis@neque.org"}, {"dictum.augue.malesuada@nullaInteger.co.uk"},
      	  {"urna.convallis.erat@Donecelementum.net"}, {"Curabitur@euodiotristique.org"}, {"congue.turpis@sociosqu.edu"},
    	  {"risus.a.ultricies@turpis.ca"}, {"mauris@metus.edu"}, {"quam.a@dolor.net"},
    	  {"feugiat.tellus.lorem@nibh.edu"}, {"nascetur@arcuVestibulumante.net"}, {"cursus@mauris.co.uk"},
    	  {"vitae@Cras.co.uk"}, {"arcu.Sed.eu@turpisvitaepurus.org"}, {"Lorem.ipsum@urnaconvalliserat.net"},
    	  {"purus.Nullam@convallisin.org"}, {"dolor.Nulla.semper@nondui.org"}, {"nunc.id@tempus.ca"},
    	  {"at.nisi@pharetraQuisque.ca"}, {"ullamcorper.viverra@ac.com"}, {"dolor.Fusce.mi@semsempererat.com"},
    	  {"pharetra@eratvolutpatNulla.com"}, {"Proin@nuncsed.edu"}, {"semper@molestieintempus.edu"},
    	  {"odio.tristique@magnamalesuadavel.co.uk"}, {"Fusce.diam.nunc@Pellentesqueutipsum.net"}, {"ut.ipsum@esttemporbibendum.org"},
    	  {"iaculis@dolor.co.uk"}, {"Fusce.fermentum@sed.net"}, {"at.egestas.a@vel.edu"},
     	  {"Morbi.metus@anteMaecenasmi.ca"}, {"semper.tellus.id@Curabitur.com"}, {"pellentesque.a@acnullaIn.net"},
      	  {"Aenean.eget.metus@faucibusorciluctus.edu"}, {"Cras@diamnuncullamcorper.com"}, {"Nullam.feugiat@velpedeblandit.edu"},
      	  {"libero@blandit.edu"}

      };
	  
	  
	 /*
	  * ****?????***************************
		  StringBuilder builder = new StringBuilder();
		  for (int i=0; i<3; i++)
		  {
			  for (int j=0; j<3; j++)
			  {
				  builder.append("buyW_");
				  builder.append(String.valueOf(j));
				  builder.append("@host.se");
				  data[i][j]=builder.toString();  
			  }
			  			  
			  //Arrays.fill (data, builder.toString());
		  }			        
      ***************************************
      */
      return Arrays.asList(data);
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
