package rediffpatternhome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class redifflogin {
WebDriver driver;
public redifflogin(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(linkText="Sign In")
WebElement signin;

@FindBy(name="logid")
WebElement login;

@FindBy(name="pswd")
WebElement pw;

@FindBy(xpath="//*[@value='Login']")
WebElement proceed;

public WebElement signin()
{
	return signin;
}
public WebElement login() 
{
	return login;
}
public WebElement pass() 
{
	return pw;
}
public WebElement proceed()
{
	return proceed;
}
}
