import java.util.Scanner;
public class ModulusQuizzer
	{
		static int answer;
		static int randomNumberOne;
		static int randomNumberTwo;
		static int modAnswer;
		static int numberRight;
		static int questions;
		//hello

		public static void main(String[] args)
			{
				askQuestions();
				askWeirdQuestions();
//				checkAnswer();
//				tellNumberRight();
			}
		public static void askQuestions()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, how many questions would you like to have? Please choose at least 4");
			questions = userInput.nextInt();
			numberRight = 0;
			
			for (int i =0; i<questions-2; i++)
				{
					randomNumberOne = (int)(Math.random()*16)+1;
					randomNumberTwo = (int)(Math.random()*8)+1;
					modAnswer = randomNumberOne%randomNumberTwo;
					if(randomNumberOne<=randomNumberTwo)
						{
							randomNumberOne = randomNumberOne+9;
						}
					System.out.println("What is " + randomNumberOne + " % " +  randomNumberTwo);
					answer = userInput.nextInt();
					checkAnswer();
				}
			
		}	
		public static void askWeirdQuestions()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is " + randomNumberOne + " % " + randomNumberOne);
			modAnswer = randomNumberOne%randomNumberOne;
			answer = userInput.nextInt();
			checkAnswer();
			randomNumberTwo = randomNumberTwo + 20;
			System.out.println("What is " + randomNumberOne + " % " + randomNumberTwo);
			answer = userInput.nextInt();
			modAnswer = randomNumberOne%randomNumberTwo;
			checkAnswer();
			tellNumberRight();
		}
		public static void checkAnswer()
		{
					if(answer == modAnswer)
						{
							numberRight++;
							System.out.println("That is correct");
						}
					else
						{
							System.out.println("That is incorrect");
						}
					
		}
		public static void tellNumberRight()
		{
			System.out.println("You got " + numberRight + " out of " + questions + " questions right");
		}
			
			
		
		

	}
