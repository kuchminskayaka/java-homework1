package lesson_2_3;

public class Main {
    public static void main(String[] args) {
        // --- ЗАДАНИЕ 2: Массив из 5 товаров ---
        System.out.println("=== СПИСОК ТОВАРОВ ===");

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024", "Apple Inc.", "USA", 6499, false);
        productsArray[2] = new Product("Xiaomi 15", "10.11.2024", "Xiaomi Corp.", "China", 3999, true);
        productsArray[3] = new Product("Телевизор LG OLED", "05.05.2024", "LG Electronics", "South Korea", 2999, false);
        productsArray[4] = new Product("Ноутбук Asus ROG", "20.08.2024", "ASUS", "Taiwan", 4599, false);

        for (Product product : productsArray) {
            product.printInfo();
        }

        // --- ЗАДАНИЕ 3: Парк с аттракционами ---
        System.out.println("\n=== ИНФОРМАЦИЯ О ПАРКЕ ===");

        Park myPark = new Park("Луна-парк");

        myPark.addAttraction("Колесо обозрения", "10:00 - 22:00", 500);
        myPark.addAttraction("Американские горки", "11:00 - 21:00", 800);
        myPark.addAttraction("Комната страха", "12:00 - 23:00", 400);

        myPark.printParkInfo();
    }
}