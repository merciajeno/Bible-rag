package com.mercia.bible_rag.model;

public class Verse {

	private String reference;
	private String text;
	public Verse(String reference, String text) {
		super();
		this.reference = reference;
		this.text = text;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
