package star2344.star2344;



import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Switchto=driver.findElement(By.linkText("Widgets"));
		Actions act=new Actions(driver);
		act.moveToElement(Switchto).build().perform();
		Thread.sleep(5000);
		WebElement click=driver.findElement(By.linkText("AutoComplete"));
		click.click();
		Thread.sleep(5000);
		WebElement search=driver.findElement(By.id("searchbox"));
		search.sendKeys("india");
		Thread.sleep(5000);
		List<WebElement> ser= driver.findElements(By.xpath("//*[@id=\"menucontainer\"]"));
		
		System.out.println(ser.size());
		for(WebElement e4:ser) {
			String sr=e4.getText().trim();
			System.out.println(e4.getText());
			if(sr.equalsIgnoreCase("india")) {
			Thread.sleep(3000);
				e4.click();
				
			}
		}
//		for (WebElement suggestion : suggestions) {
//        String text = suggestion.getText().trim();
//        System.out.println(text);
//        if (text.equalsIgnoreCase("india")) {
//            suggestion.click();
//            break; // Exit the loop after clicking on the "india" suggestion
        }
		// TODO Auto-generated method stub

	

}
