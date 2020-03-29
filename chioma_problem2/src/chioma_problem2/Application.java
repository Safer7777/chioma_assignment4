package chioma_problem2;

/*
 * In problem 2 we are asked to create a program that reads from the initial input file
 * then takes and counts everything inside that file then outputs it
 * to a different file while displaying the amount of times each word happened
 */

public class Application {

	public static void main(String[] args) {
		
		// Instance of the class DuplicateCounter
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		
		// Reads the input file and counts how many times each word appeared
		duplicateCounter.count("problem2.txt");
		
		// receives output and displays each word and how many times they appeared
		duplicateCounter.write("unique_words_counts.txt");

	}

}