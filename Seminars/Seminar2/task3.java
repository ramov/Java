package Seminars.Seminar2;

import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;

public class task3 {
    public static void main(String[] args) {

        Integer n = 10;
        String text = "TEST";
        String file_name = "1.txt";
        File file = new File(file_name);

        try {
            FileWriter writer = new FileWriter(file, false); // true - запись в файл; false - перезапись файла 
            for (int i = 0; i < n; i++) {
                writer.write(text); // writer.write(text + "\n") - перенос на новую строчку
                writer.write("\n");
            }    
            writer.close();
            System.out.println("Получилось!)))");   
             
        } catch (Exception e) {
                System.out.println("Что-то пошло не так");

        }  
        try {
            FileReader f = new FileReader(file);
            char[] a = new char[(int) file.length()]; // char[10] - считать 10 символов 
            f.read(a);
            for (char c : a) {
                System.out.print(c);
            }
            f.close();

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }  
}
