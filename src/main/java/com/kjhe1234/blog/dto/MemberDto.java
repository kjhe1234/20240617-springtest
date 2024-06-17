package com.kjhe1234.blog.dto;

public class MemberDto {
	
	private String memberid;
	private String memberpw;
	private String membername;
	private String memberage;
	private String memberemail;
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDto(String memberid, String memberpw, String membername, String memberage, String memberemail) {
		super();
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
		this.memberage = memberage;
		this.memberemail = memberemail;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getMemberpw() {
		return memberpw;
	}
	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberage() {
		return memberage;
	}
	public void setMemberage(String memberage) {
		this.memberage = memberage;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	
	
	

}
