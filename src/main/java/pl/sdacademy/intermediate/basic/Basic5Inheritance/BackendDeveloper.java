package pl.sdacademy.intermediate.basic.Basic5Inheritance;

import pl.sdacademy.intermediate.basic.Basic5Inheritance.Developer;

public class BackendDeveloper extends Developer {

    String backendLanguage;

    public BackendDeveloper(String name, String company, double salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }

    @Override
    protected void makeCode() {
        System.out.println(name + " is coding for " + company + " for " + salary + " in " + backendLanguage);

    }
}
