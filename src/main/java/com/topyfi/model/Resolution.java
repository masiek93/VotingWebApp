package com.topyfi.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resolution {
	@Id
	@GeneratedValue
	private int resolutionId;
	private String content;
	private int yesAnswer = 0;
	private int noAnswer = 0;
	private int noOpinionAnswer = 0;
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
