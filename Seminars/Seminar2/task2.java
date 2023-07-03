package Seminars.Seminar2;

// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// результат - a4b3cd2

public class task2 {
    public static void main(String[] args) {
        String msg = "qqqqqqqqwwwwwwwwweeeeeeeeerrrrrrrrr";
        rle(msg);
    }

    public static void rle(String msg) {
        StringBuilder algor = new StringBuilder();
        int count = 1;
        for (int i = 1; i < msg.length(); i++) {
            if (msg.charAt(i) == msg.charAt(i-1)) {
                count++;    
            } else {
                algor.append(msg.charAt(i-1)).append(count);
                count = 1;
            }     
        }
        algor.append(msg.charAt(msg.length()-1)).append(count);
        System.out.println(algor.toString());
        
    }
    
}
