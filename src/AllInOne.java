//=======================FileInputStream===========================
/*import java.io.*;

public class AllInOne {

    public static void main(String[] args) {

        try {

            FileInputStream fis =
                    new FileInputStream("test.txt");

            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char)data);
            }

            fis.close();

        } catch (Exception e) {

            System.out.println("File error occurred");
        }
    }
}*/

/*

// =======================FileReader===============================================

import java.io.*;
import java.io.FileReader;


public class AllInOne {

    public static void main(String[] args) {

        try {

            FileReader fis =
                    new FileReader("C:\\Users\\Nishchitha\\Downloads\\text.txt");

            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char)data);
            }

            fis.close();

        } catch (Exception e) {

            System.out.println("File error occurred");
        }
    }
}*/
//====================Scanner===================================

import java.io.*;
import java.util.Scanner;

public class AllInOne {

    public static void main(String[] args) {

        try {

            File file =
                    new File("C:\\Users\\Nishchitha\\Downloads\\text.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String data = sc.nextLine();

                System.out.println(data);
            }

            sc.close();

        } catch (Exception e) {

            System.out.println("File error occurred");
        }
    }
}