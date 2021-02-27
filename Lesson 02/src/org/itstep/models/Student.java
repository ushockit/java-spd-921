package org.itstep.models;

public class Student extends Person {
    private int course;
    private String group;

    public Student(String firstName, String lastName, int age, String group, int course) {
        //вызов конструктора базового класса
        super(firstName, lastName, age);
        this.group = group;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void show() {

    }

    @Override
    public String toString() {
        return super.toString() + " --> Student{" +
                "course=" + course +
                ", group='" + group + '\'' +
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
