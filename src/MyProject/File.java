package MyProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File {

    public static void main(String3[] args) {


       FileInputStream fileInputStream = null;
        try {

        fileInputStream = new FileInputStream("C:/file.txt");
            }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.printf("file not found");
        }




    }
}
