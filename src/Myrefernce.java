import java.io.*;

public class Myrefernce {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("test.txt");

        int data;

        while ((data = fis.read()) != -1) {
            System.out.print((char)data);
        }

        fis.close();
    }
}