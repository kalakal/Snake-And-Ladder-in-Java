package com.bridgelab.snakeandladder;
public class SnakeAndLadder {
    public static int checkSnakeLadder(int pos) {
        int position=pos;
        switch(position) {
            case 1:
                position=14;
                break;
            case 2:
                position=42;
                break;
            case 3:
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
        }
        System.out.println("Player won the game");
        System.out.println("Player position  " +position);
        System.out.println("Number of time dice throw  "+counter);
    }
}