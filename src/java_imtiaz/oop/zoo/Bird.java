package java_imtiaz.oop.zoo;

public class Bird extends Animal {
    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }

}
