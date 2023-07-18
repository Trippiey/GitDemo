import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        Thread.sleep(2000);
       driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/a[1]")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        {
        	System.out.print("Return Date field is disabled");
        	Assert.assertFalse(false);
        }
        else
        {
        	Assert.assertTrue(true);
        }
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("hrefIncAdt")).click();
        for(int i=1;i<4;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(1);
    //    driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
   //     driver.findElement(By.cssSelector("input[value='Search']")).click();
        driver.findElement(By.xpath("//input[@value='Search']")).click();	
        }

}
