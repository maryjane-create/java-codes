package MyProject;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDirInfo {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter directory name");
        Path path= Paths.get(scanner.nextLine());

        if (Files.exists(path)){
            System.out.printf("%s", path.getFileName()+ " exists");
        }
        else {
            System.out.printf("%s,", path.getFileName()+" does not exist");
        }


    }
}
