package com.hrms.lib;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.WebDriver;
	public class Global{
		// std rule : To provide TestData & Objects of whole application
		public WebDriver driver;
		//        TestData
		// DT Var  VV
		public String url = "http://183.82.103.245/nareshit/login.php";
		public String un = "nareshit";
		public String pw = "nareshit";
		public String efn = "selenium";
		public String eln ="balu";
		
		//    Objects/Elements
		public String txt_loginname ="txtUserName";
		public String txt_password1 = "txtPassword";
		public String btn_login        = "Submit";
		public String link_logout  = "Logout";
		public String frame_empinfo1 ="rightMenu";
		public String btn_Add1      ="//input[@value='Add']";
		public String txt_efn1 ="txtEmpFirstName";
		public String txt_eln1 ="txtEmpLastName";
		public String btn_save1  = "btnEdit";
		// TestData
		
		
//	Objects// Elements Edit Emp
		public String editButton ="//input[@id='btnEditPers']";
		public String txt_efn  = "txtEmpFirstName";
		public String txt_eln  = "txtEmpLastName";
		public String Save ="btnEditPers";
		public String back ="//input[@value='Back']"	;	
		
}