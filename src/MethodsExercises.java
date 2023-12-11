import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
    long num1;
    long num2;
        System.out.println(addition(6,2));
        System.out.println(subtraction(6,2));
        System.out.println(multiplication(6,2));
        System.out.println(division(6,2));
        System.out.println(modulus(6,2));
        System.out.println(range());

    }
    public static long addition(long num1, long num2) {
        long result = num1 + num2;
        return result;
    }
    public static long subtraction(long num1, long num2) {
        long result = num1 - num2;
        return result;
    }
    public static long multiplication(long num1, long num2) {
        long result = num1 * num2;
        return result;
    }
    public static long division(long num1, long num2) {
        long result = num1 / num2;
        return result;
    }
    public static long modulus(long num1, long num2) {
        long result = num1 % num2;
        return result;
    }
    public static String range() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10: ");
            int userInput = sc.nextInt();
            if (userInput >= 1 && userInput <= 10) {
                return "Your number is within the range.";
            } else {
                return "Your number is not within the range.";
            }
        }
        

}
