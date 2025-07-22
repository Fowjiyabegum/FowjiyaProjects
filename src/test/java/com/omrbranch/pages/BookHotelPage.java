package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {

	public void method1()
	{
		System.out.println("Method1");
	}
	By textBookHotel=By.xpath("//android.widget.TextView[@resource-xpath ='book_hotel_text']");
	By rdoBookMyself=By.xpath("//android.widget.TextView[@text='Myself']");
	By ddnSalutation=By.xpath("//android.widget.TextView[@text='Select Salutation']");
	By txtMsSalutation=By.xpath("//android.widget.TextView[@text='Ms.']");
	By txtFirstName=By.xpath("//android.widget.EditText[@content-desc='book_hotel_first_name']");
	By txtLastName=By.xpath("//android.widget.EditText[@content-desc='book_hotel_last_name']");
	By txtPhone=By.xpath("//android.widget.EditText[@content-desc='book_hotel_mobile_no']");
	By txtEmail=By.xpath("//android.widget.EditText[@content-desc='book_hotel_email']");
	By chkGst=By.xpath("//android.view.ViewGroup[@resource-id='book_hotel_enter_gst']");
	
	By txtGstRegistration=By.xpath("//android.widget.EditText[@content-desc='book_hotel_registration']");
	By txtCompanyName=By.xpath("//android.widget.EditText[@content-desc='book_hotel_company_name']");
	By txtCompanyAddress=By.xpath("//android.widget.EditText[@content-desc='book_hotel_company_address']");
	By btnNextStepOne=By.xpath("//android.widget.TextView[@text='Next']");
	By txtSpecialRequest=By.xpath("");
	
	By btnNextStepTwo=By.xpath("//android.view.ViewGroup[@resource-id='book_hotel_next_button']");
	By lnkPaymentOption=By.xpath("//android.widget.TextView[@text='Visa, MasterCard, Amex, Discover']");
	By ddnPaymentType=By.xpath("//android.view.View[@resource-id='payment_type']");
	By txtDebitPaymentType=By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Debit Card']");
	By ddnCardType=By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Visa']");
	By txtCardNo=By.xpath("//android.widget.EditText[@resource-id='card_no']");
	By txtCardName=By.xpath("//android.widget.EditText[@resource-id='card_name']");
	By ddnMonth=By.xpath("//android.view.View[@resource-id='card_month']");
	By txtMonth=By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='August']");
	
	By ddnYear=By.xpath("//android.view.View[@resource-id='card_year']");
	By txtYear=By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"2028\"]");
	
	By txtCvv=By.xpath("//android.widget.EditText[@resource-id='cvv']");
	By btnSubmit=By.xpath("//android.widget.Button[@resource-id='submitBtn']");
	
	
	
		
}
