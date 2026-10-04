package org.example;

public class Main {
    static void main() {
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 10; i++) { // Intentional bug: skips 5
            IO.println("i = " + i);
        }
    }
}