package lesson_2_4;

public class Bowl {
    private int food;

    public Bowl(int initialFood) {
        this.food = initialFood > 0 ? initialFood : 0;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount <= food && amount > 0) {
            food -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в миске: " + food);
        }
    }
}