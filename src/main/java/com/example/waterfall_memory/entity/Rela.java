package com.example.waterfall_memory.entity;

public class Rela {
	private String openId;
	private String wId1;
	private String wId2;
	private String rtId;
	private int rWeight;
	public Rela() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rela(String openId, String wId1, String wId2) {
		super();
		this.openId = openId;
		this.wId1 = wId1;
		this.wId2 = wId2;
	}

	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getwId1() {
		return wId1;
	}
	public void setwId1(String wId1) {
		this.wId1 = wId1;
	}
	public String getwId2() {
		return wId2;
	}
	public void setwId2(String wId2) {
		this.wId2 = wId2;
	}
	public String getRtId() {
		return rtId;
	}
	public void setRtId(String rtId) {
		this.rtId = rtId;
	}
	public int getrWeight() {
		return rWeight;
	}
	public void setrWeight(int rWeight) {
		this.rWeight = rWeight;
	}

}
