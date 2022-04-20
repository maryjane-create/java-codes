package MyProject;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class printMessage {
    private static Scanner input;

    public static void main(String[] args) throws IOException {


        System.out.println("Enter file or directory name:");
        // create Path object based on user input
        Path path = Paths.get(input.nextLine());
        if ( Files.exists(path) ) { // if path exists, output info about it
// display file (or directory) information
            System.out.printf("%n%s exists%n", path.getFileName() );
            System.out.printf("%s a directory%n",
                    Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("%s an absolute path%n",
                    path.isAbsolute() ? "Is" : "Is not");
            System.out.printf("Last modified: %s%n",
                    Files.getLastModifiedTime(path) );
            System.out.printf("Size: %s%n", Files.size(path) );
            System.out.printf("Path: %s%n", path );
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath() );

        }
    }
}

