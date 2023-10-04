package com.george;

import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args) {

        //Instantiate
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //Variables
        String player1;
        String player2;
        int playerScore1 = 0;
        int playerScore2 = 0;

        //Player 1 - name
        System.out.println("Input player1's name: ");
        player1 = scan.nextLine();
        System.out.println("Hello " + player1 +" you are Player ONE\n");

        //Player 2 - name
        System.out.println("Input player2's name: ");
        player2 = scan.nextLine();
        System.out.println("Hello " + player2 + " you are Player TWO\n");

        System.out.println("How many rounds you want to play?: ");
        int rounds = scan.nextInt();

        for (int i = 0; i < rounds; i++){
            int playerChoice1 = rand.nextInt(6) + 1;
            int playerChoice2 = rand.nextInt(6) + 1;

            if (playerChoice2 > playerChoice1){
                playerScore2 += 1;
            } else if (playerChoice2 < playerChoice1) {
                playerScore1 += 1;
            }
        }

        System.out.printf("\n" + player1 + "'s score: %d\n" + player2 +"'s score: %d\n", playerScore1, playerScore2);

        if (playerScore2 > playerScore1){
            System.out.println("\n" + player2 + " Won!");
        } else if (playerScore2 < playerScore1) {
            System.out.println("\n" + player1 + " Won!");
        } else {
            System.out.println("\n" +"It was a tie! ");
        }
    }
}