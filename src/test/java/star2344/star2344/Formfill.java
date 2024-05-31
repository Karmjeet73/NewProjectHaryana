package star2344.star2344;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formfill {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karmjeet.mor\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement fullname=driver.findElement(By.xpath("//input[@type='text']"));
		fullname.sendKeys("karmjeet");
		System.out.println("Enter full name");
		WebElement Lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Lastname.sendKeys(" mor");
		System.out.println("Enter lAST NAME");
		WebElement ADDRESS=driver.findElement(By.xpath("//textarea[@rows='3']"));
		ADDRESS.sendKeys(" ROHTAK ROAD JIND");
		System.out.println("Enter address ");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("karmjeetmor73@gmail.com");
		System.out.println("Enter emailaddress ");
		WebElement mobile=driver.findElement(By.xpath("//input[@type='tel']"));
		mobile.sendKeys("9729951696");
		System.out.println("Enter mobile");
			WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio']")); // Adjust the XPath accordingly
		radioButton.click();
		// Check if the radio button is selected
		boolean isSelected = radioButton.isSelected();
		// Print the state of the radio button
		System.out.println("Radio button is selected: " + isSelected);
		WebElement checkbox1=driver.findElement(By.id("checkbox1"));
		checkbox1.click();
		if(checkbox1.isSelected()) {
			System.out.println("checkbox1 is selected");}
		else {
			System.out.println("not selected ");
		}
		WebElement checkbox2=driver.findElement(By.id("checkbox2"));
		checkbox2.click();
		if(checkbox2.isSelected()) {
			System.out.println("checkbox2 is selected");}
		else {
			System.out.println("not selected ");
		}
		WebElement checkbox3=driver.findElement(By.id("checkbox3"));
		checkbox3.click();
		if(checkbox3.isSelected()) {
			System.out.println("checkbox3 is selected");}
		else {
			System.out.println("not selected ");
		}
		WebElement Lanaguage = driver.findElement(By.xpath("//*[@id='msdd']"));
		Lanaguage.click();

		List<WebElement> languageOptions = driver.findElements(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li/a"));
		List<String> languageTexts = new ArrayList<>();

		for (WebElement option : languageOptions) {
		    String text = option.getText();
		    languageTexts.add(text);
		}

		System.out.println("Selection list are following ways.................:");
		for (int i = 0; i < languageTexts.size(); i++) {
		    System.out.println("Option " + (i + 1) + ": " + languageTexts.get(i));
		}


		
		WebElement dropdown = driver.findElement(By.id("msdd"));
		List<WebElement> selectedOptions = dropdown.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[5]/a"));
		System.out.println("Selected Options:  ................................................................." );
		for (WebElement option : selectedOptions) {
			
		    System.out.println("Selected option is..........."+option.getText());
		    option.click();
		}WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[6]/a"));
		dropdown1.click();
		

Select skills=new Select(driver.findElement(By.id("Skills")));
skills.selectByValue("Backup Management");
WebElement selectedOption = skills.getFirstSelectedOption();
//System.out.println("Selected Skill is ==: " + selectedOption.getText());
List<WebElement> skillsList = skills.getOptions();

System.out.println("List of Skills:");
for (int i = 0; i < skillsList.size(); i++) {
    WebElement skill = skillsList.get(i);
    System.out.println((i + 1) + ". " + skill.getText());
}System.out.println("Selected Skill is ==: " + selectedOption.getText());
//Select Country
WebElement Country =driver.findElement(By.xpath("//span[@role='combobox']"));
Country.click();
WebElement Seartchbox=driver.findElement(By.xpath("//input[@type='search']"));
Seartchbox.sendKeys("Australia");
WebElement Seartchclick=driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li"));
 Seartchclick.click();
//DOB
Select year=new Select(driver.findElement(By.id("yearbox")));
year.selectByValue("1998");
WebElement year2=year.getFirstSelectedOption();
//System.out.println(year2.getText());
List<WebElement> year1=year.getOptions();
for(WebElement e4:year1) {
	
	System.out.println("year=="+e4.getText());
}System.out.println("select year"+year2.getText());
//month selection
WebElement Month=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
Select month=new Select(Month);
month.selectByValue("March");
WebElement mon=month.getFirstSelectedOption();

List <WebElement> month1=month.getOptions();
for(WebElement e5:month1) {
	System.out.println(e5.getText());
}System.out.println("Selected month=="+mon.getText());
//Day Selection
Select day=new Select(driver.findElement(By.id("daybox")));
day.selectByValue("22");
WebElement day2=day.getFirstSelectedOption();
List<WebElement> day1 = day.getOptions();
for (int i = 0; i < day1.size(); i++) {
    WebElement e6 = day1.get(i);
    System.out.println("Day: " + i );


}System.out.println("selected day=="+day2.getText());
WebElement Password=driver.findElement(By.id("firstpassword"));
Password.sendKeys("karmjeetmor97@");
WebElement Password2=driver.findElement(By.id("secondpassword"));
Password2.sendKeys("karmjeetmor97@");
WebElement Submit=driver.findElement(By.id("submitbtn"));
Submit.click();




	

	
	
//	


	
	
	
}
			
		
			}
	
		

//		System.out.println(language1.getText());
//		
		




		

	


