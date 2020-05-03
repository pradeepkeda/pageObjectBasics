package com.w2a.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.accounts.AccountsPage;

public class TopMenu {

/*	WebDriver driver;
	
	public TopMenu (WebDriver driver) {
		this.driver=driver;
	}*/
	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountsPage gotoAccounts() {

//		driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
		Page.driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
	
	return new AccountsPage();
	}

	public void gotoActivities() {

	}

	public void gotoReports() {

	}

	public void gotoSignout() {

	}
}
