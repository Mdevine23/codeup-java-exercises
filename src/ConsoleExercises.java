import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is %s %n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an Integer: ");
//        int userInput = scanner.nextInt();

//        System.out.format("You entered: %s", userInput);

//        System.out.print("Enter three random words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.printf("You entered: %s %n %s %n %s", firstWord, secondWord, thirdWord);

//        System.out.print("Enter a quote: ");
//        String myQuote = scanner.nextLine();
//
//        System.out.printf("You entered: %s", myQuote);

        System.out.print("Enter length and width: ");
        String length = scanner.next();
        String width = scanner.next();

        int area = Integer.parseInt(length) * Integer.parseInt(width);
        int perimeter = Integer.parseInt(length) * 2 + Integer.parseInt(width) * 2;

        System.out.printf("The area of the room is: %s %n", area);
        System.out.printf("The perimeter of the room is: %s", perimeter);

    }
}
