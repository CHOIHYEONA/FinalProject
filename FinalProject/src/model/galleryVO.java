package model;

public class galleryVO {
	private int galleryUid;
	private String g_title;
	private String g_date;
	private String imgName;
	private int g_count;
	private int g_like;
	private int userUid;
	public galleryVO(int galleryUid, String g_title, String g_date, String imgName, int g_count, int g_like,
			int userUid) {
		super();
		this.galleryUid = galleryUid;
		this.g_title = g_title;
		this.g_date = g_date;
		this.imgName = imgName;
		this.g_count = g_count;
		this.g_like = g_like;
		this.userUid = userUid;
	}
	public int getGalleryUid() {
		return galleryUid;
	}
	public String getG_title() {
		return g_title;
	}
	public String getG_date() {
		return g_date;
	}
	public String getImgName() {
		return imgName;
	}
	public int getG_count() {
		return g_count;
	}
	public int getG_like() {
		return g_like;
	}
	public int getUserUid() {
		return userUid;
	}
	
	
}
