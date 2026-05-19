import java.io.BufferedReader;//Reads data efficiently line by line.
//Without BufferedReader,
//Java reads character by character.
import java.io.FileReader;//read text from a file
import java.io.IOException;//Handles file-related exceptions.

public class ReadCSV {
    public static void main(String[] args) {
        String file =("C:\\Users\\Nishchitha\\Downloads\\readdata.csv");
        //\escape charecter
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
     //BufferedReader br for reading file
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                System.out.println("ID: " + values[0]
                        + " Name: " + values[1]
                        + " ADDRESS: " + values[2]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}