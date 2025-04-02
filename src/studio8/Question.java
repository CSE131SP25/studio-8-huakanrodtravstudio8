package studio8;

import support.cse131.NotYetImplementedException;

public class Question {
	
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 */
	private String prompt; 
	private String answer; 
	private int points; 
	
	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;  
		this.points = points;  
		this.answer = answer; 
	}
	
	/**
	 * Prints out the current question's prompt, with a parenthetical 
	 * number of points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + "(" + this.points + " points)");
	}
	
	/**
	 * Check the answer provided by a user
	 * @param givenAnswer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			return this.points;
		} else {
			return 0;
		}
	}
	
	/**
	 * Getter method for the points possible
	 * @return int points
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * Getter method for the answer to the question
	 * @return String answer
	 */
	public String getAnswer() {
		return answer;
	}
	
	public String getPrompt() { 
		return prompt; 
	}
	
	public static void main(String[] args) {
		Question one = new Question("what color is the sky?", "blue", 10);
		
	}
}
