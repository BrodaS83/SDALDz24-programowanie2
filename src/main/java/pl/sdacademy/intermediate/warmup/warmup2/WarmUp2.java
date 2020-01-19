//Wypisz na konsolę sumę długości wszystkich elementów tablicy.

package pl.sdacademy.intermediate.warmup.warmup2;

public class WarmUp2 {
    public static void main(String[] args) {
        String[] array = new String[]{"abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz"};

        int sumOfChars = 0;
        int wordLength = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length(); j++){
                wordLength = array[i].length();
            }
            sumOfChars = sumOfChars + wordLength;
        }
        System.out.println(sumOfChars);
    }
}



