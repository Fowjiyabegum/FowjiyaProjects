package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omrbranch.baseclass.*;

public class LoginPage extends BaseClass {

	
	By txtEmail=By.xpath("//android.widget.EditText[@content-desc='Email Address']");
	By txtPassword=By.xpath("//android.widget.EditText[@content-desc='Password']");
	By btnLogin=By.xpath("//android.view.ViewGroup[@resource-id='login_button']");
	By txtLoginErrorMessage=By.xpath("//android.widget.TextView[@resource-id=\"login_error_message\"]");
	
	public void login(String userName,String password) {
		elementSendKeys(findLocatorBy(txtEmail),userName);
		elementSendKeys(findLocatorBy(txtPassword),password);
		clickLoginButton();
	}
	
	public String getLoginErrorMessage()
	{
		String elementGetText=elementGetText(findLocatorBy(txtLoginErrorMessage));
		return elementGetText;
	}
	public void clickLoginButton() {
		
		elementClick(findLocatorBy(btnLogin));
	}
	public By getBtnLogin() {
		return btnLogin;
	}
	
	
/*	public WebElement getTextErrorLogin() {
		return textErrorLogin;
	}*/

	
}