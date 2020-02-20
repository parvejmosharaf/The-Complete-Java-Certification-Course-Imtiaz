package java_imtiaz.basic_java;

public class LearningArrays {
    public static void main(String[] args) {
        int[] values = new int[100];
        values[2] = 1005;
        values[0] = 1009;
        System.out.println(values[0]);

        //String [] words = new String[] {"my", "name", "is"};
        String [] words = new String[3];
        words[0] = "My";
        words[1] = "name";
        words[2] = "is";
        System.out.println(words[2]);
        words = new String[10];
        System.out.println(words[0]);

    }
}
