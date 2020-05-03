package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.Base.Page;

public class LoginPage extends Page{
		 

	public  ZohoAppPage doLogin(String username ,String password)
	{
		driver.findElement(By.name("LOGIN_ID")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
		
		driver.findElement(By.name("PASSWORD")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
			
		return new ZohoAppPage();
	}

}
