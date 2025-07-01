package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomLogger {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    public static void log(Object obj) {
        String now = LocalDateTime.now().format(formatter);
        System.out.printf("[%s] [%9s] %s\n", now, Thread.currentThread().getName(), obj);
    }



}
