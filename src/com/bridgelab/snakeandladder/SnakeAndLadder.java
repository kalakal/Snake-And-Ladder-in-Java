package com.bridgelab.snakeandladder;

public class SnakeAndLadder {
    public static int checkSnakeLadder(int pos) {
        int position=pos;
        switch(position) {
            case 4:
                position=14;
                break;
            case 42:
                position=42;
                break;
            case 24:
                position=84;
                break;
            case 78:
                position=99;
                break;
            case 62:
                position=19;
                break;
            case 49:
                position=13;
                break;
            case 87:
                position=36;
                break;
            case 98:
                position=79;
                break;
            default:
                position=position;
        }
        return position;
    }

    public static void main(String[] args) {
        int position = 0;
        System.out.println("Well come to Snake and Ladder Game");
        System.out.println(" Game start player at position  " + position);
        int counter=0;
        for (position=1;position<100;position++) {
            int dice = (int) (Math.random() * (6) + 1);
            counter++;
            position=position+dice;
            position=checkSnakeLadder(position);
            if (position>100) {
                position=position-dice;

            }
        }
        System.out.println("Player won the game");
        System.out.println("Player position  " +position);
        System.out.println("Number of time dice throw  "+counter);
    }
}