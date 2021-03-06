/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcylinder;

import java.util.Arrays;
/**
 * Задача 3.1, 3.5
 * Класс взят из задачи 2.1, 2.2, и переделан в соответствии с требованиями задач  3.1, 3.5.
 * Класс, теперь наследуется от суперкласса, некоторые общие методы перенесены в суперкласс.
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

    @Override
    public String toString() {
        return "Круг с радиусом: " + radius + ", цвета: '" + color + "', и по площади равен: " + getArea() + ".";
    }    
}
