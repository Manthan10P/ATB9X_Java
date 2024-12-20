package NOV.LAB18112024_Exception.LAB02;

//FileNotFoundException: This Exception is raised when a file is not accessible or does not open.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class File_notFound_Demo {

    public static void main(String args[]) {
        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}