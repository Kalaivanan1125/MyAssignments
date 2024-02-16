package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")) .sendKeys("kalaivanan1125@gmail.com");
		driver.findElement(By.id("pass")) .sendKeys("Vanan@1995");
		driver.findElement(By.name("login")) .click();
		driver.findElement(By.linkText("Find your Account and Login")) .click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		if(title.contains("Log in to Facebook")) {
			System.out.println("Login is Successful");
		}
		else {
			System.out.println("Login is Unsuccessful");
		}
		Thread.sleep(3000);
		driver.close();
		
		
				

	}

}
