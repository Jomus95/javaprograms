package my.objects;


/**
 * Задание 2.3
 * Треугольник. Который задаётся координатами углов.
 * Из дополнительных методов - периметр, площадь, длины ребер.
 */
public class Triangle {

    private int[] coords;
    private String color;

    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        this(x1, x2, x3, y1, y2, y3, "Default orange");
    }

    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3, String color) {
        coords = new int[]{x1, y1, x2, y2, x3, y3};
        this.color = color;
    }

    /**
     * Длинна одной грани, зависит от параметра, парамерт может быть 1-3, при неправильном параметре вернёт -1.
     */
    public float getEdgeSize(int edgeId) {
        if (edgeId < 1 || edgeId > 3) {
            return -1;
        }
        return (float) Math.sqrt(Math.pow(coords[edgeId * 2 - 2], 2) + Math.pow(coords[edgeId * 2 - 1], 2));
    }

    /**
     * Длинна всех граней в виде массива.
     */
    public float[] getEdgeSizes() {
        return new float[]{getEdgeSize(1), getEdgeSize(2), getEdgeSize(3)};
    }

    /**
     * Периметр.
     */
    public float getPerimeter() {
        return getEdgeSize(1) + getEdgeSize(2) + getEdgeSize(3);
    }

    /**
     * Площадь.
     */
    public float getArea() {
        return (float) Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - getEdgeSize(1)) * (getPerimeter() / 2 - getEdgeSize(2)) * (getPerimeter() / 2 - getEdgeSize(3)));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Треугольник, с координатами углов: [" + coords[0] + "|" + coords[1] + "] " + "[" + coords[2] + "|" + coords[3] + "] " + "[" + coords[4] + "|" + coords[5] + "], цвета: " + color + ", и площадью " + getArea() + ".";
    }
}
