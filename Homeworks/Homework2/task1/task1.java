package Homeworks.Homework2.task1;

// ======== Задача 1:
// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
// результат после каждой итерации запишите в лог-файл

public class task1 {
    public static void main(String[] args) {

        int[] arr = { 4, 22, 5, 412, 745, 3, 1, 7 };
        logger.log(arr);
        int count = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count--;

            logger.log(arr);
        }

    }

}
