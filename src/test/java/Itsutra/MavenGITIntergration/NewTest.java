package Itsutra.MavenGITIntergration;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void myTest() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(5000);
	  
	  driver.get("https://www.wikipedia.com");
	  Thread.sleep(5000);
	  driver.get("https://www.microsoft.com");
	  Thread.sleep(5000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
