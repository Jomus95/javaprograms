package my.objects;

/**
 * Задача 3.5
 * Квадрат, который наследуется от класса Rectangle.
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double edge) {
        super(edge);
    }

    public Square(double edge, String color) {
        super(edge, edge, color);
    }

    /**
     * Следующие методы переопределены,
     * для того что бы квадрат всегда оставался квадратным.
     */
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width) {
        super.setHeight(width);
        super.setWidth(width);
    }


    @Override
    public String toString() {
        return "Квадрат с размером: " + width + "х" + height + ", цветом: '" + color + "', и по площади равен: " + getArea() + ".";
    }


}
