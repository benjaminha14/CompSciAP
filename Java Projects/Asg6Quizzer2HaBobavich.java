//Benjamin Ha
//Robert Bonavich
import java.util.*;
import java.lang.Math;
class TestQuizzer_BonovichHa {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System. in );
		String answer;
		Quiz quiz1 = new Quiz();
		quiz1.askQuestions();
		answer = userInput.nextLine();
		quiz1.check(answer);

		quiz1.askQuestions();
		answer = userInput.nextLine();
		quiz1.check(answer);

		quiz1.askQuestions();
		answer = userInput.nextLine();
		quiz1.check(answer);

		quiz1.askQuestions();
		answer = userInput.nextLine();
		quiz1.check(answer);

		quiz1.askQuestions();
		answer = userInput.nextLine();
		quiz1.check(answer);

		quiz1.askQuestions();
		answer = userInput.nextLine();
		quiz1.check(answer);

		quiz1.displayResults();



	}
}


class Quiz {
	private int score;
	private int randNumber;
	private int count;
	private boolean keepGoing;
	Scanner userInput = new Scanner(System. in );
	public Quiz() {
		score = 0;
		randNumber = 0;
		count = 0;
		keepGoing = false;
	}
/*
This method ask questions.
The questions are asigned a number.
There is a random number chosen randomly. 
This then checks for each question, thus choosing a random
question each time.
It does not return anything.
*/
	public void askQuestions() {
		String s = null;


		this.randNumber = (int)(Math.random() * 7);

		if (count >= 6) {
			System.out.println("Your final score is: " + this.score + "/6");
			return;
		}
		if (randNumber == 0) {
			System.out.println("What is 1 + 2? \n a. 3 \n b. 1 \n c. 6 \n d. 4");

		} else if (randNumber == 1) {
			System.out.println("What is 9 + 2?\n a. 3 \n b. 11 \n c. 6 \n d. 4 ");


		} else if (randNumber == 2) {
			System.out.println("What is 1 + 0? \n a. 3 \n b. 1 \n c. 6 \n d. 4");

		} else if (randNumber == 3) {
			System.out.println("What is 2 + 2? \n a. 3 \n b. 1 \n c. 6 \n d. 4");

		} else if (randNumber == 4) {
			System.out.println("What is 9 + 10?");

		} else if (randNumber == 5) {
			System.out.println("What is 2 + 13?");

		} else if (randNumber == 6) {
			System.out.println("What is 2 * 103493094309204303493 *0?");

		}
		this.count++;




	}
/*
Each question is asigned a key number.
This method takes the key number to find out what answer key to find.
It also takes the user input to 
take and check the answer of the question.
Their is also a while loop that checks if a multiple choice question is really just
one character. If they get it wrong however, they will be warned.
It returns void.


*/
	public void check(String userInput) {
		boolean isNotLegitInput = true;
		userInput.toLowerCase();
		while (isNotLegitInput) {
			if (randNumber <= 3) {
				if (userInput.length() == 1) {
					isNotLegitInput = false;
				} else {
					System.out.println("Put in a legit answer!");
					break;

				}

			} else {
				isNotLegitInput = false;
			}

		}
		if (randNumber == 0) {
			if (userInput.equals("a")) {
				this.score++;


			}
		} else if (randNumber == 1) {
			if (userInput.toLowerCase().equals("b")) {
				this.score++;

			}
		} else if (randNumber == 2) {
			if (userInput.equals("b")) {
				this.score++;
			}
		} else if (randNumber == 3) {
			if (userInput.equals("d")) {
				this.score++;


			}
		} else if (randNumber == 4) {
			if (userInput.equals("19")) {
				this.score++;
			}

		} else if (randNumber == 5) {
			if (userInput.equals("15")) {
				this.score++;

			}
		} else if (randNumber == 6) {
			if (userInput.equals("0")) {
				this.score++;
			}

		}
	}
   
	public int getScore()
   {
		return score;
	}
	public void displayResults()
   {
		System.out.println("Your final score is: " + score + "/6");

	}




}