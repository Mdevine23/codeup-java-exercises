import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an Integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.printf("You entered: %s", userInput);

//        System.out.print("Enter three random words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.printf("You entered: %n%s %n%s %n%s", firstWord, secondWord, thirdWord);

//        System.out.print("Enter a quote: ");
//        String myQuote = scanner.nextLine();
//
//        System.out.printf("You entered: %s", myQuote);

        System.out.println("Enter length and width: ");
        String length = scanner.next();
        String width = scanner.next();

        float area = Float.parseFloat(length) * Float.parseFloat(width);
        float perimeter = Float.parseFloat(length) * 2 + Float.parseFloat(width) * 2;

        System.out.printf("The area of the room is: %.2f %n", area);
        System.out.printf("The perimeter of the room is: %.2f", perimeter);
    }
}
