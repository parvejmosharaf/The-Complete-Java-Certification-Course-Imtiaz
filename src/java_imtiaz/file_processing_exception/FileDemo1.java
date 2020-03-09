package java_imtiaz.file_processing_exception;


import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Pax\\Desktop\\person");
        dir.mkdir();
        String showdir = dir.getAbsolutePath();
        System.out.println(showdir);
        System.out.println(dir.getName());
        if(dir.delete()){
            System.out.println(dir.getName() + " Directory has been deleted\n");
        }

        File file1 = new File("D:\\Programming\\The-Complete-Java-Certification-Course-Imtiaz\\src\\java_imtiaz\\file_processing_exception\\student.txt");
        File file2 = new File("D:\\Programming\\The-Complete-Java-Certification-Course-Imtiaz\\src\\java_imtiaz\\file_processing_exception\\teacher.txt");

        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created.");
        }catch (Exception e){
            System.out.println(e);
        }

        if(file1.exists()){
            System.out.println("File exists.");
        }
    }
}
