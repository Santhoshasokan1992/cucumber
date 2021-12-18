package org.stepdefenition;

import java.util.List;
import java.util.Map;

import org.utility.Base;
import org.utility.FbPojo;

import io.cucumber.java.en.*;

public class ListStepdefenition extends Base{
	
	@When("The user should type the valid username and invalid passwords")
	public void theUserShouldTypeTheValidUsernameAndInvalidPasswords(io.cucumber.datatable.DataTable d) throws InterruptedException {
	  List<String> l = d.asList();
		 FbPojo f=new FbPojo();
		    fill(f.getUsrTxt(),l.get(0) );
		    fill(f.getPassword(),l.get(2));
		
		
	}

	@When("The user should type the invalid username and valid passwords")
	public void theUserShouldTypeTheInvalidUsernameAndValidPasswords(io.cucumber.datatable.DataTable t) throws InterruptedException {
	   List<List<String>> li = t.asLists();
		
	   FbPojo f1=new FbPojo();
	   fill(f1.getUsrTxt(),li.get(0).get(1));
	   fill(f1.getPassword(),li.get(1).get(2));
	  
		
		
	}
	@When("The user should type the invalid username and invalid passwords")
	public void theUserShouldTypeTheInvalidUsernameAndInvalidPasswords(io.cucumber.datatable.DataTable m) throws InterruptedException {
	   Map<String, String> mp = m.asMap(String.class, String.class);
		
		
	   FbPojo f2=new FbPojo();
	   fill(f2.getUsrTxt(), mp.get("user1"));
	   fill(f2.getPassword(),mp.get("pass1"));
	  
		
		
		
		
	}
	@When("The user should type the invalid username and empty passwords")
	public void theUserShouldTypeTheInvalidUsernameAndEmptyPasswords(io.cucumber.datatable.DataTable maps) throws InterruptedException {
	   List<Map<String, String>> mps = maps.asMaps();
		
	   FbPojo f3=new FbPojo();
	   fill(f3.getUsrTxt(),mps.get(0).get("user") );
	   fill(f3.getPassword(),mps.get(1).get("pass"));
	  
		
		
	}


}
