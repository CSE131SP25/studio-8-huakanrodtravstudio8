package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	private String[] choices; 
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points); 
		this.choices = choices; 
	
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt(); 
		for ( int i = 0; i < choices.length; i++ ) { 
			int questionnumber = i + 1; 
			System.out.println(questionnumber + ". " + choices[i]); 
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices; 
	}
	
	public static void main(String[] args) {
		String[] choices1 = {"blue", "green", "red", "black"};
		MultipleChoiceQuestion two = new MultipleChoiceQuestion("what color is the grass", "green", 10, choices1);
		// TODO: create your own MultipleChoiceQuestion
	}

}
