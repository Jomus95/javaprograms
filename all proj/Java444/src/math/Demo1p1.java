import my.math.MyMath;

import java.util.Arrays;

/**
 * Задача 1.1
 * Демонстрация метода возвращающего рандомное число из диапазона,
 * путём создания массива и его вывода, как указано в задании.
 */
public class Demo1p1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) MyMath.random(1, 100);
        }
        System.out.println(Arrays.toString(array));
    }
}
