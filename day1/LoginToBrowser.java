package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")) .sendKeys("kalaivanan1125@gmail.com");
		
		driver.findElement(By.id("pass")) .sendKeys("Vanan@1995");
		
		driver.findElement(By.name("login")).click();
		
		String title =driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Facebook – log in or sign up")) {
			System.out.println("login is successful");
		}else {
			System.out.println("login is not successful");
		}
		Thread.sleep(5000);
		driver.close();
		
			
	}

}
