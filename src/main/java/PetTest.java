import ru.geekbrains.java.level1.lesson6.Cat;
import ru.geekbrains.java.level1.lesson6.Dog;
import ru.geekbrains.java.level1.lesson6.Pet;
import ru.geekbrains.java.level1.lesson6.Plate;

public class PetTest {
    public static void main(String[] args) {
        Pet[] pets = new Pet[6];
        Dog unknownDog = new Dog();
        Dog sharikDog = new Dog("sharik","black",2015,3,5);
        Dog bobikDog = new Dog("bobik","white");
        Cat unknownCat = new Cat();
        Cat pushokCat = new Cat("pushok","black");
        Cat murzikCat = new Cat("murzik", "redhead", 2019,10,20);
        pets[0] = unknownDog;
        pets[1] = sharikDog;
        pets[2] = bobikDog;
        pets[3] = unknownCat;
        pets[4] = pushokCat;
        pets[5] = murzikCat;
//        unknownDog.run(100);
//        sharikDog.run(500);
//        bobikDog.run(600);
//        unknownDog.sail(15);
//        sharikDog.sail(10);
//        bobikDog.sail(15);
//        unknownCat.sail(5);
//        unknownCat.run(100);
//        pushokCat.run(200);
//        murzikCat.run(250);
        for (Pet pet : pets) {
            System.out.println(pet);
        }
        System.out.println("Колличество домашних животных " + Pet.getQuantityPet());
        System.out.println("Клличество котов " + Cat.getQuantityCat());
        System.out.println("Колличество собак " + Dog.getQuantityDog());
//        System.out.println("Возраст Шарика " + sharikDog.getAge());

        Plate plate = new Plate(100);
        plate.fillPlate(150);
        for (Pet pet: pets) {
            pet.givPlate(plate);
            pet.eat();
        }
        plate.fillPlate(80);
        for (Pet pet: pets) {
            pet.eat();
        }
        plate.info();

    }
}
