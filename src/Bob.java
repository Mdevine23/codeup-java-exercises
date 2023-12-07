import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String sure ="Sure.";
        String whoa = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String whatever = "Whatever.";

        Scanner sc = new Scanner(System.in);
        System.out.println("Say something to Bob: ");
        String userInput = sc.nextLine();

if (userInput.endsWith("?")) {
            System.out.println(sure);
        } else if (userInput.endsWith("!")) {
            System.out.println(whoa);
        } else if (userInput.isEmpty()) {
            System.out.println(fine);
        } else {
            System.out.println(whatever);
        }
    }
}
