package java_imtiaz.file_processing_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Programming\\The-Complete-Java-Certification-Course-Imtiaz\\src\\java_imtiaz\\file_processing_exception\\t2.txt");
        Scanner input = new Scanner(file);
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
    }
}
