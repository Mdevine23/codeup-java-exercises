import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        long i = 2;
//
//         do {
//             System.out.println("i is " + i);
//             i *= i;
//         } while (i < 1000000);

//        for (int i = 1; i <= 15; i++) {
//            System.out.println("i is: " + i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println("i is: " + i);
//        }

//        for (long i = 1; i <= 100; i++) {
//            if ((i % 3) == 0 && (i % 5) == 0){
//                System.out.println("FizzBuzz " + i);
//            } else if ((i % 5) == 0) {
//                System.out.println("Buzz " + i);
//            } else if ((i % 3) == 0) {
//                System.out.println("Fizz " + i);
//            } else {
//                System.out.println(i);
//            }
//        }
//        do {
//
//            System.out.println("What number would you like to go up to? ");
//            long userNum = sc.nextInt();
//
//            String verticalLine = "|";
//            String horizontalLine = "-";
//
//            System.out.println("number" + verticalLine + "squared" + verticalLine + "cubed");
//            System.out.println(horizontalLine.repeat(20));
//
//
//            for (int i = 0; i < userNum; ++i) {
//                if (i == userNum + 1) {
//                    break;
//                }
//                System.out.printf("%3d   " + verticalLine + "%3d   " + verticalLine + "%3d   \n", i, (i * i), (i * i * i));
//            }
//            System.out.println("Would you like to continue? y/n");
//            String userContinue = sc.next();
//            if (userContinue.equalsIgnoreCase("n")) {
//                break;
//            }
//        } while (true);

        System.out.println("Please enter a numerical grade from 0 to 100: ");
        int userGrade = sc.nextInt();

        if (userGrade >= 88) {
            System.out.println("A");
        } else if (userGrade >= 80) {
            System.out.println("B");
        } else if (userGrade >= 67) {
            System.out.println("C");
        } else if (userGrade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println("Would you like to continue? y/n");
        String userContinue = sc.next();
        if (userContinue.equalsIgnoreCase("n")) {
            System.out.println("Goodbye, and have a wonderful day!");
        } else {
            System.out.println("Please enter a numerical grade from 0 to 100: ");
            userGrade = sc.nextInt();

            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }



    }
}
