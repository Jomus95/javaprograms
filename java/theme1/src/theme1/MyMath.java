package theme1;

import java.util.Arrays;

public class MyMath {

    /**
     * Задача 1.6
     * Рекурсивный метод для возведения в степень.
     */
    public static float pow(float x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n < 0)  return 1 / MyMath.pow(x, -n);
        return x * MyMath.pow(x, --n);
    }



    /**
     * Задача 1.7
     * Рекурсивный метод, для определения минимального значения массива.
     * <p>
     * Для данной задачи, по моему, рекурсия не подходит, но,
     * исключительно для искуственной демонстрации рекурсии,
     * было придумано такое решение:
     */
    public static float getMinValue(float[] array) {
        if (array.length == 1) return array[0];
        if (array.length == 2) return array[0] < array[1] ? array[0] : array[1];
        float result1 = MyMath.getMinValue(Arrays.copyOfRange(array, 0, array.length / 2));
        float result2 = MyMath.getMinValue(Arrays.copyOfRange(array, array.length / 2, array.length - 1));
        return result1 < result2 ? result1 : result2;
    }


    /**
     * Задача 1.7
     * Рекурсивный метод, для определения минимального значения массива.
     * Вторая версия.
     * Метод считатся рекурсивным, если он вызывает сам себя, это единственное
     * условие для того что бы он считался рекурсивным, и оба метода и новый, и
     * старый этому критерию соответствуют.
     */
    public static float getMinValue2(int startFrom, float[] array) {
        if (startFrom + 1 == array.length) return array[startFrom];
        float tempResult = getMinValue2(startFrom + 1, array);
        return array[startFrom] < tempResult ? array[startFrom] : tempResult;
    }


    public static void main(String[] args) {
        System.out.println("Тестирование метода getMinValue2, метод рекурсивно находит " +
                "минимальное значение в массиве, для теста будет создан массив случайного " +
                "размера и с рандомными значениями элементов, после чего он будет передан в " +
                "метод getMinValue2, и с помочью него будет выведено минимальное значение.\n");

        float[] array = new float[10 + (int) (15 * Math.random())];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (-300 + Math.random() * 600);
        }
        System.out.println("Тестовый массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное значение: " + getMinValue2(0, array));
        System.out.println();


        System.out.println("Тестирование метода getMinValue2 завершено.");

    }


}
