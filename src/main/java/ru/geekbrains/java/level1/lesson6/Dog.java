package ru.geekbrains.java.level1.lesson6;

public class Dog extends Pet {
    protected final String type = "Dog";
    private static int quantityDog = 0;
    protected final int APPETITE = 30;
    protected final int RUNDISTANCE = 500;
    protected final int SAILDISTANCE = 10;

    {
        quantityDog++;
    }

    public Dog(){
        super();
    }

    public Dog(String name, String color){
        super(name, color);
    }

    public Dog(String name, String color, int year, int month, int day){
        super(name, color, year, month, day);
    }

    public static int getQuantityDog() {
        return quantityDog;
    }

//    @Override
//    public void run(int distance) {
//        if (this.alive) {
//            if (distance <= 500){
//                System.out.println(this.type + " " + this.name + " пробежал " + distance + "м");
//            }else {
//                this.setDeathDay();
//                System.out.println(this.type + " " + this.name + " пробежал " + distance + "м и " +
//                        "умер");
//            }
//        } else {
//            System.out.println(this.type + " " + this.name + " мёртвый, не может бежать");
//        }
//    }
//
//    @Override
//    public void sail(int distance) {
//        if (this.alive) {
//            if (distance <= 10){
//                System.out.println(this.type + " " + this.name + " проплыл " + distance + "м");
//            }else {
//                this.setDeathDay();
//                System.out.println(this.type + " " + this.name + " проплыл " + distance + "м и умер");
//            }
//        } else {
//            System.out.println(this.type + " " + this.name + " мёртвый, не может плыть");
//        }
//    }
    @Override
    public String getType() {
    return type;
}

    @Override
    public int getAPPETITE() {
        return APPETITE;
    }

    @Override
    public int getRUNDISTANCE() {
        return RUNDISTANCE;
    }

    @Override
    public int getSAILDISTANCE() {
        return SAILDISTANCE;
    }


}
