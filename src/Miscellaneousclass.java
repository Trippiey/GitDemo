import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//For class name first letter should be always Capital, and subsequent letter should be Small
public class Miscellaneousclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For variable name first letter should be always small, and subsequent letter should be Capital
		String nameFormat = "Shashank";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
	}

}
