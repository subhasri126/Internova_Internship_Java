import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StudentFileHandling {

    public static void main(String[] args) {

        String fileName = "student.txt";

        try {

            FileWriter writer = new FileWriter(fileName);

            writer.write("Student ID : 101\n");
            writer.write("Name       : Subhasri S\n");
            writer.write("Course     : CSE\n");
            writer.write("Marks      : 92\n");

            writer.close();

            System.out.println("Student details written to file successfully.");

            System.out.println("\nStudent Records");
            System.out.println("----------------");

            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}