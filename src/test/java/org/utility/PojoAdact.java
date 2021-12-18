package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAdact extends Base {
	
	public PojoAdact() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userTxt;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passTxt;
	
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;

	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomNo;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOut;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultNo;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childNo;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radioBtn;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;

	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastName;

	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccNo;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement ccType;

	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expMonth;

	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expYr;

	@FindBy(id="cc_cvv")
	private WebElement ccvNo;

	@FindBy(xpath="//input[@name='book_now']")
	private WebElement bookBtn;
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderNo;

	public WebElement getUserTxt() {
		return userTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultNo() {
		return adultNo;
	}

	public WebElement getChildNo() {
		return childNo;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYr() {
		return expYr;
	}

	public WebElement getCcvNo() {
		return ccvNo;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

}
