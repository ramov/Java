package Homeworks.Homework2;

// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение)

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        sc.close();
        
        System.out.println(palindrom(text));


    }

    public static boolean palindrom(String text) {
        text = text.replaceAll("\\W","");
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();

        return text.equalsIgnoreCase(invertedText);

    }
}
