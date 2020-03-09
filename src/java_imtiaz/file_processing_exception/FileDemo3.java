package java_imtiaz.file_processing_exception;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Programming\\The-Complete-Java-Certification-Course-Imtiaz\\src\\java_imtiaz\\file_processing_exception\\student.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("Id: " + id + " Name: " + name);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
