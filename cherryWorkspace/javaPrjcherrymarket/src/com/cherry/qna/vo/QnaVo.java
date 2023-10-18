package com.cherry.qna.vo;

public class QnaVo {
	
	private String no;
	private String title;
	private String content;
	private String writerNo;
	private String writerNick;
	private String managerNo;
	private String hit;
	private String enrollDate;
	private String modifyDate;
	private String secretYn;
	
	public QnaVo() {
	}
	
	public QnaVo(String no, String title, String content, String writerNo, String writerNick, String managerNo,
			String hit, String enrollDate, String modifyDate, String secretYn) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writerNo = writerNo;
		this.writerNick = writerNick;
		this.managerNo = managerNo;
		this.hit = hit;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.secretYn = secretYn;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriterNo() {
		return writerNo;
	}
	public void setWriterNo(String writerNo) {
		this.writerNo = writerNo;
	}
	public String getWriterNick() {
		return writerNick;
	}
	public void setWriterNick(String writerNick) {
		this.writerNick = writerNick;
	}
	public String getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(String managerNo) {
		this.managerNo = managerNo;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getSecretYn() {
		return secretYn;
	}
	public void setSecretYn(String secretYn) {
		this.secretYn = secretYn;
	}
	@Override
	public String toString() {
		return "QnaVo [no=" + no + ", title=" + title + ", content=" + content + ", writerNo=" + writerNo
				+ ", writerNick=" + writerNick + ", managerNo=" + managerNo + ", hit=" + hit + ", enrollDate="
				+ enrollDate + ", modifyDate=" + modifyDate + ", secretYn=" + secretYn + "]";
	}
	
	

}
