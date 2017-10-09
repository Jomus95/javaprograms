/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcylinder;

import java.util.Arrays;
/**
 * Демонстрация работы всех методов
 */
public class TestCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Тестирование класса Cylinder.\n" +
                "Для начала создаём экземпляр класса.\n" +
                "И сразу же выведем его в консоль, тем самым протестировав метод toString().\n" +
                "Результат:\n");
        Cylinder cylinder = new Cylinder(2,3,"red");
        System.out.println(cylinder.toString()); //вызывается метод toString
        System.out.println("\n" +
                "Протестируем все set-методы нашего обьекта.\n" +
                "Результат:\n");
        cylinder.setHeight(3);
        System.out.println(cylinder);
        System.out.println("Тест всех get-методов в классе circle: "+"\n\n" +
                "cylinder.getBaseArea() = " + cylinder.getBaseArea() +",\n" +
                "cylinder.getVolume() = "+ cylinder.getVolume()+".\n" +
                "cylinder.getHeight() = "+ cylinder.getHeight() +",\n" +
                "Все публичные методы в классе Cylinder протестированы.");
        
        
        System.out.println("\n\n\n Тестирование класса Circle." +
                "Результат:\n");
        Circle circle = new Circle(2,"red");
        
        System.out.println(circle.toString()); //вызывается метод toString
       System.out.println("\n" +
                "Протестируем все set-методы нашего обьекта.\n" +
                "Результат:\n");
        circle.setRadius(3.5);
        System.out.println(circle);
        System.out.println("Тест всех get-методов в классе circle: " +
                "circle.getRadius() = " + circle.getRadius() +",\n" +
                "circle.getArea() = "+ circle.getArea() +",\n" +
                "Все публичные методы в классе Сircle протестированы.");
    }
    
}
