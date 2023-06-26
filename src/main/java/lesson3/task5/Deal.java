package lesson3.task5;

import java.util.Random;
import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        int cardsForPlayer = 5;
        int players;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] suits = {"clubs", "hearts", "diamonds", "spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numberOfCards = suits.length * ranks.length;

        do {
            System.out.println("Введите количество игроков:");
            players = scanner.nextInt();
        } while (players < 1 || players > numberOfCards / cardsForPlayer);

        System.out.println("Выбрано количество игроков: " + players);

        String[] deck = new String[numberOfCards];

        /*
        2 clubs
        2 hearts
        2 diamonds
        2 spades
        3 clubs
        3 hearts
        ...
         */

        int counter = 0;
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
//                deck[suits.length * i + j] = ranks[i] + " " + suits[j];
                deck[counter] = ranks[i] + " " + suits[j];
                counter++;
            }
        }


    }
}
