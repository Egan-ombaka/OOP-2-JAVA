package abcltd;
/*
 * @AUTHOR Egan Ombaka
 * A java program that calculates the salary of an employee ...
 * Quiz 4 in quizes folder.
 */

import java.util.Scanner;

public class abcLtd {
    private double hours;
    private static final double RATE = 20.00;
    private static final int LUNCH = 200;

    public abcLtd(double hours) {
        this.hours = hours;
    }

    public double basicSalary1() {
        double basicSalary = hours * RATE;
        return basicSalary;
    }

    public double grossSalary1(){
        double grossSalary = basicSalary1() * LUNCH;
        return grossSalary;
    }

    public double taxedIncome(){
        double tax =((30/100) * grossSalary1());
        return tax;
    }
    
    public double netPay(){
        double totalPay = grossSalary1() -taxedIncome();
        return totalPay;
    }

    public void displayOutput(){
        double answer = netPay();
        System.out.println(String.format("Your salary is : %.2f", answer));
    }
    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of hours : ");

        double hours = scanner.nextDouble();

        abcLtd payment = new abcLtd(hours);
        payment.displayOutput();

        scanner.close();
    }
}
