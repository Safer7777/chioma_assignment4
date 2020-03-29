package chioma_problem1;

/*
 * Problem one will have us make a program that will read in a text file
 * then it will remove all duplicate words and print all words without
 * duplicates into another text file
 */

public class Application {

	public static void main(String[] args) {
		
		//we create a new class 
		DuplicateRemover duplicateRemover = new DuplicateRemover();

		//calling the remove portion to remove all duplicate words from this file
        duplicateRemover.remove("problem1.txt");
        
        //calling the write portion to add all unique words to this file
        duplicateRemover.write("unique_words.txt");

	}

}
