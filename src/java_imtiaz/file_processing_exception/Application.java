package java_imtiaz.file_processing_exception;

import java_imtiaz.example.my_zoo.Fish;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        /*for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter some text: ");
            String s = input.nextLine();
            System.out.println(s);
        }*/

        File file = new File("D:\\Programming\\The-Complete-Java-Certification-Course-Imtiaz\\src\\java_imtiaz\\file_processing_exception\\t1.txt");
        BufferedReader bufferedReader = null;
        try{
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        } catch (IOException e) {
            System.out.println("problem reading the file " + file.getName());
        } finally {
            bufferedReader.close();
        }
    }
}
