package model;

public class commVO {
	private int commUid;
	private String c_date;
	private String c_content;
	private int userUid;
	public commVO(int commUid, String c_date, String c_content, int userUid) {
		super();
		this.commUid = commUid;
		this.c_date = c_date;
		this.c_content = c_content;
		this.userUid = userUid;
	}
	public int getCommUid() {
		return commUid;
	}
	public String getC_date() {
		return c_date;
	}
	public String getC_content() {
		return c_content;
	}
	public int getUserUid() {
		return userUid;
	}
	
	
}
