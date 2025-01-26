package rectangulararea;

import java.util.Scanner;

public class RectangularArea {
    int l, w;
    double r;

    public RectangularArea(int l, int w, double r) {
        this.l = l;
        this.w = w;
        this.r = r;
    }

    public double computeAreaRectangle() {
        return l * w;
    }

    public double computeAreaCircle() {
        return 3.142 * r * r;
    }

    public double computeDifference() {
        return computeAreaRectangle() - computeAreaCircle();
    }

    public void displayOutput() {
        double output = computeDifference();
        System.out.printf("Area = %.2f%n", output);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        int l = scanner.nextInt();

        System.out.print("Enter width of the rectangle: ");
        int w = scanner.nextInt();

        System.out.print("Enter radius of the circle: ");
        double r = scanner.nextDouble();

        RectangularArea answer = new RectangularArea(l, w, r);
        answer.displayOutput();

        scanner.close();
    }
}