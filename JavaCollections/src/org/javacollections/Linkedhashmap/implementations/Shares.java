package org.javacollections.Linkedhashmap.implementations;

public class Shares {

	int shareId;
	String tickker;
	String companyDesc;
	
	public Shares(int shareId, String tickker, String companyDesc) {
		super();
		this.shareId = shareId;
		this.tickker = tickker;
		this.companyDesc = companyDesc;
	}
	public int getShareId() {
		return shareId;
	}
	public void setShareId(int shareId) {
		this.shareId = shareId;
	}
	public String getTickker() {
		return tickker;
	}
	public void setTickker(String tickker) {
		this.tickker = tickker;
	}
	public String getCompanyDesc() {
		return companyDesc;
	}
	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}
	@Override
	public String toString() {
		return "Shares [shareId=" + shareId + ", tickker=" + tickker + ", companyDesc=" + companyDesc + "]";
	}
	
	
}
