import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;
		
		String [] itemsNeeded = {"Cucumber","Brocolli"};
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5);
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.print(products);
		
		
		for(int i = 0; i < products.size(); i++) {
			
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(formattedname)) {
				driver.findElements(By.cssSelector("//button[text()='ADD TO CART']")).get(i).click();
				
				
				
				
				if (j==3) {
					break;
				}
			}
		}
		
		driver.quit();
		driver.close();

	}

}
