package seleniumtutorials;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day8ahandlingwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.cssSelector("#contact-us")).click();
		
		Set<String>windows=driver.getWindowHandles();
		for(String Window:windows) {
			if(!Window.equals(parentWindow)) {
				driver.switchTo().window(Window);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl()); 
		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
	    WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")); 
	    WebElement email_address  = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")); 
	    WebElement message  = driver.findElement(By.cssSelector("#contact_form > textarea"));
	    WebElement submit_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
	    
	    first_name.sendKeys("Rasmila");
	    last_name.sendKeys("Khatri");
	    email_address.sendKeys("info.rasmila@gmail.com");
	    message.sendKeys("i am learning selenium");
	    submit_button.click();
	    
	    driver.switchTo().window(parentWindow); 
	    System.out.println(driver.getCurrentUrl()); 
	    
		

	}

}
