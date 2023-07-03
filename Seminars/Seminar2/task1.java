package Seminars.Seminar2;

import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

// Ввод: 6 a b
// Вывод: ababab

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "cp866");

        System.out.print("Введите четное число: ");
        int n = sc.nextInt();

        System.out.print("Введите первый символ: ");
        char c1 = sc.next().charAt(0);

        System.out.print("Введите второй символ: ");
        char c2 = sc.next().charAt(0);

        symbol(n, c1, c2);
        
        sc.close();
    }

    public static void symbol(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < n/2; i++) {
            sb.append(c1).append(c2);
        }
        System.out.println(sb);
    }
}
