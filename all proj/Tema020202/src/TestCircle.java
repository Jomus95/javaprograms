import my.objects.Circle;

import java.util.Arrays;

/**
 * Задача 2.1
 * Демонстрация работы всех методов класса Сircle
 */

public class TestCircle {
    public static void main(String[] args) {

        System.out.println("Тестирование класса Circle.\n" +
                "Для начала создаём экземпляр класса.\n" +
                "И сразу же выведем его в консоль, тем самым протестировав метод toString().\n" +
                "Результат:\n");
        Circle circle = new Circle(2,"shiny red");
        System.out.println(circle.toString()); //вызывается метод toString
        System.out.println("\n" +
                "Протестируем все set-методы нашего обьекта, изменив с их помощью радиус круга и его цвет.\n" +
                "Результат:\n");
        circle.setRadius(3.5);
        circle.setColor("charcoal black");
        System.out.println(circle);
        System.out.println("Тест всех get-методов в классе circle: " +
                "circle.getRadius() = " + circle.getRadius() +",\n" +
                "circle.getArea() = "+ circle.getArea() +",\n" +
                "circle.getColor() = "+ circle.getColor()+".\n\n" +
                "Все публичные методы в классе Сircle протестированы.");

    }
}
