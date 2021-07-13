package Kris.start.Money.step;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(30);

        System.out.println(plate);
        Cat[] cats = {new Cat("Мурзик", 11),
                new Cat("Снежок", 8),
                new Cat("Пушок", 10),
                new Cat("Том", 7),};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        plate.addfood(40);
        System.out.println(plate);
    }


}

