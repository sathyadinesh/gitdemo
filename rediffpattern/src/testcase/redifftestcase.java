package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import rediffpatternhome.rediffhome;
import rediffpatternhome.redifflogin;

public class redifftestcase {
@Test
public void home()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	rediffhome rh=new rediffhome(driver);
	rh.shop().click();
	rh.text().sendKeys("apple");
	rh.search().click();
	redifflogin rl=new redifflogin(driver);
	rl.signin().click();
	rl.login().sendKeys("hai");
	rl.pass().sendKeys("123");
	rl.proceed().click();
	
}
}
