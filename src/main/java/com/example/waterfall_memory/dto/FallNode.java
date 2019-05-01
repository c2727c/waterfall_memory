package com.example.waterfall_memory.dto;

public class FallNode {
	private int wId;
	private String word;
	private int nDrag;
	private int ntId;
	private String ntColor;
	public FallNode() {
		super();
	}
	public int getwId() {
		return wId;
	}
	public void setwId(int wId) {
		this.wId = wId;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getnDrag() {
		return nDrag;
	}
	public void setnDrag(int nDrag) {
		this.nDrag = nDrag;
	}
	public int getNtId() {
		return ntId;
	}
	public void setNtId(int ntId) {
		this.ntId = ntId;
	}
	public String getnColor() {
		return ntColor;
	}
	public void setnColor(String nColor) {
		this.ntColor = nColor;
	}
	

}
