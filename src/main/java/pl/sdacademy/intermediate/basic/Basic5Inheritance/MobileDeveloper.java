package pl.sdacademy.intermediate.basic.Basic5Inheritance;

public class MobileDeveloper extends Developer {

    String mobileOs;

    public MobileDeveloper(String name, String company, double salary, String mobileOs) {
        super(name, company, salary);
        this.mobileOs = mobileOs;
    }

    @Override
    protected void makeCode() {
        System.out.println(name + " is coding for " + company + " for " + salary + " in " + mobileOs);
    }
}
