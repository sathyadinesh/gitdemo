package rediffpatternhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffhome {
	WebDriver driver;
	public rediffhome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By shopping=By.xpath("//*[@class='shopicon relative']");
	By textbox=By.id("srchword");
	By search=By.xpath("//*[@class='newsrchbtn']");
	public WebElement shop() 
	{
		return driver.findElement(shopping);
	}
	public WebElement text() 
	{
		return driver.findElement(textbox);
	}
	public WebElement search() 
	{
		return driver.findElement(search);
	}

	
	

}
