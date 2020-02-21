package java_imtiaz.example.my_zoo;

public class Bird extends Animal {
    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void fly(){
        System.out.println("This bird can fly.");
    }
}
