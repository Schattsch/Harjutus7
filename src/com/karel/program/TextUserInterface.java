package com.karel.program;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("  quit - quit the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();

            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}
