/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rect;

/**
 *
 * @author Jomus
 */
public class Rect {

   protected double width, height;
    protected String color;

    public Rect() {
        this(1);
    }

    public Rectangle(double edge){
        width = height = edge;
    }

    public Rect(double width, double height) {
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
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
