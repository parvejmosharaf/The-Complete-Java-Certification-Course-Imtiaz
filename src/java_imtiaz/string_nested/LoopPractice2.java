package java_imtiaz.string_nested;

public class LoopPractice2 {
    public static void main(String[] args) {
        String str = "We have a large inventory of things in our warehouse falling in "
                + "the  category:apperal and the slightly "
                + "more in demand category:makeup along with the category:furniture and ...";
        printCategories(str);
    }

    public static void printCategories(String str){
        int count = 0 ;
        while (true){
            int found = str.indexOf("category:", count);
            if(found == -1) break;
            int start = found + 9; // start actual category.
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start,end));
            count = end + 1;

        }
        System.out.println(2 << 4);
    }
}
