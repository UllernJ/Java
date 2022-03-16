package ulrik.logiq.project;
import ulrik.logiq.project.modules.TextManipulation;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Main {

    public static void main(String[] args) {

        TextManipulation textMani = new TextManipulation();
        //We create a function to retrieve the data from the text file.
        try {
            File myData = new File("src/ulrik/logiq/project/actiontexts.txt");
            Scanner read = new Scanner(myData);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                String action = data.split(":")[0];
                String word = data.split(":")[1];
                System.out.println(word + " ran action " + action + " with result: " + textMani.actions(action, word) + "\n");
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can't find the file.");
        }
    }
}