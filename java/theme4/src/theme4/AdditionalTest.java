package theme4;

public class AdditionalTest {

    /**
     * Дополнительная программа для тестирования
     * созданных классов.
     */
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5,6,10);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(5,6,2,20);
        System.out.println(m2);
        m1.moveRight();
        System.out.println(m2);
    }
}
