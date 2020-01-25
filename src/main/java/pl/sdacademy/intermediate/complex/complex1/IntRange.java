package pl.sdacademy.intermediate.complex.complex1;

//stwórz klasę IntRange z polami min i max oraz metodą contains(int num), która sprawdza, czy num zawiera się w zakresie; zakres przyjmij >= min, <= max)
public class IntRange {
    int max;
    int min;

    public void contains(int num) {
        if (num >= min && num <= max) {
            return;
        }


    }
}
