import java.util.Scanner;
public class ModulusQuizzer
	{

		public static void main(String[] args)
			{
				askQuestions();
			}
		public static void askQuestions()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, how many questions would you like to have?");
			int questions = userInput.nextInt();
			int numberRight = 0;
			
			for (int i =0; i<questions; i++)
				{
					int randomNumberOne = (int)(Math.random()*10)+1;
					int randomNumberTwo = (int)(Math.random()*15)+5;
					int modAnswer = randomNumberOne%randomNumberTwo;
					System.out.println("What is " + randomNumberOne + " % " +  randomNumberTwo);
					
					int answer = userInput.nextInt();
					if(answer == modAnswer)
						{
							numberRight++;
							System.out.println("That is correct");
							System.out.println("What is " + randomNumberOne + " % " + randomNumberOne);
						}
					else
						{
							System.out.println("That is incorrect");
						}
					if(randomNumberOne < randomNumberTwo)
						{
							questions++;
						}
				}
			System.out.println("You got " + numberRight + " out of " + questions + " questions right");
		}

	}
