package com.railworld;

public class Parents {
	
	private String pname;
	
	private int page;
	
	private String pgender;
	
	public Parents() {
		
	}

	public Parents(String pname, int page, String pgender) {
		super();
		this.pname = pname;
		this.page = page;
		this.pgender = pgender;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPgender() {
		return pgender;
	}

	public void setPgender(String pgender) {
		this.pgender = pgender;
	}

	
	@Override
	public String toString() {
		return "Parents [pname=" + pname + ", page=" + page + ", pgender=" + pgender + "]";
	}
	

}

