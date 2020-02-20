package java_imtiaz.oop.my_zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tiger", "male", 10, 15.5);
        animal1.eat();
        animal1.sleep();
        Bird bird1 = new Bird();
        bird1.fly();
        Fish fish = new Fish();
        fish.swim();
    }
}
