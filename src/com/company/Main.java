package com.company;

public class Main {

    public static void main(String[] args) {
        EmployeesBook employeesBook = new EmployeesBook();

        System.out.println();
        System.out.println("ВЫВОДИМ СПИСОК ДАННЫХ О ВСЕХ СОТРУДНИКАХ ");
        employeesBook.printAllEmployees(); // вывод всех данных сотрудников  (экземпляракласса Employees)
        System.out.println();
        System.out.println("ВЫВОДИМ СУММУ ЗАРПЛАТ ВСЕХ СОТРУДНИКОВ ");
        employeesBook.sumAllSalariesEmployees();// вывод общей суммы всей зараплат сотрудников
        System.out.println();
        System.out.println("ВЫВОДИМ СРЕДНЮЮ ЗАРПЛАТУ ВСЕХ СОТРУДНИКОВ ");
        employeesBook.averageAllSalariesEmployees(); // вывод суммы средней зараплаты сотрудника
        System.out.println();
        System.out.println("СОТРУДНИКОМ c минимальной зарплатой является ");
        employeesBook.minAllSalariesEmployees(); // вывод сотрудника с самой маленькой зарплатой
        System.out.println();
        System.out.println("СОТРУДНИКОМ c максимальной зарплатой является ");
        employeesBook.maxAllSalariesEmployees();  // вывод сотрудника с самой большой зарплатой
        System.out.println();
        System.out.println("ВЫВОДИМ СПИСОК Имен Отчеств и Фамилий ВСЕХ СОТРУДНИКОВ ");
        employeesBook.printAllsurnamesEmployees(employeesBook); // вывод И О Ф всех сотрудников
        System.out.println();
        System.out.println("Введите процент со знаком + или -, на который хотите увеличить или уменьшить заработную плату ВСЕХ сотрудников ");
        employeesBook.indexingAllSalariesEmployees(); // индексация зарплаты всех сотрудников на опреденный процент
        System.out.println();
        employeesBook.printAllEmployees();
        // создаем экземпляр класса MethodsWorkWithDepartment для работы с методами отделов
        /*
        MethodsWorkWithDepartment department = new MethodsWorkWithDepartment();
        department.sumAllSalariesDepartment(employees);
        */
    }
}
