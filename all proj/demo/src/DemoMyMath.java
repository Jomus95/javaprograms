import my.math.MyMath;

import java.util.Arrays;

/**
 * Демонстрация всех методов в классе MyMath;
 */
/**
 * Существует специальный класс для исключений Trowable. В него входят два класса Exception и Error.
 * Класс Exception используется для обработки исключений вашей программой.
 */
public class DemoMyMath {
    public static void main(String[] args) throws Exception {
        System.out.println("Задача 1.1\n" +
                "Демонстрация метода возвращающего рандомные значения\n" +
                "из диапазона задаваемого параметрами.\n" +
                "Для теста будет выведено 10 значений,\n" +
                "с диапазоном от -100 до 100. Результат:\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(MyMath.random(100, -100) + " ");
        }
        System.out.println("\n\nЗадача 1.2\n" +
                "Демонстрация метода возвращающего сумму значений массива,\n" +
                "для теста создадим массив с рандомными значениями: \n");
        float[] array = new float[10];
        for (int i = 0; i < 10; i++) {
            array[i] = MyMath.random(100, -100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("\nПередадим массив методу arraySum(),\nРезультат: " + MyMath.arraySum(array));
        System.out.println("\nЗадача 1.3\n" +
                "Демонстрация метода генерирующего матрицу," +
                "для теста создадим матрицу с размерами 5х5 и выведем её в консоль: \n");
        float[][] matrix = MyMath.randomMatrix(5, 5);
        for (float[] row : matrix) {                  //как бы, разбиваем её на строки...
            System.out.println(Arrays.toString(row)); // и выводим по строке.
        }
        System.out.println("\nДемонстрация метода, который находит количество отрицательных" +
                "значений в матрице, передадим ранее созданную матрицу методу matrixNegativeElements(). \n" +
                "Результат: " + MyMath.matrixNegativeElements(matrix));
        System.out.println("\nЗадача 1.4\n" +
                "Демонстрация, который меняет местами значения в массиве,\n" +
                "без использования дополнительной переменной." +
                "Для теста создадим массив с двумя значениями:\n"

        );
        int[] smallArray = {6,4};
        System.out.println(Arrays.toString(smallArray));
        System.out.println("\nПередадим его методу flip(), результат: " + Arrays.toString(MyMath.flip(smallArray)));
        
        System.out.println("\nЗадача 1.5\n" +
                "Демонстрация метода складывающего, две матрицы.\n" +
                "для теста возьмём готовую матрицу, созданную ранее,\n" +
                "и создадим ещё одну матрицу для теста с такими же размерами:\n"
        );
        float[][] matrix1 = MyMath.randomMatrix(5, 5);
        for (float[] row : matrix1) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("\nПередадим обе матрицы методу matrixSum(),\nрезультат:\n");
        float[][] matrix2 = MyMath.matrixSum(matrix, matrix1);
        for (float[] row : matrix2) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("\nЗадача 1.6\n" +
                "Демонстрация метода, который рекурсивно возводит число в степень.\n" +
                "Ниже будет выведено условие, и за ним, сразу же результат.\n\n" +
                "2^4 = " + MyMath.pow(2, 4) + "\n" +
                "25^1 = " + MyMath.pow(25, 1) + "\n" +
                "999^0 = " + MyMath.pow(999, 0) + "\n" +
                "2^(-4) = " + MyMath.pow(2, -4)
        );
        System.out.println("\nЗадача 1.7\n" +
                "Демонстрация метода, который рекурсивно находит минимальное число в массиве.\n" +
                "Для теста возьмём ранее созданный массив:\n"
        );
        System.out.println(Arrays.toString(array));
        System.out.println("\nПередадим его методу getMinValue(),\nметод нам вернёт наиманьшее значение в массиве: " + MyMath.getMinValue(array));


    }
}
