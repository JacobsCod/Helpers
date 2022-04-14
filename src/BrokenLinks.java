import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
	}

}
