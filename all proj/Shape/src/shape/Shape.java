/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 * Задача 3.4, 3.5
 * В этот класс перенесены такие, общие для всех фигур методы,
 * как гетер и сетер для цвета, а так же здесь реализован метод
 * для нахождения площади, в классах наследниках его необходимо
 * будет переопределять.
 */
public class Shape {

    protected Boolean filled;
    protected String color;
    

    public Shape(){
        this(true,"Default grey");
    }

    public Shape(Boolean filled, String color ){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Boolean isFilled() {
        return filled;
        
    }
        
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    
     public double getArea(){
        return Float.POSITIVE_INFINITY;
    }


    @Override
    public String toString() {
        return "Цвет: '"+ color +"' " + (!filled ? "не " : "") + " заполнен.";
    }

    
    
    public static void main(String[] args) {
        
        System.out.println("Тестирование класса.\n" +
                "Для начала создаём экземпляр класса.\n" +
                "И сразу же выведем его в консоль, тем самым протестировав метод toString().\n" +
                "Результат:\n");
        Shape shape = new Shape();
        System.out.println(shape.toString()); //вызывается метод toString
        System.out.println("\n" +
                "Протестируем все set-методы.\n" +
                "Результат:\n");
        shape.setColor("black");
        shape.setFilled(false);
        System.out.println(shape);
        System.out.println("Тест всех get-методов в классе shape: "+"\n\n" +
                "cylinder.getBaseArea() = " + shape.isFilled() +",\n" +
                "cylinder.getVolume() = "+ shape.getColor()+".\n" +
                "Все публичные методы в классе shape протестированы.");
        
        
        
         System.out.println("\n\n\n\n Тестирование класса Rectangle.\n" +
                "Для начала создаём экземпляр класса.\n" +
                "И сразу же выведем его в консоль, тем самым протестировав метод toString().\n" +
                "Результат:\n");
        Rectangle rectangle = new Rectangle(1,2,"blue");
        System.out.println(rectangle.toString()); //вызывается метод toString
        System.out.println("\n" +
                "Протестируем все set-методы.\n" +
                "Результат:\n");
        rectangle.setWidth(6);
        rectangle.setHeight(4);
        rectangle.setFilled(false);
        System.out.println(rectangle);
        System.out.println("Тест всех get-методов в классе rectangle: "+"\n\n" +
                "rectangle.getArea() = " + rectangle.getArea() +",\n" +
                "rectangle.getHeight() = "+ rectangle.getHeight()+".\n" +
                "rectangle.getWidth() = "+ rectangle.getWidth()+".\n" +
                "Все публичные методы в классе rectangle протестированы.");
        
        
        
        System.out.println("\n\n\n\n Тестирование класса Triangle.\n" +
                "Для начала создаём экземпляр класса.\n" +
                "И сразу же выведем его в консоль, тем самым протестировав метод toString().\n" +
                "Результат:\n");
        Triangle triangle = new Triangle(6,3,3,"red");
        System.out.println(triangle.toString()); //вызывается метод toString
        System.out.println("\n" +
                "Протестируем все set-методы.\n" +
                "Результат:\n");
        triangle.setColor("Yellow");
        triangle.setFilled(false);
        System.out.println(triangle);
        System.out.println("Тест всех get-методов в классе Triangle: "+"\n\n" +
                "triangle.getArea() = " + triangle.getArea() +",\n" +
                "triangle.getHeight() = "+ triangle.getColor()+".\n" +
                "triangle.getWidth() = "+ triangle.getPerimeter()+".\n" +
                "Все публичные методы в классе Triangle протестированы.");
        
        
        
        
        System.out.println("\n\n\n\n Тестирование класса Square.\n" +
                "Для начала создаём экземпляр класса.\n" +
                "И сразу же выведем его в консоль, тем самым протестировав метод toString().\n" +
                "Результат:\n");
        Square square = new Square(2,"blue");
        System.out.println(square.toString()); //вызывается метод toString
        System.out.println("\n" +
                "Протестируем все set-методы.\n" +
                "Результат:\n");
        square.setWidth(8);
        square.setHeight(9);
        square.setFilled(false);
        System.out.println(square);
        System.out.println("Тест всех get-методов в классе rectangle: "+"\n\n" +
                "square.getArea() = " + square.getArea() +",\n" +
                "square.getHeight() = "+ square.getHeight()+".\n" +
                "square.getWidth() = "+ square.getWidth()+".\n" +
                "Все публичные методы в классе rectangle протестированы.");
    }
    
}
