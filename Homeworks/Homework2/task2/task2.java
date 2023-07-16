package Homeworks.Homework2.task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// ======= Задача 2: 
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task2 {
    public static void main(String[] args) {

        String text = "";
        String file_name = "InputData.txt";
        File file = new File(file_name);

        // try {
        //     FileWriter writer = new FileWriter(file, false); // true - запись в файл; false - перезапись файла 
        //     for (int i = 0; i < n; i++) {
        //         writer.write(text); // writer.write(text + "\n") - перенос на новую строчку
        //         writer.write("\n");
        //     }    
        //     writer.close();
        //     System.out.println("Получилось!)))");   
             
        // } catch (Exception e) {
        //     System.out.println("Что-то пошло не так");

        // }  

        try {
            FileReader f = new FileReader(file);
            char[] a = new char[(int) file.length()];
            f.read(a);
            for (char c : a) {
                text += c;
            }
            f.close();
            result(text);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }  
   
    static void result(String text) {
        text = text.replaceAll("\"", "");
        text = text.replaceAll(":", " ");
        text = text.replaceAll(",", " ");
        text = text.replaceAll("фамилия", "Студент");
        text = text.replaceAll("оценка", "получил");
        text = text.replaceAll("предмет", "по предмету");
        System.out.print(text);          
    }
}
