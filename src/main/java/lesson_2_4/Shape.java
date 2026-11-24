package lesson_2_4;

public interface Shape {
    // Дефолтный метод для расчета периметра
    default double getPerimeter() {
        return 0.0;
    }

    double getArea();
    String getFillColor();
    String getBorderColor();

    // Дефолтный метод для вывода всей информации
    default void printInfo() {
        System.out.println("Фигура: " + this.getClass().getSimpleName());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("-------------------------");
    }
}