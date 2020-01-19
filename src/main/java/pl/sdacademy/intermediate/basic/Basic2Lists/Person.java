package pl.sdacademy.intermediate.basic.Basic2Lists;

import java.time.LocalDate;

public class Person {

    String name;
    String surname;
    String placeOfBirth;
    int age;
    long phone;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + "(ur. " + (LocalDate.now().getYear() - age) + " r.)\n" + "m. ur.: " + placeOfBirth + "\n" + "tel: " + phone + "\n\n";
    }

    public Person(String name, String surname, String placeOfBirth, int age, long phone){
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;




    }


}
