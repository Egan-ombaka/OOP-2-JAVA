package rectangulararea;

import java.util.Scanner;

public class RectangularArea {
    private int l, w;
    private double r;

    public RectangularArea(int l, int w, double r) {
        this.l = l;
        this.w = w;
        this.r = r;
    }

    public double compute() {
        double areaRectangle = l * w;
        double areaCircle = 3.142 * r * r;

        double output = areaRectangle - areaCircle;
        return output;
    }

    public void displayOutput() {
        double answer = compute();
        System.out.println(String.format("area = %.2f", answer));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int l = scanner.nextInt();

        System.out.print("Enter the width: ");
        int w = scanner.nextInt();

        System.out.print("Enter the radius: ");
        double r = scanner.nextDouble();

        RectangularArea area = new RectangularArea(l, w, r);
        area.displayOutput();

        scanner.close();
    }
}