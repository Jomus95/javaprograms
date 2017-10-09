package my.objects;

/**
 * Задача 3.4, 3.5
 * В этот класс перенесены такие, общие для всех фигур методы,
 * как гетер и сетер для цвета, а так же здесь реализован метод
 * для нахождения площади, в классах наследниках его необходимо
 * будет переопределять.
 */
public class Shape {

    protected String color;

    public Shape(){
        this("Default grey");
    }

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Float.POSITIVE_INFINITY;
    }

    @Override
    public String toString() {
        return "Безформенная и безразмерная фигура, цвета: '"+ color +"', и с площадью: "+ getArea() +".";
    }
}
