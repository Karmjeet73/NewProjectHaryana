package star2344.star2344;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locater {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
////		id
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("#login-button")).click();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		//linktext
		 driver.findElement(By.linkText("Sauce Labs Backpack")).click();
//		partiallylinktest
		 driver.findElement(By.partialLinkText("Sauce")).click();
////		css selector
//		//css with tag#id
		 driver.findElement(By.cssSelector("button#add-to-cart")).click();
		//css with attribute and classvalue  button.btn_primary 
		 driver.findElement(By.cssSelector("button.btn_primary")).click();
//		 count hyperlink
		 List<WebElement> star = driver.findElements(By.tagName("a"));
		 System.out.println("list of anchor tag are following ways...........................---------");
		 System.out.println(star.size());
		 for(WebElement e1:star ) {
			 System.out.println("list of anchor tag are following ways...........................---------");
			 System.out.println(e1.getText());
		 Select star1=new Select(driver.findElement(By.id("Skills")));
		 star1.selectByIndex(9);
		List <WebElement>star2=star1.getOptions();
		System.out.println(star1); 
		for(WebElement e2:star2) {
			System.out.println(e2.getText());
			
		Select year=new Select(driver.findElement(By.id("yearbox")));
		year.getFirstSelectedOption();
		List<WebElement>yearlist=year.getOptions();
		
		for(WebElement e4: yearlist) {
			System.out.println(e4.getText());
		 Select year1 = new Select(driver.findElement(By.id("yearbox")));
		 year1.selectByValue("1998");
//		

//		  Print the selected value directly
		 System.out.println("Selected year: " + year.getFirstSelectedOption().getText());

			String yearl=e4.getAttribute("1998");
			System.out.println("years is" +yearl);
			
			
//			String e3=e2.getAttribute("Android");
//			System.out.println(e3.charAt(4));
			
		}}}}}
//		 }
		 
		 
		 
		 
		 
		 
		
		
		
		
		

	


