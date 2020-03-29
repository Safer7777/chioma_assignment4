package chioma_problem1;

//the needed libraries for the program
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

//this class contains the two 
public class DuplicateRemover {

	//we create a scanner for input
    private Scanner readUserFile;
	
	//this implements the set interface
    private Set<String> uniqueUserWords = new HashSet<>();
    
    //write the unique words to the file
    public void write(String uniquewords) {
    	
    	//this will begin to run
        try {
        	
        	//create a new PrintWriter that uses the outputFile
            PrintWriter printOut = new PrintWriter(new File(uniquewords));

            //we used a enhanced for loop to simplify the code 
            for(String string : uniqueUserWords)
            {
            	//double spacing output for readability
                printOut.print(string + "\n\n");
            }

            
            //we then need to close out the resources used in the program.
            printOut.close();
            printOut.flush();         
        }
        
        //we have a catch in place for any issues
        catch(FileNotFoundException e)
        {
        	//system print out if error occurs
            System.out.println("Unfourtantly an issue occured with the creation of the file!");       
            System.out.println(e);
        }
    }
    
    //we use remove to take out all the repeating words
    public void remove(String problem1) {
    	
    	//this will begin to run
        try {
        	
        	readUserFile = new Scanner(new File(problem1));

            //a while function that will run as long as the text has more input
            while(readUserFile.hasNext()) {
            	
            	//this will add all unique words to the output file
            	uniqueUserWords.add(readUserFile.next());       	
            }
        } 
        	//we have a catch in place for any issues
        	catch(IOException e)  
        {
        	//system print out if error occurs
            System.out.println("Unfourtantly an issue occured when opening the file!");
            System.out.println(e);
        }
    }   
}
