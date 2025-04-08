package ApplicationDevelopment;

import java.util.Scanner;

public class Game {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nGame Starts\n");

        String responseA = playerA();
        String responseB = playerB();

        System.out.println("Player A: " + responseA);
        System.out.println("Player B: " + responseB);

        checkWinner(responseA, responseB);
    }

    public static String playerA() {
        System.out.println("1. STONE  2. PAPER  3. SCISSOR\n");
        System.out.println("Player A, enter your option: ");

        int opt = sc.nextInt();
        return checkOption(opt);
    }

    public static String playerB() {
        int opt;
        while (true) {
            opt = (int) (Math.random() * 10);
            if (opt >= 1 && opt <= 3) {
                return checkOption(opt);
            }
        }
    }

    public static String checkOption(int opt) {
        switch (opt) {
            case 1:
                return "STONE";
            case 2:
                return "PAPER";
            case 3:
                return "SCISSOR";
            default:
                System.out.println("Invalid option");
                return "INVALID";
        }
    }

    public static void checkWinner(String responseA, String responseB) {
        if ((responseA.equals("STONE") && responseB.equals("SCISSOR")) ||
                (responseA.equals("PAPER") && responseB.equals("STONE")) ||
                (responseA.equals("SCISSOR") && responseB.equals("PAPER"))) {
            System.out.println("PLAYER A WON!");
        } else if ((responseB.equals("STONE") && responseA.equals("SCISSOR")) ||
                (responseB.equals("PAPER") && responseA.equals("STONE")) ||
                (responseB.equals("SCISSOR") && responseA.equals("PAPER"))) {
            System.out.println("PLAYER B (BOT) WON!");
        } else {
            System.out.println("IT'S A DRAW!");
        }
    }
}

