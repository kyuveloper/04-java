package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setName("김진규");
        employee1.setPosition("사장");
        employee1.setSalary(9999);

        System.out.println(employee1.getName());


    }
}
