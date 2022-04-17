package Lesson3;

import java.util.ArrayList;

public class Box {

    private ArrayList<Fruit> product = new ArrayList<>();

    public Box() {
        ArrayList<Fruit> product = new ArrayList<>();
    }

    // Общий вес коробки
    public double getWeight() {
        double sumFruitWeight = 0.0f;
        for (Fruit e : product) {
            sumFruitWeight += e.getWeight();
        }
        return sumFruitWeight;
    }

    public ArrayList<Fruit> getFruit() {
        return product;
    }

    // Метод, чтобы положить фрукт в коробку
    public void add(Fruit fruit) {
        if (product.size() > 1) {
            if (isFruitEqual(fruit)) {
                throw new BoxException("Нельзя класть разные фрукты в одну коробку!");
            }
        }
        product.add(0, fruit);
    }

    // Сравнение веса коробок
    public boolean compare(Box other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.0001; // Не знала, как это лучше сделать, нагуглила такой способ)
    }

    //
    public void removeSingleFruit() {

    }


    public void shiftSingleItem(Box box2) throws BoxException {
                if (isFruitEqual(box2)) {
            throw new BoxException("Нельзя класть разные фрукты в одну коробку!");
        }
        for (int i = product.size() - 1; i >= 0; i--) {
            box2.getFruit().add(product.get(i));
            product.remove(i);
        }
    }

        public boolean isFruitEqual(Box otherBox) {
        return product.get(0).getClass() != otherBox.getFruit().get(0).getClass();
    }

    public boolean isFruitEqual(Fruit fruit) {
        return product.get(0).getClass() != fruit.getClass();
    }


}
