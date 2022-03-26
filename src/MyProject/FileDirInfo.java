package MyProject;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.Files.getLastModifiedTime;

public class FileDirInfo {

    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter directory name");
        Path path= Paths.get(scanner.nextLine());

        if (Files.exists(path)){
            System.out.printf("%s %n", path.getFileName()+ " exists");
            System.out.printf("%s %n ", path.isAbsolute());
            System.out.printf("%s %n", path.toString());
            System.out.printf("%s%n", Files.size(path));
            System.out.printf("%s%n", Files.getLastModifiedTime(path));
            System.out.printf("%s", path);
            System.out.printf("%s", path.toAbsolutePath());




            if (Files.isDirectory(path)){
                System.out.println("below are the directory contents");
                DirectoryStream<Path>directoryStream=Files.newDirectoryStream(path);
                for (Path path1:directoryStream){
                    System.out.println(path1);
                }
            }


        }
        else {
            System.out.printf("%s,", path.getFileName()+" does not exist");
        }


    }
}
