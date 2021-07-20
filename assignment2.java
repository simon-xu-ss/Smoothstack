import java.util.Random;
import java.util.Scanner; 

public class Main {
	Random rand = new Random();
	int random_number = rand.nextInt(100) + 1;

	Boolean isGuessCorrect = false;
	for (int i = 0; i < 5; i++) {
		Scanner in = new Scanner(System.in);  // Create a Scanner object
    	System.out.println("Enter a number(1 - 100): ");
		String input = in.nextLine();
		int inputNumber = Integer.parseInt(input)
		if (inputNumber >= (random_number - 10) && inputNumber <= (random_number + 10)) {
			System.out.println(inputNumber);
			isGuessCorrect = true;
			break;
		}
	}
	if (isGuessCorrect) {
		System.out.println("Sorry");
	}
}
