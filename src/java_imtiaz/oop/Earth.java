package java_imtiaz.oop;

public class Earth {
    public static void main(String[] args) {
        Human tom;
        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zasbo";
        tom.speak();

        Human joe = new Human();
        tom.age = 10;
        tom.eyeColor = "black";
        tom.heightInInches = 70;
        tom.name = "Joe Buska";
        tom.speak();

    }
}
