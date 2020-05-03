package com.w2a.pages.accounts;

import org.openqa.selenium.By;

import com.w2a.Base.Page;

public class AccountsPage extends Page{
	

	public CreateAccountPage gotoCreateAccount() {

	Page.driver.findElement(By.xpath("//*[@id=\"topRightIcons\"]/span[1]/link-to/button")).click();
	
	return new	CreateAccountPage();
	}

	public void gotoImportAccount() {
		
	}
}
