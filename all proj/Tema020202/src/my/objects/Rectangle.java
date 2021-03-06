package my.objects;

/**
 * Задача 2.3
 */
public class Rectangle {

    protected double width, height;
    protected String color;

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

    /**
     * Дополнительный метод, который необходим по условию задачи 2.3
     * этот метод возвращает длинну диагонали чётырёхугольника.
     */
    public double getDiagonal(){
        return Math.sqrt(width*width+height*height);
    }

    /**
     * Второй дополнительный метод, который необходим по условию задачи 2.3
     * этот метод меняет местами значения длинны и ширины.
     */
    public void flip(){
        double temp = width;
        width = height;
        height = temp;
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
