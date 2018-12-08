package stringBuffer.stirngBuilder.Concept.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Concept {

    public static void main(String[] args) {

        String line;
        FileReader fr = null;

        try {
            fr = new FileReader("C:\\Users\\Elzat\\IdeaProjects\\practice\\src\\practice.txt");

        } catch (FileNotFoundException e) {
            System.out.println("There is not that file ");
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(fr)) {

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("not able to read");

        }


    }


}