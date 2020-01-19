package pl.sdacademy.intermediate.basic.Basic5Inheritance;

import pl.sdacademy.intermediate.basic.Basic5Inheritance.Developer;

public class FrontendDeveloper extends Developer {

    String javaScriptFramework;

    public FrontendDeveloper(String name, String company, double salary, String javaScriptFramework) {
        super(name, company, salary);
        this.javaScriptFramework = javaScriptFramework;
    }

    @Override
    protected void makeCode() {
        System.out.println(name + " is coding for " + company + " for " + salary + " in " + javaScriptFramework);
    }
}
