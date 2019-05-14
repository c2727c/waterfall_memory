package com.example.waterfall_memory.dto;

import java.time.LocalDateTime;

public class FallNode {
	private String wId;
	private double nPoint;
	private LocalDateTime nPointTime;
	private int nDrag;
	private int nState;
	private String ntId;
	private String ntColor;
	private int length=5;

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
	private LocalDateTime nAddTime;
	public FallNode() {
		super();
	}
	public String getwId() {
		return wId;
	}
	public void setwId(String wId) {
		this.wId = wId;
	}
	public String getNtColor() {
		return ntColor;
	}
	public void setNtColor(String ntColor) {
		this.ntColor = ntColor;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
