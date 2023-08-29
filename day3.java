package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//submit()
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
				
				
				//test case1
				//<h2 name="contactme" class="section_header">CONTACT US</h2>
				//xpath,css selector
				
				
				//tagName
				WebElement headTwo = driver.findElement(By.cssSelector("h2"));
				String a1 =headTwo.getText();
				System.out.println(a1);
				
				
				
				//class
				WebElement headTwob = driver.findElement(By.cssSelector(".section_header"));
				String a2 =headTwo.getText();
				System.out.println(a2);
				
				//id
			//<form action="contact_us.php" method="post" id="contact_form">
				WebElement headTwoc = driver.findElement(By.cssSelector("contact_form"));
				boolean pre =headTwoc.isDisplayed();
				System.out.println(pre);
				
				
				
				// anyAttribute
				//tagName[attribute= "value"]
				
				// Test 3
				WebElement headThreeD = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
				String a3 = headTwo.getText();
				System.out.println(a3);
				if(a3.equals("CONTACT US")) {
					System.out.println("Testcase 1 pass");
				}
				else {
					System.out.println("Testcase Fail");
				}
				// CONTACT US
				
				// Testcase2 (happy path)
				
				// Arrange 
				
				// Action 
				driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rasmila");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatri");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("info.rasmila@gmail.com");
				driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello learning selenium");
				driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
				
				// Assertion
				
				boolean a4 = driver.findElement(By.cssSelector("h1")).isDisplayed();
				if(a4){
					System.out.println("Testcase 2 pass");
				}
				else {
					System.out.println("Testcase 2 fail");
				}
				
				// Test case 3 (In-correct email address)
				driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rasmila");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatri");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("info.rasmila@gmail.com");
				driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello learning selenium");
				driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
				boolean a5 = driver.findElement(By.cssSelector("body")).isDisplayed();
				if(a5){
					System.out.println("Testcase 3 pass");
				}
				else {
					System.out.println("Testcase 3 fail");
				}
				
				// TestCase 4
				driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rasmila");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("khatri");
				driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("info.rasmila@gmail.com");
				driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello learning selenium");
				driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
				String a6 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();
				System.out.println(a6);
				if(a6.isEmpty()) {
					System.out.println("Test case 4 pass");
				}
				else {
					System.out.println("Test case 4 Fail");
				}
				
				
			
				
				
				
				
				
				
				
				
				

			}

		
				
				
				
						 
				 
				

	}

