package theme3;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(){
        this((int)(50 + 50 * Math.random()), (int)(50 + 50 * Math.random()));
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return width+length*2;
    }

    @Override
    public String toString() {
        return "Прямоугольник с размерами: " + width + " x " + length + ", и периметром: " + getPerimeter() +
                ", по площади равен: " + getArea() + ", цвет прямоугольника: " + color +
                ", " + (!filled ? "не " : "") + "заполнен.";
    }



    public static void main(String[] args) { //тестирование класса
        System.out.println("Создадим три обьекта-прямоугольника, для того что бы протестировать все конструкторы, " +
                "размеры в первому и второму прямоугольнику поставим рандомно, от 100 до 500, первый прямоугольник " +
                "будет не заполнен, и синего цвета, второму прямоугольнику эти значения будут установлены по умолчанию. " +
                "Третьему прямоугольнику все значения будут установлены по умолчанию. После создания выведем в консоль" +
                " информацию о них используя методы toString().\n");
        Rectangle rectangle1 = new Rectangle((int)(100 + 400 * Math.random()),(int)(100 + 400 * Math.random()), "синий", false);
        Rectangle rectangle2 = new Rectangle((int)(100 + 400 * Math.random()), (int)(100 + 400 * Math.random()));
        Rectangle rectangle3 = new Rectangle();
        System.out.println("Прямоугольник №1:");
        System.out.println(rectangle1.toString());
        System.out.println("Прямоугольник №2:");
        System.out.println(rectangle2.toString());
        System.out.println("Прямоугольник №3:");
        System.out.println(rectangle3.toString());
        System.out.println();

        System.out.println("Проверим все set-методы в классе, используя их " +
                "изменим все значения в первом пямоугольнике и снова выведем его в консоль.\n");
        rectangle1.setColor("фиолетовый");
        rectangle1.setFilled(true);
        rectangle1.setWidth(50);
        rectangle1.setLength(80);
        System.out.println("Прямоугольник №1 после изменения:");
        System.out.println(rectangle1);
        System.out.println();

        System.out.println("Проверим все get-методы в классе, используя их " +
                "выведем все значения из первого прямоугольника в консоль.\n");

        System.out.println("rectangle1.getWidth() = " + rectangle1.getWidth());
        System.out.println("rectangle1.getLength() = " + rectangle1.getLength());
        System.out.println("rectangle1.getPerimeter() = "+rectangle1.getPerimeter());
        System.out.println("rectangle1.getArea() = "+rectangle1.getArea());
        System.out.println("rectangle1.getColor() = "+rectangle1.getColor());
        System.out.println("rectangle1.isFilled() = "+rectangle1.isFilled());
    }
}
