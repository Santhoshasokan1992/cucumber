package org.utility;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
		public static WebDriver driver;
		public static Actions a;
		public static Robot r;
		 public static Alert al;
		 public static TakesScreenshot ts;
		 public static JavascriptExecutor js;
		 public static Select s;
		
		
		
		public static void launchChrome() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
		public static void launchUrl(String url) {
			driver.get(url);
		}
		public static void winmax() {
			driver.manage().window().maximize();
		}
		public static void title() {
			String title = driver.getTitle();
			System.out.println(title);
			}
		public static void presentUrl() {
			driver.getCurrentUrl();
			}
		public static void fill(WebElement ele, String value) {
			ele.sendKeys(value);

		}
		public static void btnClick(WebElement ele) {
			ele.click();
		}
		
		public static void actionInitialize() {
			a=new Actions(driver);
			
		}
		public static void mouseMove(WebElement ele) {
			a.moveToElement(ele).perform();
	}
		
		public static void pickAndPlace(WebElement ele1,WebElement ele2) {
		a.dragAndDrop(ele1, ele2).perform();

		}
		public static void caps(WebElement ele,String value) {
			a.keyDown(Keys.SHIFT).sendKeys(ele,value).keyUp(Keys.SHIFT).build().perform();

		}
		public static void leftDouble(WebElement ele) {
			a.doubleClick(ele).perform();

		}
		public static void rightClick(WebElement ele) {
			a.contextClick(ele).perform();
			}
		public static void keyboard() throws AWTException {
			r=new Robot();
		}
		public static void enter() throws AWTException {
			r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} 
		public static void tab() throws AWTException {
			r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		} 
		public static void copyKey() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			
		}
		public static void pasteKey() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
		}
		public static String getvalue(int r, int cell) throws IOException {
			//location of excel
			File f=new File("C:\\Users\\Asokan\\Desktop\\maven\\Cucumber\\target\\datadrive\\data.xlsx");
			
			//read the file from location
			FileInputStream fi=new FileInputStream(f);
			
			//type of workbook by type casting
			Workbook w=new XSSFWorkbook(fi);
			
			
			//get the sheet from workbook
			Sheet s = w.getSheet("details");
			
			Row row = s.getRow(r);
			//System.out.println(row);
			
			Cell colu = row.getCell(cell);
			System.out.println(colu);
			
			//to print cell type if 1=string 0=date or number
					int type = colu.getCellType();
					//System.out.println(type);
					String value="";
					//string
					if (type==1) {
						
						//to get the string value
						 value = colu.getStringCellValue();
						System.out.println(value);
					}	
						
					//if 0=integer or dateformat
						else if (type==0) {
							//if it is a date format
							if (DateUtil.isCellDateFormatted(colu)) {
								Date d= colu.getDateCellValue();
						
								
								
								//to get date fprmat initialize the class
								SimpleDateFormat sim=new SimpleDateFormat("dd ,MMMM,yyyy");
								
								 value= sim.format(d);
								System.out.println(value);
								
							}
							else {
								double n = colu.getNumericCellValue();
								//newDatatype ref=(newDatatype)old variable;
								
								long l=(long) n;
							 value = String.valueOf(l);
								System.out.println(value);
								
							}
							
						
							
						}
					return value;
						
					}
		
	
		
public static void quitBrowser() {
	driver.quit();
}
public static void refresh() {
	driver.navigate().refresh();

}
public static void alertAccept() {
	Alert al = driver.switchTo().alert();
	al.accept();
}
public static void alertReject() {
	al.dismiss();

}
public static void promptAlert(String send) {
	
	al.sendKeys(send);
	al.accept();
}
public static void alertText() {
	String text = al.getText();
	System.out.println(text);

}
public static void screenSnap(String name) throws IOException {
	ts=(TakesScreenshot)driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File per=new File("C:\\Users\\Asokan\\Desktop\\maven\\Cucumber\\target\\screenshot\\"+name+".jpg");
FileUtils.copyFile(temp, per);
}

public static void jsSendValue(String text,WebElement ele) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','text')", ele);
	

}
public static void jsGetValue(WebElement ele) {
	Object ustext = js.executeScript("arguments[0].getAttribute('value',)", ele);
	System.out.println(ustext);

}

public static void scrolldown( WebElement ele) {
	js.executeScript("arguments[0].scrollIntoView(true)", ele);

}
public static void scrollup(WebElement ele) {
	js.executeScript("arguments[0].scrollIntoView(false)", ele);

}
public static void iframe() {
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
frames.size();
for (int i = 0; i < frames.size(); i++) {
	WebElement ele = frames.get(i);
	String text = ele.getText();
	System.out.println(text);
}

}
public static String returnTitle() {
	String title = driver.getTitle();
	return title;


}
public static void excelWrite(int r,int c,String d) throws IOException {
	//location of excel
	File f=new File("C:\\\\Users\\\\Asokan\\\\Desktop\\\\maven\\\\FrameJunit\\\\target\\\\testdata\\\\data.xlsx");
	
	//read the file from location
	FileInputStream fi=new FileInputStream(f);
	
	//type of workbook by type casting
	Workbook w=new XSSFWorkbook(fi);
	
	
	//get the sheet from workbook
	Sheet s = w.getSheet("update");
	
	Row row = s.createRow(r);
	Cell cell = row.createCell(c);
	
	cell.setCellValue(d);
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	}
	
	

public static void createExcel(String name) throws IOException {
	File f=new File("C:\\Users\\Asokan\\Desktop\\maven\\Demo\\testData\\test.xlsx");
	boolean cf = f.createNewFile();
	
	Workbook w=new XSSFWorkbook();	
	w.createSheet(name);
	
}

public static void selectdrop(WebElement ele) {
	s=new Select(ele);

}
 public static void selectValue(String value) {
	s.selectByValue(value);

}
 public static void selectVisText(String value) {
		s.selectByVisibleText(value);

	}
 public static void selectIndex(int no) {
		s.selectByIndex(no);

	}


public static void getTextval(WebElement ele) {
	
String attribute = ele.getAttribute("value");
System.out.println(attribute);

}
public static void excelWriteWeb(int r,int c,WebElement ele) throws IOException {
	//location of excel
	
	
	String attribute = ele.getAttribute("value");
	System.out.println(attribute);

	
	File f=new File("C:\\Users\\Asokan\\Desktop\\maven\\FrameJunit\\target\\testdata\\data.xlsx");
	
	//read the file from location
	FileInputStream fi=new FileInputStream(f);
	
	//type of workbook by type casting
	Workbook w=new XSSFWorkbook(fi);
	
	
	//get the sheet from workbook
	Sheet s = w.getSheet("update");
	
	Row row = s.createRow(r);
	Cell cell = row.createCell(c);
	
	cell.setCellValue(attribute);
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	}

public static void impwait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


	

}







			
			
			
			


		
		
		
		
		
		
		
		
		
		
		
		
		
	



