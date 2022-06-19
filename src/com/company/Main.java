package com.company;

public class Main {

    public static void main(String[] args) {
        EmployeesBook employeesBook = new EmployeesBook();

        System.out.println();
        employeesBook.printAllEmployees(); // вывод всех данных сотрудников  (экземпляракласса Employees)
        System.out.println();
        employeesBook.sumAllSalariesEmployees();// вывод общей суммы всей зараплат сотрудников
        System.out.println();
        employeesBook.averageAllSalariesEmployees(); // вывод суммы средней зараплаты сотрудника
        System.out.println();
        employeesBook.minAllSalariesEmployees(); // вывод сотрудника с самой маленькой зарплатой
        System.out.println();
        employeesBook.maxAllSalariesEmployees();  // вывод сотрудника с самой большой зарплатой
        System.out.println();
        employeesBook.printAllsurnamesEmployees(employeesBook); // вывод И О Ф всех сотрудников
        System.out.println();
        //employeesBook.indexingAllSalariesEmployees(); // индексация зарплаты всех сотрудников на опреденный процент
        System.out.println();
        employeesBook.printAllEmployees();
        // создаем экземпляр класса MethodsWorkWithDepartment для работы с методами отделов
        /*
        MethodsWorkWithDepartment department = new MethodsWorkWithDepartment();
        department.sumAllSalariesDepartment(employees);
        */
    }
}
