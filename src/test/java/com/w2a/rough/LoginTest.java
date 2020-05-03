package com.w2a.rough;

import com.w2a.Base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.accounts.AccountsPage;
import com.w2a.pages.accounts.CreateAccountPage;
import com.w2a.pages.crm.CRMHomePage; 

public class LoginTest {


	public static void main(String[] args) {
		
		
		HomePage page=new HomePage();
		LoginPage lp= page.Login();
		
		ZohoAppPage zoapp =lp.doLogin("pradeep.tieto@gmail.com", "zoho@1234");
		
		 zoapp.gotoCRM();
		
		 AccountsPage account= Page.menu.gotoAccounts();
		 CreateAccountPage cap=account.gotoCreateAccount();

		cap.CreateAccount("Raman");
	}

}
