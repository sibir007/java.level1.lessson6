package ru.geekbrains.java.level1.lesson6;

public class Cat extends Pet{
    protected final String type = "Cat";
    protected static int quantityCat = 0;
    protected final int APPETITE = 20;
    protected final int RUNDISTANCE = 200;
    protected final int SAILDISTANCE = 0;


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


    public static void main(String[] args) {

    }


}
