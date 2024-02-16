package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountInLeafTap {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")) .sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("TestLeaf Automation Platform")) {
			
			System.out.println("Login is Successful");
			
				
		}
		else {
			System.out.println("Login is Unsucessful");
		
		}
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Create Account")) .click();
		driver.findElement(By.id("accountName")).sendKeys("Kalaivanan");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement data1 = driver.findElement(By.name("industryEnumId"));
		Select opt1=new Select(data1);
		opt1.selectByValue("IND_HARDWARE");

		WebElement data2 = driver.findElement(By.name("ownershipEnumId"));
		Select opt2=new Select(data2);
		opt2.selectByVisibleText("S-Corporation");
		
		WebElement data3 = driver.findElement(By.name("dataSourceId"));
		Select opt3=new Select(data3);
		opt3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement data4 = driver.findElement(By.id("marketingCampaignId"));
		Select opt4=new Select(data4);
		opt4.selectByIndex(6);
		WebElement data5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select opt5=new Select(data5);
		opt5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
