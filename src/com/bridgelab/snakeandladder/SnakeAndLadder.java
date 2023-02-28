package com.bridgelab.snakeandladder;
// UC-7 Snake and Ladder game with two player.
public class SnakeAndLadder {
    public static int position1 = 0;
    public static int position2 = 0;
    static boolean condition = true;

    public static int checkSnakeLadder(int pos) {
        int position = pos;
        switch (position) {
            case 4:
                System.out.println("Ladder");
                position = 14;
                System.out.println("position :" + position);
                break;
            case 8:
                System.out.println("Ladder");
                position = 30;
                System.out.println("position :" + position);
                break;
            case 28:
                System.out.println("Ladder");
                position = 74;
                System.out.println("position :" + position);
                break;
            case 36:
                System.out.println("Ladder");
                position = 70;
                System.out.println("position" + position);
                break;
            case 44:
                System.out.println("Ladder");
                position = 78;
                System.out.println("position :" + position);
                break;
            case 78:
                System.out.println("Ladder");
                position = 99;
                System.out.println("position :" + position);
                break;
            case 32:
                System.out.println("Snake");
                position = 10;
                System.out.println("position :" + position);
                break;
            case 35:
                System.out.println("Snake");
                position = 6;
                System.out.println("position :" + position);
                break;
            case 49:
                System.out.println("Snake");
                position = 13;
                System.out.println("position :" + position);
                break;
            case 97:
                System.out.println("Snake");
                position = 75;
                break;
            case 87:
                System.out.println("Snake");
                position = 67;
                System.out.println("position :" + position);
                break;
            case 98:
                System.out.println("Snake");
                position = 79;
                System.out.println("position :" + position);
                break;
            default:
                position = position;
        }
        return position;
    }

    public static void player1() {
        System.out.println(" Game start player at position  " + position1);
        int counter1 = 0;
        if (position1 < 100) {
            int dice = (int) (Math.random() * (6) + 1);
            position1 = position1 + dice;
            counter1++;
            System.out.println("player1 position :" + position1);
            position1 = checkSnakeLadder(position1);
            if (position1 > 100) {
                position1 = position1 - dice;
            }

        } else if (position1 == 100) {
            System.out.println("Player 1 win");
            condition = false;

        }
    }

    public static void player2() {
        System.out.println(" Game start player2 at position  " + position2);
        int counter2 = 0;
        if (position2 < 100) {
            int dice = (int) (Math.random() * (6) + 1);
            position2 = position2 + dice;
            counter2++;
            System.out.println("player2 position :" + position2);
            position2 = checkSnakeLadder(position2);
            if (position2 > 100) {
                position2 = position2 - dice;
            }
        } else if (position2 == 100) {
            System.out.println("Palayer 2 win");
            condition = false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Well come to Snake and Ladder Game");
        int counter = 0;

        while (condition) {
            if (counter % 2 != 0) {
                player1();
                counter++;
            } else {
                counter++;
                player2();
            }
        }
    }
}
