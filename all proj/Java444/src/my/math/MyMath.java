package my.math;

import java.util.Arrays;

public class MyMath {

    /**
     * Задача 1.1
     * Метод возвращает случайное число в диапазоне,
     * который задаётся параметрами.
     */
    public static int random(int arg1, int arg2) {
        return (int) (Math.random() * (arg2 - arg1) + arg1);
    }

    /**
     * Задача 1.2
     * Метод возвращает сумму всех элементов масива,
     * в случае если масив пустой - вернётся 0.
     */
    public static float arraySum(float[] array) {
        int sum = 0;
        for (float num : array) {
            sum += num;
        }
        return sum;
    }

    /**
     * Задача 1.3
     * Дополнительный метод для генерации матрицы,
     * генерирует матрицу с рандомными значениями от 0 до 1,
     * и размером, задаваемым параметрами.
     */
    public static float[][] randomMatrix(int width, int height) {
        float[][] matrix = new float[width][height];
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                matrix[w][h] = (float) Math.random();
            }
        }
        return matrix;
    }

    /**
     * Задача 1.3
     * Метод возвращает количество отрицательных элементов в матрице,
     * передаваемой параметром. При пустой матрице вернёт 0.
     */
    public static int matrixNegativeElements(float[][] matrix) {
        int count = 0;
        for (float[] row : matrix) {
            for (float elemetn : row) {
                if (elemetn < 0) count++;
            }
        }
        return count;
    }

    /**
     * Задача 1.4
     * Дополнительный метод для проверки матриц на раввенство размеров.
     * Равность второго измерения проверяется только по первому (нулевому) ряду,
     * что бы не перегружать его лишним функционалом. Таким образом,
     * метод не предусмартивает проверку на правильность матрицы,
     * правильность матрицы остаётся на ответственности пользователя.
     */
    public static boolean isMatrixEqualSize(float[][] matrix1, float[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    /**
     * Задача 1.4
     * Метод складывает две матрицы.
     */
    public static float[][] matrixSum(float[][] matrix1, float[][] matrix2) throws Exception {
        if (!isMatrixEqualSize(matrix1, matrix2)) {
            throw new Exception("Ошибка при сложении матриц. Матрицы разного размера.");
        }
        int width = matrix1.length, height = matrix1[0].length;
        float[][] sum = new float[width][height];
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                sum[w][h] = matrix1[w][h] + matrix2[w][h];
            }
        }
        return sum;
    }

    /**
     * Задача 1.5
     * Рекурсивный метод для возведения в степень.
     */
    public static float pow(float x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n < 0) {
            return 1 / MyMath.pow(x, -n);
        }
        return x * MyMath.pow(x, --n);
    }

    /**
     * Задача 1.6
     * Рекурсивный метод, для определения минимального значения массива.
     *
     * Для данной задачи, по моему, рекурсия не подходит, но,
     * исключительно для искуственной демонстрации рекурсии,
     * было придумано такое решение:
     */
    public static float getMinValue(float[] array) {
        if (array.length == 1) return array[0];
        if (array.length == 2) return array[0] < array[1] ? array[0] : array[1];
        float result1 = MyMath.getMinValue(Arrays.copyOfRange(array, 0, array.length / 2));
        float result2 = MyMath.getMinValue(Arrays.copyOfRange(array, array.length / 2, array.length-1));
        return result1 < result2 ? result1 : result2;
    }
}
