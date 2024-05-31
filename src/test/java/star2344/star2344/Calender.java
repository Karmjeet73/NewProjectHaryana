package star2344.star2344;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Calender=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img"));
		Calender.click();
	String ExpectedDay = "22";
		String ExpectedMonth = "March";
		String ExpectedYear = "2019";

		// Find the actual month and year from the datepicker
		WebElement ActualMonthElement = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]"));
		ActualMonthElement.click();
		WebElement ActualYearElement = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]"));
		ActualYearElement.click();
		// Get the text of the actual month and year
		String ActualMonth = ActualMonthElement.getText();
		String ActualYear = ActualYearElement.getText();

		// Check if the actual month and year match the expected values
		if (ActualYear.equals(ExpectedYear) && ActualMonth.equals(ExpectedMonth)) {
		    // Open the datepicker
		    WebElement Calendar = driver.findElement(By.id("datepicker1"));
		    Calendar.click();
		    
		    // Find the day elements in the datepicker and click on the one matching the expected day
		    List<WebElement> DayElements = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//td[@data-month='" + ExpectedMonth + "']/a[text()='" + ExpectedDay + "']"));
		    for (WebElement dayElement : DayElements) {
		        dayElement.click();
		    }
		} else {
		    System.out.println("Actual month and year do not match the expected values.");
		}

//		}
////		WebElement Calender=driver.findElement(By.id("datepicker1"));
////		Calender.click();
////		List<WebElement> Calender1=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]"));
////		for(WebElement cal:Calender1) {
////			System.out.println(cal.getText());
////			cal.click();
////		}
////	
//
//		
//		
//	
	
	
//
	

	
	
	}}
