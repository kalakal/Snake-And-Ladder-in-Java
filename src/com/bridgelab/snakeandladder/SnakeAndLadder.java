package com.bridgelab.snakeandladder;
// UC-2 player rolls the die to get number between 1 to 6.
public class SnakeAndLadder {
    static int player=0;
    public static void main(String[] args) {
        System.out.println("Well come to Snake and Ladder Game");
        System.out.println(" Game start player at position  "+player);
        int dice=(int) (Math.random()*(6)+1);
        System.out.println("dice : "+dice);
    }
}