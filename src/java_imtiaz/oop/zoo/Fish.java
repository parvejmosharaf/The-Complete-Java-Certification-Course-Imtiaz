package java_imtiaz.oop.zoo;

public class Fish extends Animal {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming.");
    }

    public void swim(){
        System.out.println("Swim...");
    }
}
