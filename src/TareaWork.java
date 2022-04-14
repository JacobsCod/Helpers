import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TareaWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("rahulshettyacademy");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("learning");
		
		driver.findElement(By.xpath("//body/div[@id='login']/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/label[2]/span[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		
		
		
		WebElement dropD = driver.findElement(By.cssSelector("select.form-control"));
		Select select = new Select(dropD);
		select.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
			
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> cells =driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
		
		for(int i = 0; i < cells.size(); i++ ) {
			
			cells.get(i).click();
		}
		
		

       driver.findElement(By.partialLinkText("Checkout")).click();		
		
		

	}

}
