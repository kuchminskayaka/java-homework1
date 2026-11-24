package lesson_2_4;

public class Cat extends Animal {
    private static int catCount = 0;
    private final int maxRunDistance = 200;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (Максимум: " + maxRunDistance + " м.)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    public void eat(Bowl bowl, int appetite) {
        if (bowl.getFood() >= appetite) {
            bowl.decreaseFood(appetite);
            this.isFull = true;
            System.out.println(name + " поел(а) " + appetite + " еды и теперь сыт(а).");
        } else {
            System.out.println(name + " не стал(а) есть, так как в миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}