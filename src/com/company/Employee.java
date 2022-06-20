package com.company;

import java.util.Objects;

public class Employee {
    private String name;
    private String middlename;
    private String surname;
    private int department;      // отдел которому принадлежит сотрудник
    private int salary;          // зарплата сотрудника
    private int id;              // уникальный номер каждой записи
    private static  int counter; // переменная счетчика создания объектов работает внутри данного класса
    // вставляем гетеры и сетеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // вставляем конструктор экземпляра класса на все поля кроме id
    public Employee(String name, String middlename, String surname, int department, int salary) {
        this.name = name;
        this.middlename = middlename;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter ++ ;        // увеличение уникального номера (счетчика) для каждого экземпляра класса Employee
    }

    @Override
    public String toString() {
        return id + " " + name +
                " " + middlename +
                " " + surname +
                " " + department +
                " " + salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department &&
                salary == employee.salary &&
                name.equals(employee.name) &&
                middlename.equals(employee.middlename) &&
                surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middlename, surname, department, salary);
    }
}


