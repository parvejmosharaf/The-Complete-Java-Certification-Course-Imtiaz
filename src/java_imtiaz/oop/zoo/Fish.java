package java_imtiaz.oop.zoo;

public class Fish extends Animal {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void swim(){
        System.out.println("Swim...");
    }
}
