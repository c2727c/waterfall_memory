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
