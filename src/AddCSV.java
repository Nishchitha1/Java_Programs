import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddCSV {

    public static void main(String[] args) {

        String file = "C:\\Users\\Nishchitha\\Downloads\\readdata.csv";

        // ADD DATA INTO CSV
        try {

            FileWriter writer = new FileWriter(file, true);

            writer.append("6,Kiran,Bangalore\n");

            writer.close();

            System.out.println("Data stored in CSV file\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // GET DATA FROM CSV
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");

                System.out.println(
                        "ID: " + values[0] +
                                " Name: " + values[1] +
                                " ADDRESS: " + values[2]
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}