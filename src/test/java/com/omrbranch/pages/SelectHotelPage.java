package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {

	By textselectHotel=By.xpath("//android.widget.TextView[@resource-id='select_hotel_text']");
	By textHotelName=By.xpath("//android.widget.TextView[@resource-id='hotel_name']");
	By textHotelPrizes=By.xpath("//android.widget.TextView[@resource-id='hotel_price_with_tax']");
	By btnContinue=By.xpath("//android.widget.TextView[@text='Continue']");

	

}
