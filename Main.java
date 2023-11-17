import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your score ");
        int score = Integer.parseInt(scanner.nextLine());

        System.out.println("My score is "+ score);

        if (score < 3){
            System.out.println("Failed");
        } else if ( score > 3 && score <= 5) {
            System.out.println("Insufficient");
        } else if (score > 5 && score <= 8) {
            System.out.println("Good");
        } else if (score >= 9 && score <= 10) {
            System.out.println("Excellent");
        } else {
            System.out.println("Out of range");
        }

        System.out.println("Please enter your weight in kg ");
        float weight = Integer.parseInt(scanner.nextLine());

        System.out.println("My weight is "+ weight+"kg");

        System.out.println("Please enter your height in cm: ");
        float height = Integer.parseInt(scanner.nextLine());

        System.out.println("My height is "+ height+"cm");

        System.out.println("The ratio is "+(weight/height));
/*
        System.out.println("Please enter your score: ");
        int scores = Integer.parseInt(scanner.nextLine());
        int grade;
        grade = scores;
        switch (grade) {
            case 1:
                System.out.println("Insufficient");
                break;
            case 2:
                System.out.println("pass");
                break;
            case 3:
                System.out.println("fail");
                break;
        }*/
    }
}