package pl.sdacademy.intermediate.warmup.warmup1;

import java.time.LocalDate;

public class Person {

    String name;
    String surname;
    String placeOfBirth;
    int age;
    long phone;



    @Override
    public String toString() {
        return name + " " + surname + " " + "(ur. " + (LocalDate.now().getYear() - age) + " r.)\n" + "m. ur.: " + placeOfBirth + "\n" + "tel: " + phone;
    }

    public Person (String name, String surname, String placeOfBirth, int age, long phone){
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;




    }


}
