package pl.sdacademy.intermediate.basic.Basic5Inheritance;

abstract class Developer {
    protected String name;
    protected String company;
    protected double salary;

    public Developer(String name, String company, double salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    protected abstract void makeCode();

    }

