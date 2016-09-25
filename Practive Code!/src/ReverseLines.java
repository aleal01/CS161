import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseLines {

        public void reverseLines(String filename) {
        	try{
                Scanner input = new Scanner(new File(filename));        
                reverseLines(input);  
        	}
        	catch (FileNotFoundException e){
        		System.out.println("where did I put that file?");
        	}
        }
        
        public void reverseLines(Scanner input) {
            if (input.hasNextLine()) {
                // recursive case
                String line = input.nextLine();
                reverseLines(input);
                System.out.println(line);
            }
        }

        public static void main(String[] args)  {
                
                String filename = "test.txt";
                ReverseLines reverser = new ReverseLines();
                reverser.reverseLines(filename);
                
        }
}
