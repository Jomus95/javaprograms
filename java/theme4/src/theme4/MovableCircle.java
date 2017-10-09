package theme4;

public class MovableCircle implements Movable {

    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public MovableCircle(int x, int y, int speed, int radius){
        this(x,y,speed,speed,radius);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }


    @Override
    public String toString() {
        return center.toString();
    }


    //тестирование класса
    public static void main(String[] args) {
        System.out.println("Создадим обьект класса MovableCircle, с параметрами " +
                "х = 0, y = 0, xSpeed = 10, ySpeed = 10, radius = 50. " +
                "И выведем в консоль координаты центра, с помощью метода toString().\n");
        MovableCircle movableCircle = new MovableCircle(0,0,10,10, 50);
        System.out.println(movableCircle.toString());
        System.out.println();
        System.out.println("Воспользуемся методами для перемещения нашего обьекта, переместим на 1 шаг " +
                "влево и вниз. И опять выведем координаты центра с помощью метода toString().\n");
        movableCircle.moveLeft();
        movableCircle.moveDown();
        System.out.println(movableCircle.toString());
        System.out.println();
        System.out.println("Снова воспользуемся методами для перемещения обьекта, переместим его на 2 шага " +
                "вправо и вверх. Координаты центра выведем в консоль с помощью метода toString().\n");
        movableCircle.moveRight();
        movableCircle.moveRight();
        movableCircle.moveUp();
        movableCircle.moveUp();
        System.out.println(movableCircle.toString());
        System.out.println();
        System.out.println("Все методы для перемещения протестированы.");

    }
}
