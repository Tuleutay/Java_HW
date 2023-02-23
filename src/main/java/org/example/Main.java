package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        String carInfoJson= new String(Files.readAllBytes(Paths.get("C:\\Users\\tooly\\Desktop\\GB\\Java\\TTTT\\src\\main\\java\\org\\example\\filename.txt")));
        Gson gson = new Gson();
        CarInfo[] carInfoArray = gson.fromJson(carInfoJson, CarInfo[].class);
        System.out.println("Hello world");
    }


}