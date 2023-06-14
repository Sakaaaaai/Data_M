import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int totalValue = die1 + die2;

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + totalValue);

        if (totalValue > 7) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost.");
        }
    }
}
