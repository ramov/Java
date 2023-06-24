package Seminars.Seminar1;

import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.print.StreamPrintServiceFactory;

// public class Seminar1 {
//     public static void main(String[] args) {
//         System.out.println("What is you name?");
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         sc.close();
//         System.out.println(name);
//     }
// } 

// ======= Задача 1:
// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

// public class Seminar1 {
//     public static void main(String[] args) {
        
//         int[] array = new int[] {1,1,0,1,1,1,0,0,1,1,1,1,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0};
//         int count = 0;
//         int max = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == 1) count++;             
//             else if (max < count) {
//                 max = count;
//             } else count = 0;
//         }
//         System.out.println(max);
//     }
// }

// ===== Задание 2: 
// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

// public class Seminar1 {
//     public static void main(String[] args) {
        
//         int[] nums = new int[] {3,4,8,1,3,6,32,6,5,0,5,3,2,2,2,3};
//         int[] array = new int[nums.length];
//         int val = 3;
//         int index_min = 0;
//         int index_max = array.length - 1;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == val) {
//                 array[index_max] = nums[i];
//                 index_max--;
//             } else {
//                 array[index_min] = nums[i];
//                 index_min++;
//             }
//         }

//         System.out.println(Arrays.toString(array));
        // for (int i = 0; i < array.length; i++) 
        //     System.out.print(array[i] + " ");  //Вывод значений массива.
//     } 
// }

public class Seminar1 {

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Input text: ");
        String text = sc.nextLine();
        sc.close();
        
        System.out.println(text);

        String[] array = text.split(" ");
        
        for (int i = 0; i < array.length/2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        
        System.out.println(Arrays.toString(array));
    }
}