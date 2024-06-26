import java.util.Scanner;

public class Blackjack {

    public int play(int handOne, int handTwo) {

        if (handOne == handTwo) {
            return 0;
        }
        if (handOne < 2 || handTwo < 2) {
            return 0;
        } else if (handOne > 21 && handTwo > 21) {
            return 0;
        } else if (handOne > 21) {
            return handTwo;
        } else if (handTwo > 21) {
            return handOne;
        } else if (handOne > handTwo) {
            return handOne;
        } else {
            return handTwo;
        }

    }



//public void play (int playerOne, int playerTwo){
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("enter player ones hand ");
//        int playerOne = scanner.nextInt();
//
//        System.out.println("enter player twos hand ");
//        int playerTwo = scanner.nextInt();
//
//
//        if (playerOne < 0 || playerOne > 21 || playerTwo < 0 || playerTwo > 21) {
//            System.out.println("Players' hand must be between 1-21");
//        } else if (playerOne == playerTwo) {
//            System.out.println("It's a draw");
//        } else if (playerOne < playerTwo) {
//            System.out.println("Player two wins by " + (playerTwo - playerOne));
//        } else {
//            System.out.println("Player one wins by " + (playerOne - playerTwo));
//        }
    }



