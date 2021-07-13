package Kris.start.Money.step;

public class Cat {
    private String name;
    private int eating;
    private boolean fat = false;

    public Cat(String name, int eating) {
        this.name = name;
        this.eating = eating;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (plate.decrease(eating)) {
            System.out.println("Кот " + name + " покушал");
            fat = true;
            System.out.println(fat);
        }else{
            System.out.println("Кот "+ name + " не покушал");
            System.out.println(fat);
        }

    }

}
