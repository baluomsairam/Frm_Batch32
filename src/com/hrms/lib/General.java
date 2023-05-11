package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;
public class General extends Global {
//std rule; To provide all re-usable fun;/methods of whole application
	public void openApplication() {
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
	Log.info("application opend");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password1)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();	
		System.out.println("logout completed");
		Log.info("Logout completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}
	
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo1);
		System.out.println("Entered into frame");
		Log.info("Entered into frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from fame");
	}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add1)).click();
		driver.findElement(By.name(txt_efn1)).sendKeys(efn);
		driver.findElement(By.name(txt_eln1)).sendKeys(eln);
		driver.findElement(By.id(btn_save1)).click();
		System.out.println("Adding new emp");
	
	}
	public void EditEmployee() {
		driver.findElement(By.xpath(editButton)).click();
		driver.findElement(By.id(txt_efn)).sendKeys("Suresh");
		driver.findElement(By.id(txt_eln)).sendKeys("Ramesh");
		driver.findElement(By.id(Save)).click();
		driver.findElement(By.xpath(back)).click();
	}
	public void DeleteEmp() {
		
	}
}
