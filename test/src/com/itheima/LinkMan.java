package com.itheima;

import java.io.Serializable;

public class LinkMan implements Serializable {
private Long lkmId;
private String lkmName;
private String lkmEmail;
private String lkmGender;
private String lkmMemo;
private String lkmMobile;
private String lkmPhone;
private String lkmPosition;
public LinkMan(Long lkmId, String lkmName, String lkmEmail, String lkmGender, String lkmMemo, String lkmMobile,
		String lkmPhone, String lkmPosition) {
	super();
	this.lkmId = lkmId;
	this.lkmName = lkmName;
	this.lkmEmail = lkmEmail;
	this.lkmGender = lkmGender;
	this.lkmMemo = lkmMemo;
	this.lkmMobile = lkmMobile;
	this.lkmPhone = lkmPhone;
	this.lkmPosition = lkmPosition;
}
public LinkMan() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getLkmId() {
	return lkmId;
}
public void setLkmId(Long lkmId) {
	this.lkmId = lkmId;
}
public String getLkmName() {
	return lkmName;
}
public void setLkmName(String lkmName) {
	this.lkmName = lkmName;
}
public String getLkmEmail() {
	return lkmEmail;
}
public void setLkmEmail(String lkmEmail) {
	this.lkmEmail = lkmEmail;
}
public String getLkmGender() {
	return lkmGender;
}
public void setLkmGender(String lkmGender) {
	this.lkmGender = lkmGender;
}
public String getLkmMemo() {
	return lkmMemo;
}
public void setLkmMemo(String lkmMemo) {
	this.lkmMemo = lkmMemo;
}
public String getLkmMobile() {
	return lkmMobile;
}
public void setLkmMobile(String lkmMobile) {
	this.lkmMobile = lkmMobile;
}
public String getLkmPhone() {
	return lkmPhone;
}
public void setLkmPhone(String lkmPhone) {
	this.lkmPhone = lkmPhone;
}
public String getLkmPosition() {
	return lkmPosition;
}
public void setLkmPosition(String lkmPosition) {
	this.lkmPosition = lkmPosition;
}
@Override
public String toString() {
	return "LinkMan [lkmId=" + lkmId + ", lkmName=" + lkmName + ", lkmEmail=" + lkmEmail + ", lkmGender=" + lkmGender
			+ ", lkmMemo=" + lkmMemo + ", lkmMobile=" + lkmMobile + ", lkmPhone=" + lkmPhone + ", lkmPosition="
			+ lkmPosition + "]";
}

}
