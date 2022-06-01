package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String city;
        String pet;

        System.out.println("Band Name Generator (v1.0)\n");

        System.out.print("What city did you grow up in? ");
        try {
            city = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("What is the name of your pet? ");
        try {
            pet = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("Your band name is: " + city + " " + pet);
    }
}