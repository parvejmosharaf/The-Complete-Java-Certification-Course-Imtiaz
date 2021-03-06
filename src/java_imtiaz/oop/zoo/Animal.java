package java_imtiaz.oop.zoo;

public abstract class Animal {
    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping....");
    }
    public abstract void move();

}
