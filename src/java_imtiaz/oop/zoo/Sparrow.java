package java_imtiaz.oop.zoo;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high...");
    }
}
