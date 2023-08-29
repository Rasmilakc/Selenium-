package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//sendKeys();
		
		//program1
		
//		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//		first_name.sendKeys("Rasmila");
		
		//click()
//		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//	    WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")); 
//	    WebElement email_address  = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")); 
//	    WebElement message  = driver.findElement(By.cssSelector("#contact_form > textarea"));
//	    WebElement reset_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
//	    
//	    
//	    first_name.sendKeys("Rasmila");
//	    last_name.sendKeys("Khatri");
//	    email_address.sendKeys("info.rasmila@gmail.com");
//	    message.sendKeys("i am learning selenium");
//	    reset_button.click();
//	    driver.close();
	    
		
		//clear()
		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		first_name.sendKeys("Rasmila");
		first_name.clear();
		
		
		//<h2 name="contactme" class="section_header">CONTACT US</h2>
		
		
		//text()
//		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
//		String text = heading.getText();
//		System.out.println(text);
		
		
		
		//program 2
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//is_displayed()
		//a1----true
		WebElement header = driver.findElement(By.cssSelector("h1"));
		boolean a1=header.isDisplayed();
		System.out.println(a1);
		
		//is_enabled()
		//a2------true
		WebElement enabled_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		boolean a2 = enabled_radioB.isEnabled();
		System.out.println(a2);
		
		//a3----false
		WebElement disabled_radioB  = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)")); 
		  boolean q3 = disabled_radioB.isEnabled(); 
		  System.out.println(q3); 
		
		
		
		
		//is selected()
		//a4----true
		WebElement selected_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		boolean a4 =  selected_radioB.isSelected();
		System.out.println(a4);
		
		
		
		
				
	}

}
