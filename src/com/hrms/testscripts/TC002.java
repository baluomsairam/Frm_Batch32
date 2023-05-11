package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test
	public void tc002() throws Exception {
//public static void main(String args[])throws Exception {
	//Test Steps
	General obj  = new General();
	obj.openApplication();
	Thread.sleep(3000);
	obj.login();
	Thread.sleep(3000);
	obj.enterFrame();
	Thread.sleep(3000);
obj.addNewEmp();
Thread.sleep(3000);
obj.EditEmployee();
obj.exitFrame();
Thread.sleep(3000);
obj.logout();
Thread.sleep(3000);
obj.closeApplication();
}
}

