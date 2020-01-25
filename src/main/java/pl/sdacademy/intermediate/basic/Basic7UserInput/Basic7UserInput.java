//Napisz konsolową grę w wisielca.
//
//Program posiada zadaną liczbę żyć oraz słowo do zgadnięcia.
//Użytkownik zgaduje po 1 literze i po każdym wprowadzeniu litery, należy:
//- sprawdzić czy litera znajduje się w słowie
//- sprawdzić czy może dalej grać (ma odpowiednią liczbę żyć)
//- wyświetlić komunikat w przypadku niepoprawnego wyboru litery, a w przypadku poprawnego wyświetlić
//które litery zostały już odgadnięte, pozostałe zastąpić gwiazdką "*". Jeśli np. ze słowa "abc" użytkownik zgadł wcześniej 'a',
//a teraz zgadł 'c', powinien zobaczyć napis "a*c".
//
//Wyświetl komunikat o zakończneniu gry z powodu przekroczenia liczby żyć oraz z powodu zgadnięcia całego słowa.

package pl.sdacademy.intermediate.basic.Basic7UserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic7UserInput {
    private static final String WORD_TO_GUESS = "abc";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> letters = initLettersList();
        List<String> guessedLetters = new ArrayList<>();

        boolean gameOngoing = true;
        int lives = 5;

        while (lives > 0 && gameOngoing) {
            System.out.println("Guess next letter: ");
            char userGuess = scanner.nextLine().toLowerCase().charAt(0);
            if (!letters.contains(String.valueOf(userGuess))) {
                System.out.println("Incorrect guess: " + userGuess + ". You have " + lives + " lives.");
                lives--;
            } else {
                System.out.println("Correct guess! Word contains: " + userGuess);
                guessedLetters.add(String.valueOf(userGuess));
                printCurrentlyGuessedLetters(letters, guessedLetters);
                if (guessedLetters.size() == letters.size()) {
                    gameOngoing = false;
                    System.out.println("CONGRATULATIONS! You have guessed the word!");
                }

            }
        }
    }

    private static List<String> initLettersList() {
        List<String> letters = new ArrayList<>();
        char[] lettersArray = WORD_TO_GUESS.toLowerCase().toCharArray();
        for (char letter : lettersArray) {
            letters.add(String.valueOf(letter));
        }
        return letters;
    }

    private static void printCurrentlyGuessedLetters(List<String> letters, List<String> guessedLetters) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < letters.size(); i++) {
            String letter = letters.get(i);
            if (guessedLetters.contains(letter)) {
                builder.append(letter);
            } else {
                builder.append("*");
            }
        }
        System.out.println("Currenlty guessed letters: " + builder.toString());
    }

}
