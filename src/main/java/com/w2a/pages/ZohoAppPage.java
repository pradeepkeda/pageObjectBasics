package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.Base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {


	public CRMHomePage gotoCRM() {
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[6]/div/a/span")).click();
	 
		 return new CRMHomePage();
	}

	 public void Books() {
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[1]/div/a/span")).click();
	 }

	 public void Calendar() {
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[2]/div/a/div")).click();
	 }
	 
}
