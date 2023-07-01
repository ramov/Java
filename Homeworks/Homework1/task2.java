package Homeworks.Homework1;

import java.util.prefs.BackingStoreException;

// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 & j != i) break;
                else if (i % j == 0 & j == i) System.out.println(i);
            }
        }
    }
}
