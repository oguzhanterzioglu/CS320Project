
public class Question {
	private String question;
	private String[] choices;
	private int correctChoice;
	
	public Question(String question, String[] choices, int correctChoice){
		
		this.question = question;
		this.choices = choices;
		this.correctChoice = correctChoice;		
	}

	public String getQuestion() {
		return question;
	}

	public String[] getChoices() {
		return choices;
	}

	public int getCorrectChoice() {
		return correctChoice;
	}
}

