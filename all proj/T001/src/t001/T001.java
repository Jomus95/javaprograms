/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t001;
import static java.lang.System.out;
// Для работы с массивами
import java.util.Arrays;
/**
 *
 * @author Jomus
 */
public class T001 {

    public static void main(String[] args) {
String[] massive1 = {"Татьяна", "Сергей", 
"Александр", "Павлик"};
// Сортировка массива
Arrays.sort(massive1);
// Копируем элементы массива в другой массив
String[] massive2= Arrays.copyOf(massive1, 4);
// Копируем нужные элементы в диапазоне
String[] massive3= Arrays.copyOfRange(massive1, 
1, massive1.length-1);
 /* Перебор элементов массива, не лучший способ,
* Вообще, никогда не используйте .length 
внутри цикла,
* т.к. тогда он будет на каждой итерации 
вызывать метод подсчета длины. 
*/
for(int i=0; i<massive1.length;i++){
out.printf("%s ", massive1[i]);
}
out.println();
// Правильный вывод элементов массива по быстродействию
for(String s : massive2){
out.printf("%s ", s);
}
out.println();
for(String s1 : massive3){
out.printf("%s ", s1);
}
}
}