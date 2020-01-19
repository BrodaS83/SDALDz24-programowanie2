//Wypisz na konsolę najwyższą oraz najniższą liczbę z tablicy.
//Do poszukiwania min i max NIE używaj gotowych metod i bibliotek

package pl.sdacademy.intermediate.warmup.warmUp3;

public class WarmUp3 {
    public static void main(String[] args) {
        int[] array = new int[] { -2, 3, 1, 23, -9, 0, 12, 6, -4 };

    int bigest = 0;
    int lower = 0;
    int longTab = array.length;

    for (int i = 0; i<longTab; i++){
        if (array[i] > bigest)
            bigest = array[i];
        if (array[i] < lower)
            lower = array[i];
    }

        System.out.println(bigest);
        System.out.println(lower);



    }
}
