package tempconverter;

/*
 * @AUTHOR : Egan Ombaka
 * A java programm that converts temperature from Celsius to Fahn and vise versa..
 */

import java.util.Scanner;

public class tempConverter {

    private double c;
    private double f;

    public tempConverter(double c, double f) {
        this.c = c;
        this.f = f;
    }

    // Convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return (c * 9/5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public double toCelsius() {
        return (f - 32) * 5/9;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double c = scanner.nextDouble();

        System.out.print("Enter the temperature in Fahrenheit: ");
        double f = scanner.nextDouble();

        tempConverter converter = new tempConverter(c, f);

        System.out.println("Celsius to Fahrenheit: " + converter.toFahrenheit());
        System.out.println("Fahrenheit to Celsius: " + converter.toCelsius());

        scanner.close();
    }
}
