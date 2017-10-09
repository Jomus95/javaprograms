package theme3;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
        this((int)(50 + 50 * Math.random()));
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом: " + radius + ", и периметром: " + getPerimeter() +
                ", по площади равен: " + getArea() + ", цвет круга: " + color +
                ", " + (!filled ? "не " : "") + "заполнен.";
    }

    //тестирование класса
    public static void main(String[] args) {
        System.out.println("Создадим три обьекта-круга, для того что бы протестировать все конструкторы, " +
                "радиус в первому и второму кругу поставим рандомным, от 100 до 500, первый круг будет не" +
                " заполнен, и синего цвета, второму кругу эти значения будут установлены по умолчанию. " +
                "Третьему кругу все значения будут установлены по умолчанию. После создания выведем в консоль" +
                " информацию о них используя методы toString().\n");
        Circle circle1 = new Circle((int)(100 + 400 * Math.random()), "синий", false);
        Circle circle2 = new Circle((int)(100 + 400 * Math.random()));
        Circle circle3 = new Circle();
        System.out.println("Круг №1:");
        System.out.println(circle1.toString());
        System.out.println("Круг №2:");
        System.out.println(circle2.toString());
        System.out.println("Круг №3:");
        System.out.println(circle2.toString());
        System.out.println();

        System.out.println("Проверим все set-методы в классе, используя их " +
                "изменим все значения в первом круге и снова выведем его в консоль.\n");
        circle1.setColor("фиолетовый");
        circle1.setFilled(true);
        circle1.setRadius(10);
        System.out.println("Круг №1 после изменения:");
        System.out.println(circle1);
        System.out.println();

        System.out.println("Проверим все get-методы в классе, используя их " +
                "выведем все значения из первого круга в консоль.\n");

        System.out.println("circle1.getRadius() = " + circle1.getRadius());
        System.out.println("circle1.getPerimeter() = "+circle1.getPerimeter());
        System.out.println("circle1.getArea() = "+circle1.getArea());
        System.out.println("circle1.getColor() = "+circle1.getColor());
        System.out.println("circle1.isFilled() = "+circle1.isFilled());
    }
}
