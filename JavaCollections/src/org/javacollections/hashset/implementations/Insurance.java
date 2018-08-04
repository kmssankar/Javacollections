package org.javacollections.hashset.implementations;

public class Insurance {

	int policyNum;
	String type;
	String status;

	public Insurance(int policyNum, String type, String status) {
		super();
		this.policyNum = policyNum;
		this.type = type;
		this.status = status;
	}

	public int getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(int policyNum) {
		this.policyNum = policyNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Insurance [policyNum=" + policyNum + ", type=" + type
				+ ", status=" + status + "]";
	}
	
	

}
