package java_imtiaz.oop.my_zoo;

public class Animal {
    String name;
    String gender;
    int age;
    double weight;

    public Animal(String name, String gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
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
