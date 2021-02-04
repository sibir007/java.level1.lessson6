package ru.geekbrains.java.level1.lesson6;

public class Plate {
    private final int capacityPlate;
    private int fullnessPlate;

    public Plate (int capacityPlate) {
        this.capacityPlate = capacityPlate;
        this.fullnessPlate = 0;
    }

    public int getCapacityPlate() {
        return this.capacityPlate;
    }

    public int getFullnessPlate() {
        return this.fullnessPlate;
    }

    /**
     * В тарелку добавляют какое-то кол-во еды, если общее колличество еды (то что есть в тарелке + то что добавляют)
     * больше её вместимости тарелка становится полной а остаток просыпается
     * @param quantityFood колличество добавляемой еды
     */
    public void fillPlate(int quantityFood) {
        if (quantityFood + this.fullnessPlate <= this.capacityPlate) {
            this.fullnessPlate = quantityFood + this.fullnessPlate;
            System.out.printf("В тарелку добавили %d единиц еды, всего еды в тарелке %d\n", quantityFood,
                    this.fullnessPlate);
        } else {
            int spilledFood = this.fullnessPlate + quantityFood - this.capacityPlate;
            this.fullnessPlate = this.capacityPlate;
            System.out.printf("В тарелку добавили %d единиц еды, из них %d просыпалось, всего еды в тарелке %d\n",
                    quantityFood,
                    spilledFood, this.fullnessPlate);
        }

    }

    /**
     * Из тарелки пытаются сьесть еду, колличестово еды в тарелке уменьшается, если колличество еды в тарелке меньше
     * чем пытаются сьесть то тарелка становится пустой а колличество сьеденной еды становится равной остатку тарелки
     * @param quantityFood колличество еды которое пытаются съесть
     * @return колличество еды которую съели
     */
    public int consumptionFood(int quantityFood) {
        int quantity;
        if (quantityFood > this.fullnessPlate) {
            quantity = this.fullnessPlate;
            this.fullnessPlate = 0;
            System.out.printf("Из тарелке хотели съесть %d, съели %d, в тарелке осталось %d\n", quantityFood, quantity,
                    this.fullnessPlate);
        } else {
            quantity = quantityFood;
            this.fullnessPlate = this.fullnessPlate - quantityFood;
            System.out.printf("Из тарелке съели %d, в тарелке осталось %d\n", quantity, this.fullnessPlate);
        }
        return quantity;
    }

    /**
     * Выводит информацию о заполненности терелки
     */
    public void info() {
        System.out.printf("Вместимость тарелки %d, остаток %d (%.0f%s)", this.capacityPlate,
                this.fullnessPlate,
                ((double)this.fullnessPlate / (double) this.capacityPlate)*100, "%");
    }



    /**
     * Тест
     */
    public static void main(String[] args) {
        Plate plate1 = new Plate(100);
        plate1.consumptionFood(30);
        plate1.fillPlate(90);
        plate1.fillPlate(5);
        plate1.fillPlate(20);
        plate1.consumptionFood(70);
        plate1.consumptionFood(40);

    }
}
