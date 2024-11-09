package examination;

import java.util.List;

public class Question {

	@Override
	public String toString() {
		return "Question [name=" + name + ", Questions=" + Questions + "]";
	}
	public List<String> getQuestions() {
		return Questions;
	}
	public void setQuestions(List<String> questions) {
		Questions = questions;
	}
	private String name;
	private List<String> Questions;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String name, List<String> questions) {
		super();
		this.name = name;
		Questions = questions;
	}
	
}
