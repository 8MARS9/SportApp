package model;

import java.util.Objects;

public class Student implements Comparable{
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj == null) return false;
        if (getClass() !=obj.getClass()) return false;

        Student student = (Student) obj;
        boolean result = Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
        //boolean result = grade > student.grade;
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", grade=" + grade;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;

        if(student.getGrade() > grade) return 1;
        if(student.getGrade() < grade) return -1;

        return 0;
    }
}
