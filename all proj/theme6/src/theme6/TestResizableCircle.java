package theme6;

public class TestResizableCircle {

    public static void main(String[] args) {
        System.out.println("Создадим обьект класса ResizableCircle c радиусом 10\n"+
                "Вызовём методы getPerimeter() и getArea().\n");
        ResizableCircle circle = new ResizableCircle(10d);
        System.out.println("circle.getPerimeter() = "+circle.getPerimeter());
        System.out.println("circle.getArea() = "+circle.getArea());
        System.out.println();
        System.out.println("Воспользуемся методом resize() с параметром 50 (%)" +
                " для того что бы уменьшить размер круга в 2 раза. " +
                "И снова вызовём методы getPerimeter() и getArea()." +
                "Результат:\n");
        circle.resize(50);
        System.out.println("circle.getPerimeter() = "+circle.getPerimeter());
        System.out.println("circle.getArea() = "+circle.getArea());
        System.out.println();
        System.out.println("Воспользуемся методом resize() с параметром 200 (%)" +
                " для того что бы вернуть исходный размер круга. " +
                "И снова вызовём методы getPerimeter() и getArea()." +
                "Результат:\n");
        circle.resize(200);
        System.out.println("circle.getPerimeter() = "+circle.getPerimeter());
        System.out.println("circle.getArea() = "+circle.getArea());
        System.out.println();
        System.out.println("Все методы протестированы.");


    }
}
