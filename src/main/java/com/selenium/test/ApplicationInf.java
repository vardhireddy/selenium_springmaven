package com.selenium.test;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ApplicationInf {
	void process(List<String> cellValue);

	WebElement getElement(String pathType, String pathValue);

	String getDriverFullPath(String browser);

	void performAction(ExcelDataPojo excelData);

	void waitTillElementLoad(ExcelDataPojo excelData);
	
	ExcelDataPojo getValues(List<String> cellValue);
}
