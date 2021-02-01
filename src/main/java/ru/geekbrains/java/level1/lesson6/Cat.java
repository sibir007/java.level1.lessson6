package ru.geekbrains.java.level1.lesson6;

public class Cat extends Pet{
    private static int quantityCat = 0;

    {
        quantityCat++;
    }

    public Cat(){
        super();
    }

    public Cat(String name, String color){
        super(name, color);
    }

    public Cat(String name, String color, int year, int month, int day){
        super(name, color, year, month, day);
    }

    public static int getQuantityCat() {
        return quantityCat;
    }

    @Override
    public void run(int distance) {
        if (isAlive()) {
            if (distance <= 200){
                System.out.println("Cat " + this.getName() + " пробежал " + distance + "м");
            }else {
                this.setDeathDay();
                System.out.println("Cat " + this.getName() + " пробежал " + distance + "м и умер");
            }
        } else {
            System.out.println("Cat " + this.getName() + " мёртвый, не может бежать");
        }
    }

    @Override
    public void sail(int distance) {
        if (isAlive()) {
            this.setDeathDay();
            System.out.println("Cat " + this.getName() + " прыгнул в воду и утанул, не умел плавать");
        } else {
            System.out.println("Cat " + this.getName() + " мёртвый, не может плыть");
        }
    }

    @Override
    public String toString() {
        return "Cat" + "{" +
                "name='" + this.getName() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", birthday=" + this.getBirthday().toString() + '\'' +
                ", alive=" + this.isAlive() +
                '}';
    }
}
