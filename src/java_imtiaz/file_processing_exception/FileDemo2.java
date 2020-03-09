package java_imtiaz.file_processing_exception;


import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args) {

        String id,name;
        Scanner input = new Scanner(System.in);

        try{
            Formatter formatter = new Formatter("D:\\Programming\\The-Complete-Java-Certification-Course-Imtiaz\\src\\java_imtiaz\\file_processing_exception\\student.txt");

            System.out.print("how many students: ");
            int num = input.nextInt();

            for (int i = 0; i < num; i++) {
                System.out.print("ID and Name: ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\n", id, name);
            }

            formatter.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
