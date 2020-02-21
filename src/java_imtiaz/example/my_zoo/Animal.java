package java_imtiaz.example.my_zoo;

public class Animal {
    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
