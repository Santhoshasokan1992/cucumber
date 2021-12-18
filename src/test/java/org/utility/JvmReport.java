package org.utility;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public  class JvmReport extends Base {
	
	public static void generateJvmReport(String jsonpath) {
		File f=new File(System.getProperty("user.dir")+"\\target\\Reports");
		
	 
		
		
		Configuration con=new Configuration(f, "Fblogin");
		con.addClassifications("browser", "chrome");
		con.addClassifications("os", "windows10");
		con.addClassifications("tool", "eclipse");
		
		
	List<String> li=new ArrayList<String>();
	li.add(jsonpath);
		
		
		ReportBuilder r=new ReportBuilder(li, con);
		r.generateReports();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
