package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
//4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
//5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
//6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
//7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Aditi");
//8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Ghosh");
//9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Payel");
//10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Aditi");
//11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Quality Assurance");
//12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createContactForm_description")).sendKeys("Description Entered");
//13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("aditighosh078@gmail.com");
//14. Select State/Province as NewYork Using Visible Text
		WebElement dd1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByVisibleText("New York");
//15. Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
//16. Click on edit button
		driver.findElement(By.linkText("Edit")).click();
//17. Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
//18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note Entered");
//19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
//20. Get the Title of Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
	}

}