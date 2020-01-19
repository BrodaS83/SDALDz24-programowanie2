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

import java.util.Scanner;

public class Basic7UserInput {
    public static void main(String[] args) {

        System.out.println("Witam w grze WISIELEC!");
        System.out.println("podaj pierwszą literę");

        Scanner scanner = new Scanner(System.in);
        String wordIn = scanner.nextLine();

        String pasword = "Madagaskar";
        char [] userLetter = new char [pasword.length()];

        for ( int i = 0; i < pasword.length(); i++){
            userLetter[i] = '*';
         }
        System.out.println(userLetter);


    }
}
