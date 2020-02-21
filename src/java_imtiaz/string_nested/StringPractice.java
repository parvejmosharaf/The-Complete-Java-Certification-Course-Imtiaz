package java_imtiaz.string_nested;


public class StringPractice {
    public static void main(String[] args) {

        String str = "hello yogi there yogi there";
        System.out.println(str.charAt(8));
        System.out.println(str.substring(4,9));
        int x = str.indexOf("yogi"); //left to right count
        int y = str.lastIndexOf("yogi"); //right to left count
        System.out.println(x);
        System.out.println(y);
    }
}
