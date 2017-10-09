package my.objects;


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

    /**
     * Периметр.
     */
    public double getPerimeter() {
        return edge1 + edge2 + edge3;
    }

    /**
     * Площадь.
     */
    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - edge1) * (getPerimeter() / 2 - edge2) * (getPerimeter() / 2 - edge3));
    }

    @Override
    public String toString() {
        return "Треугольник, с сторонами: " +edge1+", "+edge2+", "+edge3+", цвета: " + color + ", и площадью " + getArea() + ".";
    }
}
