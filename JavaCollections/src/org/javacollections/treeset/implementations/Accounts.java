package org.javacollections.treeset.implementations;

public class Accounts implements Comparable<Accounts> {
	int accountNo;
	String name;
	String accType;

	
	public Accounts(int accountNo, String name, String accType) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.accType = accType;
	}

	
	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	@Override
	public int compareTo(Accounts o) {
		return (this.accountNo - o.accountNo);
	}


	@Override
	public String toString() {
		return "Accounts [accountNo=" + accountNo + ", name=" + name + ", accType=" + accType + "]";
	}
}
