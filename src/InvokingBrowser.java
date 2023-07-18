import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokingBrowser {

	public static void main(String[] args) {
		
		// Invoking Chrome Browser
	      System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
        
       // Invoking Firefox Browser
		  System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\GeckoDriver\\geckodriver.exe");
          WebDriver driver1 = new FirefoxDriver();
          
       // Invoking Microsoft Edge Browser
  		  System.setProperty("webdriver.edge.driver", "C:\\Drivers\\EdgeDriver\\msedgedriver.exe");
            WebDriver driver2 = new EdgeDriver();
            
            
            driver.get("https://www.linkedin.com/");
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
          
	}

}
