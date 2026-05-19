import java.io.*;
import java.util.*;

public class ScannerCSV {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Nishchitha\\Downloads\\readdata.csv");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            String[] values = line.split(",");

            System.out.println(values[1]);
        }

        sc.close();
    }
}