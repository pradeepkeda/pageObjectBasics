package com.w2a.pages.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.w2a.Base.Page;

public class CreateAccountPage  extends Page{
	
	
	public void CreateAccount(String username) {
		
		driver.findElement(By.xpath("//*[@id=\"Crm_Accounts_ACCOUNTNAME\"]")).sendKeys(username);
	}
	

}
