package org.utility;
import org.utility.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipPojo extends Base {
	
	public FlipPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailTxt ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passTxt ;

	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginBtn ;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
}
