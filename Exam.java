// дан массив int [] array = {3, 10, 2, -1};
// 1) найти минимальное,
//   б) максимальное зачение
// 2) посчитать сумму всех элементов массива
// 3) посчитать произведение всех элементов массива
// 4) написать алгоритм который будет делать инверсию массива


import java.util.Arrays;

public class Exam {
    public static void main(String[] args) {
        int number = 5;


        int [] array = {3, 10, 2, -1};

//        int result = 0;
//
//        for (int index = array.length - 1; index >= 0; index--) {
//            result += array[index];
//        }
//        System.out.println("sum = " + result);
        System.out.println(Arrays.toString(array));

        for (int leftIndex = 0, rightIndex = array.length - 1;
             leftIndex < array.length/2;leftIndex++, rightIndex-- ) {

            int tmp = array[rightIndex];
            array[rightIndex] = array[leftIndex];
            array[leftIndex] = tmp;
        }
        System.out.println(Arrays.toString(array));


    }
}
