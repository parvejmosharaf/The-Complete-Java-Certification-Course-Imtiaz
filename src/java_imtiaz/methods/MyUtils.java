package java_imtiaz.methods;

class MyUtils {

    public static void printSomeJunk(String argument){
        System.out.println("some bla bla bla. " + argument);
    }
    public static void printSomeJunk(int argument){
        System.out.println("i am " + argument + " years old.");
    }

    public static void sum2Numbers(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static int add10(int someArgument){
        return someArgument+10;
    }
}
