import java.util.Scanner;

public class Quiz {

	Scanner quizer = new Scanner(System.in);
	private static int scoreScience = 0;
	private static int scoreFamous = 0;
	private static int scoreHistory = 0;
	public String printScienceQuiz() {
		
		String answer = quizer.next();
		if ((answer.equals("h2o"))  || (answer.equals("H2o"))   || (answer.equals("h20"))  || (answer.equals("H20"))) {
			scoreScience = scoreScience+1;
			System.out.println("Correct!");
			System.out.println("Score is " + scoreScience);
		}else {
			scoreScience = scoreScience-1;
			System.out.println("Correct answer was h2o");
			System.out.println("Score is " + scoreScience);
		}
		System.out.println("Next question!");
		System.out.println("What is 3+5?");
		int answer2 = quizer.nextInt();
		if (answer2 == 8) {
			scoreScience = scoreScience+1;
			System.out.println("Correct!");
			System.out.println("The total score is " + scoreScience);
		}else {
			scoreScience = scoreScience-1;
			System.out.println("Correct answer was 8");
			System.out.println("The total score is " + scoreScience);
		}
		return "something went wrong!";
	}
	public String printFamousQuiz() {
		
		String answer = quizer.next();
		if ((answer.equals("batman")) || (answer.equals("Batman")) || (answer.equals("Bruce Wayne"))) {
			scoreFamous = scoreFamous+1;
			System.out.println("Correct!");
			System.out.println("Score is " + scoreFamous);
		}else {
			scoreFamous =scoreFamous -1;
			System.out.println("Correct answer was Batman");
			System.out.println("Score is " + scoreFamous);
		}
		System.out.println("Next question!");
		System.out.println("What is the name of the main character in Pirate of the Carribean?");
		String answer2 = quizer.next();
		if ((answer2.equals("JackSparrow")) || (answer2.equals("jacksparrow")) || (answer2.equals("captainjacksparrow"))) {
			scoreFamous = scoreFamous+1;
			System.out.println("Correct!");
			System.out.println("The total score is " + scoreFamous);
		}else {
			scoreFamous = scoreFamous -1;
			System.out.println("Correct answer was Jack Sparrow");
			System.out.println("The total score is " + scoreFamous);
		}
		return "something went wrong!";
	}
	
	public String printHistoryQuiz(){
		String answer = quizer.next();
		if ((answer.equals("WashingtonDC")) || (answer.equals("washingtondc"))) {
			scoreHistory =scoreHistory +1;
			System.out.println("Correct!");
			System.out.println("Score is " + scoreHistory);
		}else {
			scoreHistory = scoreHistory -1;
			System.out.println("Correct answer was Washington DC");
		}
		System.out.println("Next question!");
		System.out.println("What is the name of the captial city in Sweden?");
		String answer2 = quizer.next();
		if ((answer2.equals("Stockholm"))  || (answer2.equals("stockholm"))) {
			scoreHistory = scoreHistory +1;
			System.out.println("Correct!");
			System.out.println("The total score is " + scoreHistory);
		}else {
			scoreHistory = scoreHistory -1;
			System.out.println("Correct answer was Stockholm");
			System.out.println("The total score is " + scoreHistory);
		}
		return "something went wrong!";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Quiz");
		System.out.println("Please select from categories Science, Famous, History by pressing 1, 2  or 3. ");
		//what category to chose from 
		//science 
		// 2 questions +1 for each correct question -1 for each wrong question  
		//famous
		// 2 questions +1 for each correct question -1 for each wrong question
		//History
		// 2 questions +1 for each correct question -1 for each wrong question
		Scanner sc = new Scanner(System.in);
		Quiz quiz = new Quiz();
		char q = ' ';
		int totalScore = 0;
		do {
			int category = sc.nextInt();
			
			switch(category) {
				case 1:
					System.out.println("You chose Science!");
					System.out.println("What is the chemical sign for water?");
					quiz.printScienceQuiz();
					break;
				case 2:
					System.out.println("You chose Famous!");
					System.out.println("What is the name of the main character in Dark knight rises?");
					quiz.printFamousQuiz();
					break;
				case 3:
					System.out.println("You chose History!");
					System.out.println("What is the name of the capital city in USA?");
					quiz.printHistoryQuiz();
					break;
			}
			System.out.println("Do you want to play again? press y or Y");
			q = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Please select from categories Science, Famous, History by pressing 1, 2  or 3. ");
			totalScore = (scoreHistory)+ (scoreScience) + (scoreFamous);
		}while ((q == 'y') || (q == 'Y'));
		System.out.println("The total score is " + totalScore);
			
	}
}
