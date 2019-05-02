package com.example.waterfall_memory.entity;

import java.time.LocalDateTime;

public class Node {
	private String wId;
	private String openId;
	private double nPoint;
	private LocalDateTime nPointTime;
	private int nDrag;
	private int nState;
	private String ntId;
	private LocalDateTime nAddTime;
	public Node() {
		super();
	}
	public Node(String openId,String wId) {
		super();
		this.openId = openId;
		this.wId = wId;
		this.nPoint = 10;//FIXME 应写入配置文件
		this.nPointTime = LocalDateTime.now();//当前时间
		this.nDrag = 0;
		this.nState = 0;
		this.ntId = "default";
		this.nAddTime = LocalDateTime.now();
	
	}

	public Node(String wId, String openId, double nPoint, LocalDateTime nPointTime, int nDrag, int nState, String ntId,
			LocalDateTime nAddTime) {
		super();
		this.wId = wId;
		this.openId = openId;
		this.nPoint = nPoint;
		this.nPointTime = nPointTime;
		this.nDrag = nDrag;
		this.nState = nState;
		this.ntId = ntId;
		this.nAddTime = nAddTime;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public double getnPoint() {
		return nPoint;
	}
	public void setnPoint(double nPoint) {
		this.nPoint = nPoint;
	}
	public LocalDateTime getnPointTime() {
		return nPointTime;
	}
	public void setnPointTime(LocalDateTime nPointTime) {
		this.nPointTime = nPointTime;
	}
	public int getnDrag() {
		return nDrag;
	}
	public void setnDrag(int nDrag) {
		this.nDrag = nDrag;
	}
	public int getnState() {
		return nState;
	}
	public void setnState(int nState) {
		this.nState = nState;
	}
	public String getNtId() {
		return ntId;
	}
	public void setNtId(String ntId) {
		this.ntId = ntId;
	}
	public LocalDateTime getnAddTime() {
		return nAddTime;
	}
	public void setnAddTime(LocalDateTime nAddTime) {
		this.nAddTime = nAddTime;
	}
	public String getwId() {
		return wId;
	}
	public void setwId(String wId) {
		this.wId = wId;
	}

}
