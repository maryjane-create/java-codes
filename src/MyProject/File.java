package MyProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class File {

    public static void main(String[] args) {


       FileInputStream fileInputStream = null;
        try {

        fileInputStream = new FileInputStream("C:/file.txt");
            }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.printf("file not found");
        }




    }
}
