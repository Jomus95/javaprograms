/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsegment;

/**
 * Демонстрация
 */
public class TestSegment {

    
    public static void main(String[] args) {
        System.out.println("Тестирование класса.\n" +
                "Для начала создаём экземпляр класса.\n" +
                "И сразу же выведем его в консоль, тем самым протестировав метод toString().\n" +
                "Результат:\n");
        Segment segment = new Segment(2,5,10,12);
        System.out.println(segment); //вызывается метод toString
        System.out.println("\n" +
                "Протестируем все set-методы нашего обьекта, изменив с их помощью радиус круга, высоту и его цвет.\n" +
                "Результат:\n");
        segment.setX1Y1(40,50);
        System.out.println(segment);
        System.out.println("Тест всех get-методов в классе Segment: "+"\n\n" +
                "segment.getLengthOfSegment = " + segment.getLengthOfSegment() +",\n" +
                "segment.getVolume() = "+ segment.getX0 ()+".\n" +
                "segment.getX0() = "+ segment.getY0 () +",\n" +
                "segment.getX1() = "+ segment.getX1 () +",\n" +
                "segment.getY1() = "+ segment.getY1 () +",\n" +
                "Все публичные методы в классе Cylinder протестированы.");
    }

}
