package MyProject;


import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(System.in);
        try {
            Formatter type= new Formatter("clients.txt");

            try {
                type.format("%d" ,"%s", "%s",scanner.nextInt(),
                        scanner.nextLine(),scanner.next());
            }
            catch (NoSuchElementException exception){
                exception.printStackTrace();
            }
        }
        catch (SecurityException securityException){
            securityException.printStackTrace();
        }

    }

}
