package java_imtiaz.string_nested;
public class NestedForLoop {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            int temp = count +1;
            count = temp;
        }

        int counter=0;
        long t;
        System.out.println("nested for loop........");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        System.nanoTime();
                        System.out.println("the value of i: "+ i+ "-----" + j + "--------" + k + "----" + l);
                        counter++;

                    }
                }
            }
        }
        System.out.println(counter);

    }
}
