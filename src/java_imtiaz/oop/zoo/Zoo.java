package java_imtiaz.oop.zoo;
//same method but we can use for

public class Zoo {
    public static void main(String[] args) {
        Animal sparrow1 = new Sparrow("pag", 1,1.4);
        sparrow1.move();
        //sparrow1.fly();

        Animal fish1 = new Fish("carp", 1, 1.3);
        fish1.move();
        //fish1.swim();
        moveAnimals(sparrow1);
        moveAnimals(fish1);

    }
    public static void moveAnimals(Animal animal){
        animal.move();
    }
}
