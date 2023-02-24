package com.bridgelab.snakeandladder;


// UC-6 Repeat till player position is  at exact 100 and find number of time dice throw to win game.
public class SnakeAndLadder {
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

    public static void main(String[] args) {
        int position = 0;
        System.out.println("Well come to Snake and Ladder Game");
        System.out.println(" Game start player at position  " + position);
        int counter = 0;
        for (position = 0; position < 100; ) {
            int dice = (int) (Math.random() * (6) + 1);
            position = position + dice;
            counter++;
            System.out.println("player position :" + position);
            position = checkSnakeLadder(position);
            if (position > 100) {
                position = position - dice;

            }
        }
        System.out.println("Player position final : " + position);
        System.out.println("Player won the game");
        System.out.println("Number of time dice throw  " + counter);
    }
}