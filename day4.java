package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasmila\\Desktop\\chromedriver\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     
	     
	    driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
	    
	   // Test case 1
	    
	    //<h2 name="contactme" class="section_header">CONTACT US</h2>
	    //Xpath,CSS Selector
	    
	    
	    //tag name
	    WebElement headTwo =driver.findElement(By.cssSelector("h2"));
	   String a1= headTwo.getText();
	   System.out.println(a1);
	   
	   
	    
	    //class
	   WebElement headTwob = driver.findElement(By.cssSelector(".section_header"));
	   String a2 =headTwob.getText();
	   System.out.println(a2);
	   
	   
	   
	   //id
	  // <form action="contact_us.php" method="post" id="contact_form">
	   WebElement headTwoc = driver.findElement(By.cssSelector("#contact_form "));
	   boolean pre = headTwoc.isDisplayed();
	   System.out.println(pre);
	   
       
	  
	    //anyAttribute
	   //tageName[attribute="value"]
	   WebElement headThreeD = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
	   String a3= headTwo.getText();
	   System.out.println(a3);
	   
	   if(a3.equals("CONTACT US")){
		   System.out.println("test case pass");
	   }else {
		   System.out.println("test case fail");
	   }
	   
	   
	   
	   //Test case 2
	   
	   //Arrange
	   
	   //Action
	   driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
	   
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rasmila");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatri");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("info.rasmila@gmail.com");
	   driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("learning selenium");
	   driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
	   
	    
	   //Assertion
	   boolean a4 = driver.findElement(By.cssSelector("h1")).isDisplayed();
	   if(a4){
		   System.out.println("test case 2 pass");
	   }else {
		   System.out.println("test case 2 fail");
	   }
	   
	   //Testcase 3( in correcr email address)
	   //https://www.webdriveruniversity.com/Contact-Us/contactus.html
	   
	   driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rasmila");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatri");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("info.rasmilagmail.com");
	   driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("learning selenium");
	   driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
	   
	   boolean a5 = driver.findElement(By.cssSelector("body")).isDisplayed();
	   if(a5){
		   System.out.println("test case 3 pass");
	   }else {
		   System.out.println("test case 3 fail");
		  
	   }
	   
	   
	   //Test case 4
	   
	   driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
	   
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rasmila");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatri");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("info.rasmila@gmail.com");
	   driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("learning selenium");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).click();
	   
	   
	    String a6 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();
	    System.out.println(a6);
	    if (a6.isEmpty()) {
	    	System.out.println("test case 4 pass ");
	    } else {
	    	System.out.println("test case 4 fail");
	    	
	    }

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	}

}
