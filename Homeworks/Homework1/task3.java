package Homeworks.Homework1;

import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)

public class task3 {
    public static void main(String[] args) {
        
        //// Не понимаю, почему в таком коде программа проскакивает строчку с
        //// арифметическим знаком и сразу просит второе число?!
        //// Пришлось использовать Integer.parseInt()

        // Scanner sc = new Scanner(System.in, "cp866");    

        // System.out.print("Введите первое число: ");
        // int a = sc.nextInt();

        // System.out.print("Введите знак арифметического действия: ");  
        // String sign = sc.nextLine();  

        // System.out.print("Введите второе число: ");
        // int b = sc.nextInt();

        // sc.close();

        Scanner sc = new Scanner(System.in, "cp866");

        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Введите знак арифметического действия: ");
        String sign = sc.nextLine();

        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(sc.nextLine());

        sc.close();

        //// Не понимаю почему if не видет в sign знак +, когда я указываю именно его

        // int result = 0;
        // if (sign == "+") result += a + b;
        // else result = -1; 
        // System.out.println(result);

        System.out.print(a + " " + sign + " " + b + " = ");

        switch (sign) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Некорректное действие!");
        }        

    }
}
