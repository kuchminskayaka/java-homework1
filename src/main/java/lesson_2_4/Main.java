package lesson_2_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- ЗАДАНИЕ 1: Животные ---");

        // Демонстрация бега и плавания
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(150);
        dogBobik.run(600);
        dogBobik.swim(5);
        dogBobik.swim(15);

        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(150);
        catBarsik.run(250);
        catBarsik.swim(10);

        System.out.println("\n--- КОРМЛЕНИЕ КОТОВ ---");
        // Создаем массив котов
        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Рыжик"),
                new Cat("Васька"),
                new Cat("Том")
        };

        // Создаем миску с 50 едой
        Bowl bowl = new Bowl(50);

        // Каждому коту даем аппетит, например, по 15 единиц
        for (Cat cat : cats) {
            cat.eat(bowl, 15);
        }

        // Выводим информацию о сытости
        System.out.println("\nИнформация о сытости котов:");
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот №" + (i + 1) + " сыт? -> " + cats[i].isFull());
        }

        // Добавляем еду в миску
        bowl.addFood(20);

        // Счетчики
        System.out.println("\n--- СТАТИСТИКА ---");
        System.out.println("Всего животных создано: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        System.out.println("\n--- ЗАДАНИЕ 2: Геометрические фигуры ---");
        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Красный");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}