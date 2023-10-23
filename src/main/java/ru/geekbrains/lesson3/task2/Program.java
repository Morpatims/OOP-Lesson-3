package ru.geekbrains.lesson3.task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        Employee[] employees = EmployeeFabric.generateEmployees(15);

        System.out.println("Неотсортированный список сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println("Список сотрудников, отсортированный по возрасту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
