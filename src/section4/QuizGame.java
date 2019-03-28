package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;

		// 2.  Ask the user a question 
		String name = JOptionPane.showInputDialog("whats heavy forwards but backwards its not?");
		// 3.  Use an if statement to check if their answer is correct
		if(name.equals("ton"))  {
		// 4.  if the user's answer is correct
		
		// -- add one to their score           
		score ++;}
		System.out.println(score);
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String yeet = JOptionPane.showInputDialog("knock knock?");
		if(yeet.equals("whos there"))  {
			score ++;}
		System.out.println(score);
		System.out.println("WOW YOU HAVE FINISHED!");
		JOptionPane.showMessageDialog(null, "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo " );
		}
		// 6.  After all the questions have been asked, print the user's score 
		
	}

