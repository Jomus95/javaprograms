package my.objects;

/**
 * Задача 3.4
 * Прямоугольник, который наследуется от класса Shape.
 */
public class Rectangle extends Shape {

    protected double width, height;

    public Rectangle() {
        this(1);
    }

    public Rectangle(double edge){
        width = height = edge;
    }

    public Rectangle(double width, double height) {
        this(width, height, "Default blue");
    }

    public Rectangle(double width, double height, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getArea() {
        return width * height;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Чётырёхугольник с размером: " + width + "х" + height + ", цветом: '" + color + "', и по площади равен: " + getArea() + ".";
    }
}
