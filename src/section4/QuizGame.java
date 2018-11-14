package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0; 
		// 2.  Ask the user a question 
		String one =JOptionPane.showInputDialog("Have you seen season 3 of MHA");
		// 3.  Use an if statement to check if their answer is correct
		if(one.equals("yes")) {
			speak ("Thank You");
		}
		
		else {
			speak ("Why are you doing this quiz then")
	}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	



static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
}

}
