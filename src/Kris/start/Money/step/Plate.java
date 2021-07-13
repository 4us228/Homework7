package Kris.start.Money.step;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decrease(int amount) {

        if (amount > food) {
            return false;
        }
        food -= amount;
        return true;
    }

    public void addfood(int add) {
        if (add <= 0) {
            System.out.println("Вы не можете так сделать");
        } else {
           food +=add;
            System.out.println("Вы добавили " + add + " единиц еды");
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
