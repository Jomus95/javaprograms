package my.objects;

/**
 * Задача 3.1
 * Написан класс, который соответствует всем требованиям в задаче,
 * по условиям задачи 3.2, метод возвращающий площадь - переопределён,
 * и теперь возвращает площадь всей поверхности.
 */
public class Cylinder extends Circle {

    protected double height;

    public Cylinder() {
        this(2,3);
    }

    public Cylinder(double radius, double height) {
        this(radius,height,"Default black");
    }

    public Cylinder(double radius, double height, String color) {
        this.color = color;
        this.height = height;
    }

    /**
     * Задача 3.2
     * Переопределённвй метод возвращает площадь всей поверхности цилиндра.
     */
    @Override
    public double getArea() {
        return getBaseArea()*2 + radius*2*Math.PI*height;
    }

    /**
     * Метод возвращает площадь основания цилиндра.
     */
    public double getBaseArea(){
        return super.getArea();
    }

    /**
     * Метод возвращает обьём цилиндра.
     */
    public double getVolume(){
        return getBaseArea()*height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Цилиндр с радиусом: " + radius + " и высотой: " + height + ", цвета: '" + color + "', с площадью поверхности: " + getArea() + " и обьёмом: " + getVolume() + ".";
    }
}
