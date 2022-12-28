import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int count=0;

        Dog dog = new Dog("Dog",40,200);
        Cat cat = new Cat("Cat", 30, 150);
        Cat cat1 = new Cat("Cat1", 30, 100);

        cat.animalRun(200);
        cat.animalSwim(100);

        dog.animalRun(300);
        dog.animalSwim(50);

        Animals.getCountAnimals();
        Dog.getCountDog();
        Cat.getCountDCat();

    }
}
