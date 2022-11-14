package com.tcs.bean;

import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Set<String> answers;
	public Question(int id, String question, Set<String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	public Question() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<String> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answers=" + answers + "]";
	}
	

}
