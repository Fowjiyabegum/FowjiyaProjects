package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class ExploreHotelPage extends BaseClass {
	By textExploreHotel=By.xpath("//android.widget.TextView[@resource-id='search_explore_hotel']");
	By ddnState=By.xpath("//android.widget.TextView[@text='Select State']");
	By txtState=By.xpath("//android.widget.TextView[@text='Karnataka']");
	By ddnCity=By.xpath("//android.widget.TextView[@text='Select City']");
	By txtCity=By.xpath("//android.widget.TextView[@text='Bengaluru']");

	By ddnRoom=By.xpath("//android.view.ViewGroup[@resource-id=\'search_room_type_container\']/android.view.ViewGroup");

	By txtStandardRoomtype=By.xpath("//android.view.ViewGroup[@content-desc='Standard']");

	By txtDeluxeRoomtype=By.xpath("//android.view.ViewGroup[@content-desc='Deluxe']");
	By txtSuitetype=By.xpath("//android.view.ViewGroup[@content-desc='Suite']");
	By txtLuxuryRoomtype=By.xpath("//android.view.ViewGroup[@content-desc='Luxury']");
	By txtStudioRoomtype=By.xpath("//android.view.ViewGroup[@content-desc='Studio']");

	By ddnCheckIn=By.xpath("//android.widget.EditText[@content-desc='search_select_checkin']");
	By txtCheckIn=By.xpath("//android.view.View[@content-desc='03 July 2025']");

	By btnOkDate=By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
	By ddnCheckOut=By.xpath("//android.widget.EditText[@content-desc='search_select_checkout']");
	By txtCheckOut=By.xpath("//android.view.View[@content-desc='04 July 2025']");

	By ddnNoOfRoom=By.xpath("//android.widget.TextView[@text='No. Of Room']");
	By txtNoOfRoom=By.xpath("//android.widget.TextView[@text='1-One']");

	By ddnNoOfAdult=By.xpath("//android.widget.TextView[@text='No. Of Adults']");
	By txtNoOfAdult=By.xpath("//android.widget.TextView[@text='1-One']");

	By txtNoOfChild=By.xpath("//android.widget.EditText[@content-desc='search_no_of_children']");
	By btnSearch=By.xpath("//android.widget.TextView[@text='Search']");
	
	

	public By getTextExploreHotel() {
		return textExploreHotel;
	}



	public By getDdnState() {
		return ddnState;
	}



	public By getTxtState() {
		return txtState;
	}



	public By getDdnCity() {
		return ddnCity;
	}



	public By getTxtCity() {
		return txtCity;
	}



	public By getDdnRoom() {
		return ddnRoom;
	}



	public By getTxtStandardRoomtype() {
		return txtStandardRoomtype;
	}



	public By getTxtDeluxeRoomtype() {
		return txtDeluxeRoomtype;
	}



	public By getTxtSuitetype() {
		return txtSuitetype;
	}



	public By getTxtLuxuryRoomtype() {
		return txtLuxuryRoomtype;
	}



	public By getTxtStudioRoomtype() {
		return txtStudioRoomtype;
	}



	public By getDdnCheckIn() {
		return ddnCheckIn;
	}



	public By getTxtCheckIn() {
		return txtCheckIn;
	}



	public By getBtnOkDate() {
		return btnOkDate;
	}



	public By getDdnCheckOut() {
		return ddnCheckOut;
	}



	public By getTxtCheckOut() {
		return txtCheckOut;
	}



	public By getDdnNoOfRoom() {
		return ddnNoOfRoom;
	}



	public By getTxtNoOfRoom() {
		return txtNoOfRoom;
	}



	public By getDdnNoOfAdult() {
		return ddnNoOfAdult;
	}



	public By getTxtNoOfAdult() {
		return txtNoOfAdult;
	}



	public By getTxtNoOfChild() {
		return txtNoOfChild;
	}



	public By getBtnSearch() {
		return btnSearch;
	}



	public void searchHotel(String noOfChild) {

        elementClick(findLocatorBy(ddnState));
        elementClick(findLocatorBy(txtState));

        elementClick(findLocatorBy(ddnCity));
        elementClick(findLocatorBy(txtCity));

        elementClick(findLocatorBy(ddnRoom));
        elementClick(findLocatorBy(txtStandardRoomtype));

        elementClick(findLocatorBy(ddnCheckIn));
        elementClick(findLocatorBy(txtCheckIn));
        elementClick(findLocatorBy(btnOkDate));

        elementClick(findLocatorBy(ddnCheckOut));
        elementClick(findLocatorBy(txtCheckOut));
        elementClick(findLocatorBy(btnOkDate));

        elementClick(findLocatorBy(ddnNoOfRoom));
        elementClick(findLocatorBy(txtNoOfRoom));

        elementClick(findLocatorBy(ddnNoOfAdult));
        elementClick(findLocatorBy(txtNoOfAdult));

        elementSendKeys(findLocatorBy(txtNoOfChild), noOfChild);

        clickSearchButton();
    }


	
	public String getExploreHotelText()
	{
		String elementGetText=elementGetText(findLocatorBy(textExploreHotel));
		return elementGetText;
	}
	public void clickSearchButton() {
		
		elementClick(findLocatorBy(btnSearch));
	}
	
}