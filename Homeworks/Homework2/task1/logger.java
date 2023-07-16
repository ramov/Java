package Homeworks.Homework2.task1;

import java.io.File;
import java.io.FileWriter;

public class logger {
        
    public static void log(int[] arr) {
    
        String file_name = "logger.txt";
        File file = new File(file_name);

        try {
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < arr.length; i++) {
                writer.write(arr[i] + " ");
            }

            writer.write("\n");
            writer.close();

            System.out.println("Получилось!");

        } catch (Exception e) {
            System.out.println("Что-то не так!");
            
        }     

    }
    
}
