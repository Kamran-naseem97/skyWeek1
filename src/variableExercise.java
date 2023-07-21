
import java.util.Scanner;
public class variableExercise {
    public static void main(String[] args) {
        /* String firstName = "Kamran";
        String lastName = "Naseem";
        String name = firstName + " " + lastName;
        System.out.printf(name); */

        /* int num1 = 24;
        int num2 = 2;
        int num3 = 8;
        int result = num1 / num2;
        System.out.println(++num3); */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! please enter your first name.");
        String firstName = scanner.nextLine();
        System.out.println("Hi there " + firstName + ", please enter your last name.");
        String lastName = scanner.next();
        System.out.println("Welcome " + firstName + " " + lastName+ ", enter a number and press enter");
        int num1 = scanner.nextInt();
        System.out.println("Please enter another number and press enter");
        int num2 = scanner.nextInt();
        System.out.println("The sum of your numbers is " + (num1 + num2));
    }
}