package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoDemo extends Base {
	
	public PojoDemo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement first;

	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement last;

	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pass;

	@FindBy(xpath="//input[@placeholder='UserName']")
	private WebElement userName;

	
	@FindBy(xpath="//input[@pattern='\\d*']")
	private WebElement mobno;

	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement maleBtn;
	
	@FindBy(xpath="//input[@placeholder='name@example.com']")
	private WebElement email;
	
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement month;

	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement year;

	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--013 react-datepicker__day--weekend']")
	private WebElement date;

	@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	private WebElement sub;
	
	@FindBy(linkText="//label[text()='Music']")
	private WebElement music;
	
	@FindBy(id="uploadPicture")
	private WebElement upload;
	
	@FindBy(id="currentAddress")
	private WebElement address;
	
	@FindBy(xpath="(//div[@aria-hidden='true'])[1]")
	private WebElement state;
	
	
	@FindBy(linkText="//div[text()='Haryana']")
	private WebElement haryan;
	
	
	@FindBy(xpath="(//div[@aria-hidden='true'])[2]")
	private WebElement city;
	
	
	@FindBy(linkText="//div[text()='Karnal']")
	private WebElement kar;
	
	@FindBy(id="submit")
	private WebElement submitBtn;

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getMobno() {
		return mobno;
	}

	public WebElement getMaleBtn() {
		return maleBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSub() {
		return sub;
	}

	public WebElement getMusic() {
		return music;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getHaryan() {
		return haryan;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getKar() {
		return kar;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	

	





}
