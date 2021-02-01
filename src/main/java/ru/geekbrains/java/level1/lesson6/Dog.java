package ru.geekbrains.java.level1.lesson6;

public class Dog extends Pet {
    private static int quantityDog = 0;

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

    @Override
    public void run(int distance) {
        if (isAlive()) {
            if (distance <= 500){
                System.out.println("Dog " + this.getName() + " пробежал " + distance + "м");
            }else {
                this.setDeathDay();
                System.out.println("Dog " + this.getName() + " пробежал " + distance + "м и умер");
            }
        } else {
            System.out.println("Dog " + this.getName() + " мёртвый, не может бежать");
        }
    }

    @Override
    public void sail(int distance) {
        if (isAlive()) {
            if (distance <= 10){
                System.out.println("Dog " + this.getName() + " проплыл " + distance + "м");
            }else {
                this.setDeathDay();
                System.out.println("Dog " + this.getName() + " проплыл " + distance + "м и умер");
            }
        } else {
            System.out.println("Dog " + this.getName() + " мёртвый, не может плыть");
        }
    }

    @Override
    public String toString() {
        return "Dog" + "{" +
                "name='" + this.getName() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", birthday=" + this.getBirthday().toString() + '\'' +
                ", alive=" + this.isAlive() +
                '}';
    }
}
