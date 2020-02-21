package java_imtiaz.oop.my_zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tiger",10, 15.5);
        animal1.eat();
        animal1.sleep();
        Bird bird1 = new Bird("m", 5, 12.5);
        bird1.fly();
        Fish fish = new Fish("h", 6, 5.5);
        fish.swim();
    }
}
