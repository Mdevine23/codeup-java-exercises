package utils;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter a string: ");
        System.out.println(input.getString());
        System.out.println("Enter yes or no: ");
        System.out.println(input.yesNo());
        System.out.println("Enter a number between 1 and 10: ");
        System.out.println(input.getInt(1, 10));
        System.out.println("Enter a number between 1 and 10: ");
        System.out.println(input.getDouble(1, 10));
    }
    public String getString() {
        return scanner.nextLine();
    }
    public boolean yesNo() {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max) {
        int num = getInt();
        if (num < min || num > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min, max);
        }
        return num;
    }
    public int getInt() {
        String input = getString();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, try again.");
            return getInt();
        }
    }
    public double getDouble(double min, double max) {
        double num = getDouble();
        if (num < min || num > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getDouble(min, max);
        }
        return num;
    }
    public double getDouble() {
        String input = getString();
        try {
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, try again.");
            return getDouble();
        }
    }

    private String Scanner;
    java.util.Scanner scanner = new Scanner(System.in);
}


