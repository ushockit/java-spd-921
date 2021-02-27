package org.itstep.models;

public class Worker extends Person {
    private double salary;


    public Worker(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void show() {

    }

    @Override
    public String toString() {
        return super.toString() + " --> Worker{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public String toJson() {
        return null;
    }

    @Override
    public String toXml() {
        return null;
    }
}
