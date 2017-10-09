package theme6;

public class TestCircle {
    /**
     * Задание 6.3.3
     * Программа для тестирования всех методов в классе Circle
     */
    public static void main(String[] args) {
        System.out.println("Создадим обьект класса Circle c радиусом 10\n"+
                "Вызовём методы getPerimeter() и getArea().\n" +
                "Результат:\n");
        Circle circle = new Circle(10d);
        System.out.println("circle.getPerimeter() = "+circle.getPerimeter());
        System.out.println("circle.getArea() = "+circle.getArea());
        System.out.println();
        System.out.println("Все методы протестированы.");
    }
}
