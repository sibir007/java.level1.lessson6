package ru.geekbrains.java.level1.lesson6;

import java.time.LocalDate;

public abstract class Pet {
    protected final String name;
    protected final String color;
    protected final LocalDate birthday;
    protected LocalDate deathDay = null; //день смерти
    protected boolean alive = true; //живой-мёртвый
    private static int quantityPet = 0; // колличество созданных животных
    protected int satiety = 0;
    protected Plate plate;

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


    private void setDeathDay() {
        this.deathDay = LocalDate.now();
        this.alive = !alive;
    }

    public static int getQuantityPet() {
        return quantityPet;
    }

    public int getAge (){
        int age;
        LocalDate nowDay = LocalDate.now();
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

    public void run(int distance) {
        if (this.alive) {
            if (distance <= this.getRUNDISTANCE()){
                System.out.println(this.getType() + " " + this.name + " пробежал " + distance + "м");
            }else {
                this.setDeathDay();
                System.out.println(this.getType() + " " + this.name + " пробежал " + distance + "м и " +
                        "умер");
            }
        } else {
            System.out.println(this.getType() + " " + this.name + " мёртвый, не может бежать");
        }
    }

    public void sail(int distance) {
        if (this.alive) {
            if (distance <= this.getSAILDISTANCE()){
                System.out.println(this.getType() + " " + this.name + " проплыл " + distance + "м");
            }else {
                this.setDeathDay();
                System.out.println(this.getType() + " " + this.name + " проплыл " + distance + "м и умер");
            }
        } else {
            System.out.println(this.getType() + " " + this.name + " мёртвый, не может плыть");
        }
    }

    public void givPlate(Plate plate){
        this.plate = plate;
    }

    /**
     *
     */
    public void eat() {
        if (this.getAPPETITE() <= this.satiety){
            System.out.printf("%s %s сытый, не может больше есть\n",this.getType(), this.name);
        } else {
            int quantityEat = this.plate.consumptionFood(this.getAPPETITE());
            this.satiety = this.satiety + quantityEat;
            System.out.printf("%s %s съел %d единиц еды, всего сытость %d (%.0f%s)\n",this.getType(), this.name,
                    quantityEat, this.satiety,
                    ((double) this.satiety / (double) this.getAPPETITE())*100, "%");
        }
    }

    @Override
    public String toString() {
        return this.getType() + "{" +
                "name='" + this.name + '\'' +
                ", color='" + this.color + '\'' +
                ", birthday=" + this.birthday.toString() + '\'' +
                ", alive=" + this.alive +
                '}';
    }
    public abstract String getType();

    public abstract int getAPPETITE();

    public abstract int getRUNDISTANCE();

    public abstract int getSAILDISTANCE();

}
