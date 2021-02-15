package model;

public class customersVO {

	private int userUid;
	private String userId;
	private String userPw;
	private String userName;
	private String userTel;
	public customersVO(int userUid, String userId, String userPw, String userName, String userTel) {
		super();
		this.userUid = userUid;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userTel = userTel;
	}
	public int getUserUid() {
		return userUid;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserTel() {
		return userTel;
	}
	
	
}
