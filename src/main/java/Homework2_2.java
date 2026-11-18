public class Homework2_2 {

    public static void main(String[] args) {
        System.out.println("--- Задание 1 ---");
        printThreeWords();

        System.out.println("\n--- Задание 2 ---");
        checkSumSign();

        System.out.println("\n--- Задание 3 ---");
        printColor();

        System.out.println("\n--- Задание 4 ---");
        compareNumbers();

        System.out.println("\n--- Задание 5 ---");
        System.out.println("Сумма 5 и 10 в пределах 10-20? " + isSumInRange(5, 10));

        System.out.println("\n--- Задание 6 ---");
        checkNumberSign(0);

        System.out.println("\n--- Задание 7 ---");
        System.out.println("Число -5 отрицательное? " + isNegative(-5));

        System.out.println("\n--- Задание 8 ---");
        printStringMultipleTimes("Привет", 3);

        System.out.println("\n--- Задание 9 ---");
        System.out.println("2024 год високосный? " + isLeapYear(2024));

        System.out.println("\n--- Задание 10 ---");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(binaryArray);
        for (int j : binaryArray) System.out.print(j + " ");
        System.out.println();

        System.out.println("\n--- Задание 11 ---");
        int[] hundredArray = new int[100];
        fillArray(hundredArray);
        System.out.println("Массив заполнен. Первый элемент: " + hundredArray[0] + ", последний: " + hundredArray[99]);

        System.out.println("\n--- Задание 12 ---");
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(arr12);
        for (int j : arr12) System.out.print(j + " ");
        System.out.println();

        System.out.println("\n--- Задание 13 ---");
        int[][] squareMatrix = new int[5][5];
        fillDiagonals(squareMatrix);
        for (int[] row : squareMatrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("\n--- Задание 14 ---");
        int[] customArray = createArray(5, 7);
        for (int j : customArray) System.out.print(j + " ");
        System.out.println();
    }

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign() {
        int a = 10;
        int b = -15;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 15;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6
    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // 9
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }

    // 11
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    // 12
    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    // 13
    public static void fillDiagonals(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
    }

    // 14
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}