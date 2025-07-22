package com.omrbranch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass {

	By textBookingsCount = By.xpath("//android.widget.TextView[contains(@text,'Bookings')]");

	By txtSearchBooking=By.xpath("//android.widget.EditText[@content-desc=\"Search By Booking #\"]");
	By textHotelName=By.xpath("//android.widget.TextView[@resource-id=\"hotel_name\"]");
	By textHotelPrize=By.xpath("//android.widget.TextView[@resource-id=\"hotel_price_with_tax\"]");

/*	
	
	@FindBy(xpath = "//button[@class='edit btn filter_btn']")
	private WebElement btnEdit;
	
	@FindBy(name = "check_out")
	private WebElement ddnUpdateCheckOut;

	@FindBy(xpath = "//a[text()='10']")
	private WebElement txtUpdateCheckOut;

	@FindBy(xpath = "//button[@type='submit' and contains(text(),'Confirm')]")
	private WebElement btnConfirm;

	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement textAlertMsg;
	
	@FindBy(xpath = "//a[@class='cancle btn filter_btn']")
	private WebElement btnCancel;

	@FindBy(xpath = "//button[contains(text(),'Cancelled')]")
	private WebElement btnCancelled;
*/
}
