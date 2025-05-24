import java.util.Scanner;

public class Number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1, max = 100;
        int target = (int)(Math.random() * (max - min + 1)) + min;
        int attempts = 0;

        System.out.println("Guess the number between " + min + " and " + max);

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        }
        sc.close();
    }
}





