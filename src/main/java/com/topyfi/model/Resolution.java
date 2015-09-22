package com.topyfi.model;

import java.util.ArrayList;

public class Resolution {
	private String content;
	private int yesAnswer;
	private int noAnswer;
	private int noOpinionAnswer;
	private ArrayList<String> usersLoginList = new ArrayList<String>();
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getYesAnswer() {
		return yesAnswer;
	}
	public void setYesAnswer(int yesAnswer) {
		this.yesAnswer = yesAnswer;
	}
	public int getNoAnswer() {
		return noAnswer;
	}
	public void setNoAnswer(int noAnswer) {
		this.noAnswer = noAnswer;
	}
	public int getNoOpinionAnswer() {
		return noOpinionAnswer;
	}
	public void setNoOpinionAnswer(int noOpinionAnswer) {
		this.noOpinionAnswer = noOpinionAnswer;
	}
	public ArrayList<String> getUsersLoginList() {
		return usersLoginList;
	}
	public void setUsersLoginList(ArrayList<String> usersLoginList) {
		this.usersLoginList = usersLoginList;
	}
	
	
}
