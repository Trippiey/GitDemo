import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// format it to get actual vegetable name
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// Thread.sleep(4000); //As "Add to Cart" text is getting changed to "Added"

			// check whether name you extracted is present in array or not
			// convert array into array list for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on Add to cart
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click(); //Text is getting changed after tapping
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length ) 
				{
					break;
				}
			}
		}
	}

}
