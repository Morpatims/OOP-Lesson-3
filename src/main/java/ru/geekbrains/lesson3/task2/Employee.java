package ru.geekbrains.lesson3.task2;

import java.util.*;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; возраст: %d; заработная плата: %.2f руб.",
                surName, name, salary, age, calculateSalary());
    }
}
