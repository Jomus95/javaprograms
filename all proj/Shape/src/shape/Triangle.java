package shape;


/**
 * Задача 3.4
 * Треугольник, который наследуется от класса Shape.
 * Создаётся по трём сторонам.
 */

public class Triangle extends Shape {

    private int edge1,edge2,edge3;

    public Triangle(){
        this(1,1,1, "Default orange");
    }

    public Triangle (int edge1, int edge2, int edge3){
        this(edge1,edge2,edge3, "Default orange");
    }

    public Triangle(int edge1, int edge2, int edge3, String color) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    /**
     * Периметр.
     */
    public double getPerimeter() {
        double per = (edge1 + edge2 + edge3);
        return per;
    }

    /**
     * Площадь.
     */
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt( p * ( p - edge1) * ( p - edge2) * ( p - edge3));
    }

    @Override
    public String toString() {
        return "Треугольник, с сторонами: " +edge1+", "+edge2+", "+edge3+", цвета: " + color + (!filled ? " не " : "") + " заполнен.";
    }
}
