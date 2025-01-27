package cylindervolume;
/*
 * A Java programm that calculates the volume of cylinder with user provided data.
 * @AUTHOR - Egan Ombaka
 */
import java.util.Scanner;

public class cylinderVolume {

    private double h;
    private double r;

    public cylinderVolume(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public double compute() {
        double output = 3.142 *r *r *h;
        return output;
    }

    public void displayOutput() {
        double answer = compute();
        System.out.println(String.format("Area = %.2f", answer));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the Radius of the cylinder : ");
        double r = scanner.nextDouble();

        System.out.print(" Enter the the height of the cylinder : ");
        double h = scanner.nextDouble();

        cylinderVolume area = new cylinderVolume(h, r);
        area.displayOutput();

        scanner.close();
    }
}