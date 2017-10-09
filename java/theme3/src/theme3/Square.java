package theme3;

public class Square extends Rectangle {


    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(){
        this((int)(50+Math.random()*50));
    }

    public void setSide(Double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public String toString() {
        return "Квадрат с размером стороны: " + getSide() + ", и периметром: " + getPerimeter() +
                ", по площади равен: " + getArea() + ", цвет квадрата: " + color +
                ", " + (!filled ? "не " : "") + "заполнен.";
    }



    public static void main(String[] args) { //тестирование класса
        System.out.println("Создадим три обьекта-квадрата, для того что бы протестировать все конструкторы, " +
                "размеры в первому и второму квадрату поставим рандомно, от 100 до 500, первый квадрат " +
                "будет не заполнен, и синего цвета, второму квадрату эти значения будут установлены по умолчанию. " +
                "Третьему квадрату все значения будут установлены по умолчанию. После создания выведем в консоль" +
                " информацию о них используя методы toString().\n");
        Square square1 = new Square((int)(100 + 400 * Math.random()), "синий", false);
        Square square2 = new Square((int)(100 + 400 * Math.random()));
        Square square3 = new Square();
        System.out.println("Прямоугольник №1:");
        System.out.println(square1.toString());
        System.out.println("Прямоугольник №2:");
        System.out.println(square2.toString());
        System.out.println("Прямоугольник №3:");
        System.out.println(square3.toString());
        System.out.println();

        System.out.println("Проверим все set-методы в классе, используя их " +
                "изменим все значения в первом пямоугольнике и снова выведем его в консоль.\n");
        square1.setColor("фиолетовый");
        square1.setFilled(true);
        square1.setSide(50d);
        System.out.println("Квадрат №1 после изменения:");
        System.out.println(square1);
        System.out.println();

        System.out.println("Проверим все get-методы в классе, используя их " +
                "выведем все значения из первого прямоугольника в консоль.\n");

        System.out.println("square1.getSide() = " + square1.getSide());
        System.out.println("square1.getWidth() = " + square1.getWidth());
        System.out.println("square1.getLength() = " + square1.getLength());
        System.out.println("square1.getPerimeter() = "+square1.getPerimeter());
        System.out.println("square1.getArea() = "+square1.getArea());
        System.out.println("square1.getColor() = "+square1.getColor());
        System.out.println("square1.isFilled() = "+square1.isFilled());
    }
}
