package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactoryFriend;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Request_timeoff extends Setup{
	@Test(priority = 1)
	public static void invalidLogin() {
		driver.findElement(By.cssSelector("#lemail")).sendKeys("prashanmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tnasdf");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
	}
	@Test(priority = 2)
	public static void Login() {
		driver.findElement(By.cssSelector("#lemail")).sendKeys("prashantjoshi0027@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tn3D2Ndx");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
	}
	@Test(priority = 3)
	public static void leaverequest() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Request Time Off')]")).click();
		driver.findElement(By.xpath("//input[@id='time-off-id-start-date']")).sendKeys("12/08/2024");
		driver.findElement(By.xpath("//input[@id='time-off-id-end-date']")).sendKeys("20/08/2024");
	
		
		driver.findElement(By.xpath("//div[contains(text(),'–Select–')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Vacation')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Send Request')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='employeeTab']")));	
	
		}

	@Test(priority = 4 )
	public static void addEmployee() {
		driver.findElement(By.xpath("//a[@id='employeeTab']")).click();
		driver.findElement(By.cssSelector("#employeeTab")).click();
		driver.findElement(By.xpath("//span[contains(text(),'New Employee')]")).click();
		driver.findElement(By.xpath("//input[@id='field_1-0']")).sendKeys("Ram prasad asdf");
		driver.findElement(By.xpath("//input[@id='field_2-0']")).sendKeys("Bahadur");
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/nav[1]/h1[1]/a[1]/img[1]")));	
		}
	@Test(priority = 5)
	public static void approveTimeoff() {
		driver.findElement(By.xpath("//header/nav[2]/span[1]/button[1]/ba-icon[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Time Off Requests')]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/p[1]/span[1]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/div[1]/div[2]/div[2]/div[1]/form[1]/input[1]")).click();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Requests')]")));	
		
		
	}
	@Test(priority = 6)
	public static void denyTimeoff() {
		driver.findElement(By.xpath("//header/nav[2]/span[1]/button[1]/ba-icon[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Time Off Requests')]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/p[1]/span[1]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/div[1]/div[2]/div[2]/div[1]/form[1]/input[2]")).click();
}
	@Test(priority = 7)
	public static void deleteEmployee() {
		driver.findElement(By.xpath("//a[@id='employeeTab']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Abbott, Charlotte')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Delete Employee...')]")).click();
		driver.findElement(By.xpath("//body/div[12]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Delete");
		driver.findElement(By.xpath("//span[contains(text(),'Yes, Delete this Employee')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/nav[1]/h1[1]/a[1]/img[1]")));	
	}
	@Test(priority = 8)
	public static void addNewReport(){
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		driver.findElement(By.xpath("//body/div[@id='poRoot']/main[@id='micro-container2']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("new report");
		driver.findElement(By.xpath("//body/footer[@id='siteFooter']/div[2]/div[1]/div[1]/button[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/nav[1]/h1[1]/a[1]/img[1]")));
	}
	@Test(priority = 9)
	public static void editWidget() {
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[18]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/button[1]/span[1]/svg[1]/path[1]")).click();
	}
	
	@Test(priority = 10)
	public static void approveAssetRequest() {
		driver.findElement(By.xpath("//header/nav[2]/span[1]/button[1]/ba-icon[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Asset Request')]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/nav[1]/h1[1]/a[1]/img[1]")));
	}
	@Test(priority = 11)
	public static void deleteRequest() {
		driver.findElement(By.xpath("//a[contains(text(),'Files')]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/label[1]")).click();
		driver.findElement(By.xpath("//header/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/nav[1]/h1[1]/a[1]/img[1]")));
	}
	@Test(priority = 12)
	public static void Logout() {
		driver.findElement(By.xpath("//header/nav[2]/span[3]/button[1]/img[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	}
	@AfterSuite
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
	}
	
