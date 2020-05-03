package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.Base.Page;

public class HomePage extends Page {


	public void  goToFreeSignUp() {
		 
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[5]")).click();
		 
	 }
	 
	public LoginPage Login() {
		 
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[4]")).click();
		
	return new LoginPage();	
	}
	
	public void Customers() {
		 
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[1]")).click();
	}
	
	public void Support() {
		 
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
	}
	
	public void goToLearnMore() {
		 
	}

	public void FotterLinks() {
		 
	 }
}
