package org.utility;


import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class FbPojo extends Base{
	
	public FbPojo() {
	PageFactory.initElements(driver, this);
	}
	
	
	
	//And operator
	@FindBy(id="email")
	private WebElement usrTxt;
	//OR operator
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginbtn;

	public WebElement getUsrTxt() {
		return usrTxt;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

	
	
}
