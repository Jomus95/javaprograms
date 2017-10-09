package theme4;

public class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.x = x;
        this.y = y;
    }

    public MovablePoint(int x, int y, int speed) {
        this(x,y,speed,speed);
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "Координаты: x " + x + "; y " + y + ";";
    }




    //тестирование класса
    public static void main(String[] args) {
        System.out.println("Создадим обьект класса MovablePoint, с параметрами " +
                "х = 0, y = 0, xSpeed = 10, ySpeed = 10. " +
                "И выведем в консоль координаты точки, с помощью метода toString().\n");
        MovablePoint movablePoint = new MovablePoint(0,0,10,10);
        System.out.println(movablePoint.toString());
        System.out.println();
        System.out.println("Воспользуемся методами для перемещения нашего обьекта, переместим на 1 шаг " +
                "влево и вниз. И опять выведем координаты точки с помощью метода toString().\n");
        movablePoint.moveLeft();
        movablePoint.moveDown();
        System.out.println(movablePoint.toString());
        System.out.println();
        System.out.println("Снова воспользуемся методами для перемещения обьекта, переместим его на 2 шага " +
                "вправо и вверх. Координаты точки выведем в консоль с помощью метода toString().\n");
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveUp();
        movablePoint.moveUp();
        System.out.println(movablePoint.toString());
        System.out.println();
        System.out.println("Все методы для перемещения протестированы.");

    }
}
