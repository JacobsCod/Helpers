import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		//Drop practices with select tag
		 WebElement StaticDrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 	
		 Select Dropdown = new Select(StaticDrop);	
		 
		 Dropdown.selectByVisibleText("USD");
		 
		 
		 
		 driver.close();
		 
		
		
		

	}

}
