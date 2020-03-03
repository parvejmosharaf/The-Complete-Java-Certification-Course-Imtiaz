package java_imtiaz.string_nested;

public class ForLoop {
    public static void main(String[] args) {
        String name = "sfdfew";

        System.out.println("Print the string normally order...");

        for (int i = 0; i < name.length(); i++) {
            System.out.println("char: " + name.charAt(i));
        }

        System.out.println("Print the string in reverse order ...");
        for (int i = name.length()-1; i > 0 ; i--) {
            System.out.println("char: " + name.charAt(i) + i);
        }

        System.out.println("Print the even number using for and if condition...");

        for (int i = 0; i <=10 ; i++) {
            if(i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\nPrint odd numbers using only for loop");

        for (int i = 1; i < 10; i+=2) {
            System.out.print(i + " ");
        }






    }
}
