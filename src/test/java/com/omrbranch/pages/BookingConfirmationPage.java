package com.omrbranch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmationPage extends BaseClass {


	By textBookConfirm=By.xpath("//android.widget.TextView[contains(@text, 'Booking is Confirmed')]");
	By textHotelName=By.xpath("//android.widget.TextView[contains(@text, 'is booked!')]");
	By btnMyBooking=By.xpath("//android.widget.TextView[@text='My Booking']");
	
	
	}
