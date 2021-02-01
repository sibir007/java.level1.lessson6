package ru.geekbrains.java.level1.lesson6;

import java.time.LocalDate;

public abstract class Pet {
    private final String name;
    private final String color;
    private final LocalDate birthday;
    private LocalDate deathDay = null; //день смерти
    private boolean alive = true; //живой-мёртвый
    private static int quantityPet = 0; // колличество созданных животных

    {
        quantityPet++;
    }
    public Pet() {
        this.name = "unknown";
        this.color = "unknown";
        this.birthday = LocalDate.now();
    }
    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
        this.birthday = LocalDate.now();
    }
    public Pet(String name, String color, int year, int month, int day){
        this.name = name;
        this.color = color;
        this.birthday = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getColor() {
        return color;
    }

    public boolean isAlive() {
        return alive;
    }

    public LocalDate getDeathDay() {
        return deathDay;
    }

    public void setDeathDay() {
        this.deathDay = LocalDate.now();
        this.alive = !alive;
    }

    public static int getQuantityPet() {
        return quantityPet;
    }

    public int getAge (){
        int age;
        LocalDate nowDay = LocalDate.now();
        LocalDate birthday = this.getBirthday();
        if (nowDay.getMonthValue() == birthday.getMonthValue()
                || nowDay.getDayOfMonth() == birthday.getDayOfMonth()){
            age = nowDay.getYear() - birthday.getYear();
        }else if (birthday.getMonthValue() <= nowDay.getMonthValue()) {
            age = nowDay.getYear() - birthday.getYear() - 1;
        }else {
            age = nowDay.getYear() - birthday.getYear();
        }
        return age;
    }

    @Override
    public abstract String toString();
    public abstract void run(int distance);
    public abstract void sail(int distance);

}
