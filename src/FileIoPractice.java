import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {

//    public static void deleteEntry(String name, Paths selectedPath, List<String> names){
//        // Google how to remove string from array list
//        // Remove name from names
//        // Write to the file the names
//        try {
//            Files.write(u, newNames);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
            Path u = Paths.get("src", "fileIo","people.txt");
            List<String> codeup = new ArrayList<>();

            try{
                codeup = Files.readAllLines(u);
            } catch(IOException exception){
                exception.printStackTrace();
            }

            // Call deleteEntry passing in name to delete, path to the file, variable that holds contents of file.

            for (String name : codeup){
                System.out.println(name + " works at Codeup.");
            }

                List<String> newNames = Arrays.asList("Fernando", "David", "Mason", "Nazareth");
        try {
            Files.write(u, newNames);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }// end of main
}// end of class

