package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);
    private String name;
    private String position;
    private int salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
