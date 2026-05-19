import java.io.*;

public class BuuferedReader {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Nishchitha\\Downloads\\readdata.csv"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] values = line.split(",");

            System.out.println(values[0] + " "
                    + values[1] + " "
                    + values[2]);
        }

        br.close();
    }
}