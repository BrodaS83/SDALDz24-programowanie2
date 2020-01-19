//Stwórz 3 tablice 10 elementowe. Do inicjalizacji każdej z tablic stwórz metodę: initXYZArray().
//
//a) wypełnioną kolejnymi liczbami:
//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//
//b) wypełnioną kolejnymi elementami ciągu Fibonacciego (pierwsze 2 elementy to 0 i 1; każdy następny to suma 2 poprzendich)
//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
//
//c) z losowymi wartościami z zakresu [0-30].
//(skorzystaj z klasy java.util.Random, np. random.nextInt(max-min) + min )
//
//Następnie wyświetl dla każdej tablicy (dla każdego z poniższych podpunktów napisz osobną metodę):
//a) Wszystkie elementy od końca
//b) Tylko elementy nieparzyste
//c) Sumę wszystkich elementów o parzystych indeksach (miejscu w tablicy)
//d) Sumę wszystkich elementów o wartości większej od 10.
//e) Tablicę posortowaną z wykorzystaniem algorytmu sortowania bąbelkowego (do realizacji sortowania stwórz osobną klasę)

package pl.sdacademy.intermediate.basic.Basic1Arrays;

import java.util.Arrays;
import java.util.Random;

public class Basic1Arrays {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(initArrayList()));
        System.out.println(Arrays.toString(initArray2List()));
        System.out.println(Arrays.toString(initArray3List()));
    }

    public static int[] initArrayList() {

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] initArray2List() {
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i > 1) {
                array2[i] = array2[i - 1] + array2[i - 2];
            } else {
                array2[i] = i;
            }

        }
        return array2;
    }

    public static int[] initArray3List() {
        Random random = new Random();
        int[] array3 = new int[10];
        for (int i = 0; i < 10; i++) {
            array3[i] = random.nextInt((31 - 5) + 5);
        }
        return array3;
    }
}

//
//        return array2;

//        int [] array3 = new int[30];
//
//        for (int i = 0; i <10; i++)
//        array3[i] = random.nextInt(30);

//        System.out.println(array);
//        System.out.println(array2);
//        System.out.println(array3);
