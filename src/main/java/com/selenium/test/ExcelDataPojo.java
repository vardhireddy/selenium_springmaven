package com.selenium.test;

public class ExcelDataPojo {
	
	private String xPathIdType;
	private String xpathIdValue;
	private String action;
	private String actionData;
	private String preRequestType;
	private String preRequestData;
	
	public ExcelDataPojo() {
		super();
	}

	public ExcelDataPojo(String xpathIdValue, String xPathIdType, String action, String actionData, String preRequestType,
			String preRequestData) {
		super();
		this.xPathIdType = xPathIdType;
		this.xpathIdValue = xpathIdValue;
		this.action = action;
		this.actionData = actionData;
		this.preRequestType = preRequestType;
		this.preRequestData = preRequestData;
	}
	
	public String getxPathIdType() {
		return xPathIdType;
	}
	public void setxPathIdType(String xPathIdType) {
		this.xPathIdType = xPathIdType;
	}
	public String getXpathIdValue() {
		return xpathIdValue;
	}
	public void setXpathIdValue(String xpathIdValue) {
		this.xpathIdValue = xpathIdValue;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getActionData() {
		return actionData;
	}
	public void setActionData(String actionData) {
		this.actionData = actionData;
	}
	public String getPreRequestType() {
		return preRequestType;
	}
	public void setPreRequestType(String preRequestType) {
		this.preRequestType = preRequestType;
	}
	public String getPreRequestData() {
		return preRequestData;
	}
	public void setPreRequestData(String preRequestData) {
		this.preRequestData = preRequestData;
	}

	@Override
	public String toString() {
		return "ExcelData [xPathIdType=" + xPathIdType + ", xpathIdValue=" + xpathIdValue + ", action=" + action
				+ ", actionData=" + actionData + ", preRequestType=" + preRequestType + ", preRequestData="
				+ preRequestData + "]";
	}
	
}
