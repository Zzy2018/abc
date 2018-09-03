package com.itheima;

import java.io.Serializable;

public class Customer implements Serializable {
	private Long custId;
	private String custName;
	private String custSource;
	private String custindustry;
	private String custLevel;
	private String custAddress;
	private String custPhone;
	public Customer(Long custId, String custName, String custSource, String custindustry, String custLevel,
			String custAddress, String custPhone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custSource = custSource;
		this.custindustry = custindustry;
		this.custLevel = custLevel;
		this.custAddress = custAddress;
		this.custPhone = custPhone;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custSource=" + custSource
				+ ", custindustry=" + custindustry + ", custLevel=" + custLevel + ", custAddress=" + custAddress
				+ ", custPhone=" + custPhone + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustindustry() {
		return custindustry;
	}
	public void setCustindustry(String custindustry) {
		this.custindustry = custindustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	
}
