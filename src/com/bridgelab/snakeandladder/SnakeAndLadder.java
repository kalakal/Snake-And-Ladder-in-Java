package com.bridgelab.snakeandladder;
// UC-3 Player checks for option no play snake or ladder.
public class SnakeAndLadder {
    static int player = 0;

    public static void main(String[] args) {
        System.out.println("Well come to Snake and Ladder Game");
        System.out.println(" Game start player at position  " + player);
        int option = (int) (Math.random() * (3) + 1);
        if (option == 1) {
            System.out.println("No play");
        }
        else if (option == 2) {
            int dice = (int) (Math.random() * (6) + 1);
            System.out.println(" player is playing dice : " + dice);
        }
        else {
            int dice = (int) (Math.random() * (6) + 1);
            System.out.println(" player is playing dice : " + dice);
        }

    }

}
