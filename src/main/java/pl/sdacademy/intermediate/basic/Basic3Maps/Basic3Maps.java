//Stwórz mapę HashMap<String, Integer>, która będzie przechowywać ilość wystąpień danego stringa z tablicy:
//
//String[] array = new String[] { "abc", "abc", "efghijk", "abc", "lmnopr",
//"st", "abc", "u", "vwxyz", "st", "lmnopr", "st", "u", "vwxyz" };
//
//Przeiteruj się po tablicy i dodawaj poszczególne klucze, zmieniając odpowiednio wartość (stwórz do tego osobną metodę np. InitMap).
//
//Wypisz na konsolę zawartość mapy, używając na niej metody toString().
//Zwróć uwagę, czy kolejność dodawania elementów zgadza się z kolejnością wypisania na konsolę.
//
//Zmień implementację mapy na LinkedHashMap. Dodaj ponownie elementy do mapy z wykorzystaniem napisanej metody.
//Wypisz zawartość na konsolę i ponownie zwróć uwagę na kolejność.
//
//Przeiteruj się po mapie z wykorzystaniem Map.Entry<String, Integer> i wypisz wszystkie elementy mapy w sposób np.
//abc -> 5
//
//Wypisz na konsolę wszystkie klucze.
//Wypisz na konsolę wszystkie wartości.


package pl.sdacademy.intermediate.basic.Basic3Maps;

import java.util.*;

public class Basic3Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> sumOfString = new HashMap<>();
        HashMap<String, Integer> addElements = new LinkedHashMap<>();

        String[] array = new String[]{"abc", "abc", "efghijk", "abc", "lmnopr",
                "st", "abc", "u", "vwxyz", "st", "lmnopr", "st", "u", "vwxyz"};


        System.out.println("Zapisane elementy w HashMap");
        initMap(sumOfString, array);
        System.out.println("");
        System.out.println("Zapisane elementy w LinkedHashMap");
        initMap(addElements, array);
        System.out.println("");

        System.out.println("Poukładane elementy HasMapy");
        printMapElements(sumOfString);
        System.out.println("");
        System.out.println("Poukładane elementy LinkedHashMap");
        printMapElements(addElements);
        System.out.println("");

        Set<String> keySet = addElements.keySet();
        System.out.println("Klucz:\n" + keySet);
        Collection<Integer> values = addElements.values();
        System.out.println("Wartość:\n" + values);

    }

    public static void initMap(Map<String, Integer> map, String[] array) {
        for (int i = 0; i < array.length; i++) {
            String key = array[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }

    public static void printMapElements(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "->" + value);
        }
    }
}
