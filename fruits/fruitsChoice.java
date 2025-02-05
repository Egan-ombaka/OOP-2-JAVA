package fruits;
/*
 * @Author Eganh Ombaka
 * a java programm using conditional statements if ... else 
 */
import java.util.Scanner;

public class fruitsChoice {
    public static void main(String[] args) {

        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (O, A or B or any other) according to your fruit choice : ");
        char fruitsChoice = scanner.next().charAt(0);

        scanner.close();

        //convert the user input to lowercase
        fruitsChoice = Character.toLowerCase(fruitsChoice);

        //using the is...else statements to determine the massage based on the user input.
        if (fruitsChoice == 'o') {
            System.out.println("I Love Oranges");
        } else if (fruitsChoice == 'a') {
            System.out.println("My Best Fruit is apple.");
        } else if (fruitsChoice == 'b') {
            System.out.println("Bananas are sweet");
        } else {
            System.out.println("I don't know your taste.");
        }
    }
}