package service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {


    public static String[] read(String url) throws Exception {
        return Files.readAllLines(Path.of(url)).toArray(new String[0]);
    }

    public static void write(String url, String text) throws Exception {
        Files.write(Path.of(url), text.getBytes());
    }

    public static void writeStandardOpenOption(String url, String text) throws Exception {
        Files.write(Path.of(url), text.getBytes(), StandardOpenOption.APPEND);
    }


//    public static String[] read(String url) throws Exception {
//        return Files.readAllLines(Path.of(url)).toArray(new String[0]);
//    }
//
//    public static void write(String url, String text) throws Exception {
//        Files.write(Path.of(url), text.getBytes());
//    }

}