import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.awt.Color;

import javax.swing.JButton;

import java.lang.Math;

public class WordleInputHandler extends WordleEngine {

    // since you only initlize your Variable once and you do this in your constructor. Make it final (See under)
    // private final Scanner scanner;
    private Scanner scanner;
    protected int numGuesses;

    protected static String answer;
    protected String guess;
    protected static ArrayList<String> wordList = new ArrayList<String>();
    protected static DrawWord drawer = new DrawWord();

    WordleInputHandler() {
        scanner = new Scanner(System.in);

        Collections.addAll(wordList, "Bishop", "Beyond", "Castle", "Coffee",
                "Family", "Hudson", "Kermit", "Senior", "Winner");

        setAnswer(selectAnswer(wordList));
        this.guess = "";

    }

    public static String selectAnswer(ArrayList<String> words) {

        int randomIndex = ((int) (Math.random() * (words.size() - 1) + 1));
        System.out.println(randomIndex);

        return words.get(randomIndex).toLowerCase();
    }

    public static void setAnswer(String selectedWord) {
        answer = selectAnswer(wordList);
        System.out.println(answer);
    }

    public String getAnswer() {
        return answer;
    }

    public void setGuess() {

        while (this.guess.length() != 6) {
            System.out.println("Please enter a SIX letter word: ");
            this.guess = (scanner.nextLine()).toLowerCase();
        }

    }

    public void resetGuess() {

        // if all bg cell color == green then run endGame functoin

        this.guess = "";
    }

    public String getGuess() {

        return this.guess;
    }


}
