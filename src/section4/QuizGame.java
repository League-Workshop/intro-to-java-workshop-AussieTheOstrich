package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		System.out.println();
		// 2.  Ask the user a question 
		String name = JOptionPane.showInputDialog("Why did the Chicken cross the road?");
		// 3.  Use an if statement to check if their answer is correct
		if(name.equals("to die")) {score ++;} 
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}  
