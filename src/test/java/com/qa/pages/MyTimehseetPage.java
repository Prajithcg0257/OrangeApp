package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTimehseetPage {
	// Page object Repository

	@FindBy(xpath = "//span[text()='Time']")

	WebElement timePageLink;

	@FindBy(xpath = "//span[text()='Timesheets ']")

	WebElement TimeSheetsMenu;

	@FindBy(xpath = "//a[text()='My Timesheets'] ']")

	WebElement mytimeSheetPageLink;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table']/tbody/tr[2]/td[3]")

	WebElement monTotal;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table']/tbody/tr[2]/td[4]")

	WebElement TueTotal;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table']/tbody/tr[2]/td[5]")

	WebElement wedTotal;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table']/tbody/tr[2]/td[6]")

	WebElement thusTotal;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table']/tbody/tr[2]/td[7]")

	WebElement fridayTotal;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table']/tbody/tr[2]/td[10]")

	WebElement allDayTotal;

	
	
	
}
