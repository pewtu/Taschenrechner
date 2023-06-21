package de.ezeise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Taschenrechner!");
        System.out.println("Geben Sie die erste Zahl ein:");
        double zahl1 = scanner.nextDouble();

        System.out.println("Geben Sie die zweite Zahl ein:");
        double zahl2 = scanner.nextDouble();

        System.out.println("Geben Sie die gewünschte Operation ein (+, -, *, /):");
        String operator = scanner.next();

        double ergebnis = 0;

        switch (operator) {
            case "+":
                ergebnis = zahl1 + zahl2;
                break;
            case "-":
                ergebnis = zahl1 - zahl2;
                break;
            case "*":
                ergebnis = zahl1 * zahl2;
                break;
            case "/":
                ergebnis = zahl1 / zahl2;
                break;
            default:
                System.out.println("Ungültiger Operator!");
                return;
        }

        System.out.println("Das Ergebnis ist: " + ergebnis);

        scanner.close();
    }
}