
import my.objects.Cylinder;


/**
 * Задача 2.1
 * Демонстрация работы всех методов класса Cylinder
 */

public class TestCylinder {
    public static void main(String[] args) {

        System.out.println("Тестирование класса Cylinder.\n" +
                "Для начала создаём экземпляр класса.\n" +
                "И сразу же выведем его в консоль, тем самым протестировав метод toString().\n" +
                "Результат:\n");
        Cylinder cylinder = new Cylinder(1,1, "spring green");
        System.out.println(cylinder); //вызывается метод toString
        System.out.println("\n" +
                "Протестируем все set-методы нашего обьекта, изменив с их помощью радиус цилиндра, высоту, и его цвет.\n" +
                "Результат:\n");
        cylinder.setRadius(5);
        cylinder.setHeight(2);
        cylinder.setColor("autum gold");
        System.out.println(cylinder + "\n");
        System.out.println("Тест всех get-методов в классе Cylinder: " +
                "circle.getRadius() = " + cylinder.getRadius() +",\n" +
                "circle.getHeight() = "+ cylinder.getHeight() +",\n" +
                "circle.getBaseArea() = "+ cylinder.getBaseArea() +",\n" +
                "circle.getArea() = "+ cylinder.getArea() +",\n" +
                "circle.getVolume() = "+ cylinder.getVolume() +",\n" +
                "circle.getColor() = "+ cylinder.getColor()+".\n\n" +
                "Все публичные методы в классе Сircle протестированы.");

    }
}
