package org.stepdefenition;

import io.cucumber.java.en.*;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.utility.*;

public class FbLoginStepdefenition extends Base {
	


@Given("The user should Launch the Chrome Browser")
public void the_user_should_Launch_the_Chrome_Browser() {
	
    
}

@When("The user should type the url")
public void the_user_should_type_the_url() {
	
   
}

@When("The user should maximize the window")
public void the_user_should_maximize_the_window() {
	
    
}

@When("The user should type the valid username")
public void the_user_should_type_the_valid_username() {
   
}

@When("The user should type the invalid password")
public void the_user_should_type_the_invalid_password() {
	
    
}

@When("The user should click the Login button")
public void the_user_should_click_the_Login_button() throws InterruptedException {
	 FbPojo f=new FbPojo();
	 btnClick(f.getLoginbtn());
	 Thread.sleep(3000);
}

@Then("The user should navigate to incorrect credential page")
public void the_user_should_navigate_to_incorrect_credential_page() throws InterruptedException {

	
	String url = driver.getCurrentUrl();
	Thread.sleep(3000);
	Assert.assertTrue("verify the url", url.contains("privacy"));

	System.out.println("tc passed");
}
@When("The user should type the valid username and invalid password")
public void the_user_should_type_the_valid_username_and_invalid_password() throws IOException {
	 FbPojo f=new FbPojo();
	    fill(f.getUsrTxt(), getvalue(0, 0));
	    fill(f.getPassword(),getvalue(1, 0));
	    Assert.assertTrue(false);
	    
	
	
	
}
@When("The user should type the valid username {string} and invalid{string} password")
public void the_user_should_type_the_valid_username_and_invalid_password(String s1, String s2) {
	 FbPojo f=new FbPojo();
	    fill(f.getUsrTxt(), s1);
	    fill(f.getPassword(),s2);
	    
	
}






}
