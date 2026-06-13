package org.javacollections.hashmap.implementations;

import java.util.Objects;
public class Shares {

	private int shareId;
	private String tickker;
	private String companyDesc;
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
	public String getCompanyDesc() {
		return companyDesc;
	}
	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}

	@Override
	public boolean equals(Object obj) {
		Shares compareObj = (Shares) obj;
		return compareObj.shareId == this.shareId && compareObj.tickker.equals(this.tickker);
	}

	@Override
	public int hashCode() {
		return Objects.hash(shareId, tickker);
	}

	@Override
	public String toString() {
		return "Shares [shareId=" + shareId + ", tickker=" + tickker + ", companyDesc=" + companyDesc + "]";
	}
}
