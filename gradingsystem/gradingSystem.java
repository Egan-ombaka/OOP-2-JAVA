package gradingsystem;
/*
 * @AUTHOR Egan Ombaka
 * A student Grading programm using JAVA...
 */
import java.util.Scanner;

public class gradingSystem {
    public static void main (String[] args) {

        //Get the user input 
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your English Score: ");
        int eng = scan.nextInt();

        System.out.print("Enter your Mathematics Score: ");
        int math = scan.nextInt();

        System.out.print("Enter your Physics Score: ");
        int phyc = scan.nextInt();

        scan.close();
        
        // calculating the average score
        double average = ((eng + math + phyc)/3);
        System.out.println(String.format("Your average score is : %.2f", average));

        //using the conditional statements to if...else to determine the grade using the average
        if(average >= 70 && average <= 100) {
            System.out.println("Your Mean Grade is : A ");
        } else if (average >= 60 && average <= 69){
            System.out.println("Your Mean Grade is : B ");
        } else if (average >= 50 && average <= 59) {
            System.out.println("Your Mean Grade is : C");
        } else if (average >= 40 && average <= 49) {
            System.out.println("Your Mean Grade is : D ");
        } else {
            System.out.println("Your Mean Grade is : F");
        }
    }
}
