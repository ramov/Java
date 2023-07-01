package Homeworks.Homework1;

import java.util.Scanner;

// ====== Задача 1:
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)

public class task1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println((n * (n + 1)) / 2);

        // или так
        // int sum = 0;
        // for (int i = 1; i <= n; i++) sum += i;
        // System.out.println(sum);
        
        int product = 1;
        for (int i = 1; i <= n; i++) product *= i;
        System.out.println(product);
    }
}
