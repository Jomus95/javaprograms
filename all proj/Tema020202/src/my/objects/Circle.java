package my.objects;

/**
 * Задача 2.1, 3.3
 * Rласc, полностью соответствующий задаче 2.1
 */
public class Circle {

    protected double radius;
    protected String color;

    public Circle(){
        this(1);
    }

    public Circle(double radius){
        this(radius,"Default red");
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Круг с радиусом: " + radius + ", цвета: '" + color + "', и по площади равен: " + getArea() + ".";
    }
}
