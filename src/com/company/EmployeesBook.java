package com.company;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class EmployeesBook {
    private int size; // счетчик количества созданных экземпляров класса Employee
    private int quantityElementsCreatedInTheArray = size; // колличество реально созданных в программе экземпляров класса Employee
    private Employee[] employees = new Employee[10]; // создание массива в количестве 10 экземпляров класса Employee
    private int numberOfCellsInTheArray = employees.length; //количество ячеек в массиве

    EmployeesBook() {
    addEmployee ("Александр","Васильевич","Антонов",2,32000 );
    addEmployee ("Петр","Васильевич","Антипов",2,31000 );
    addEmployee ("Николай","Иванович","Хлестаков",1,42000 );
    addEmployee ("Вадим","Дмитриевич","Горохов",3,45000 );
    addEmployee ("Алексей","Артемович","Иванов",1,43000 );
    addEmployee ("Алексей","Степанович","Кремнев",4,46000 );
    addEmployee ("Андрей","Иванович","Коршунов",4,41000 );
    addEmployee ("Николай","Иванович","Золотов",5,40000 );
    addEmployee ("Артем","Петрович","Русских",5,36000 );
    addEmployee ("Александр","Казимирович","Громов",3,60000 );
    // addEmployee ("Александр","Васильевич","Антонов",2,32000 ); // проверочная 11 запись для заполненности массива и одиаковости
       }

    // метод передачи экземплятров класса Employee в массив экземпляра класса EmployeesBook
    public void addEmployee(String name, String middlename, String surname, int department, int salary) {
         int variableAvailabilityTheSameObject = -1;
        if (size >= numberOfCellsInTheArray) {                                      // если массив меньше равен 0 то
            System.out.println("Трудовая книжка заполнена. Добавление нового сотрудника недоступно.");
        } else {
            Employee newEmployee = new Employee(name, middlename, surname, department, salary); // создаем экземпляр класса Employee
              for (int i = 0; i < size; i++ ){
                 if (equalsS(newEmployee,employees[i])) {
                    variableAvailabilityTheSameObject = 1;
                    System.out.println ("Под номером " + i + " работник, ранее, уже внесен в базу данных !");
                }
              }
            if (variableAvailabilityTheSameObject < 0 ){
              employees [size++] = newEmployee;           // передаем экземпляр класса Employee в ячейку массива под индексом size
                quantityElementsCreatedInTheArray = size;}
        }
    }
    // вывод одного экземпляра класса Employees в консоль со всеми полями
    public  void printOneEmployees (Employee employees){

         //   System.out.print("   " + employees.getId()+ " " + employees.getName() + " " + employees.getMiddlename() + " " + employees.getSurname() );
         //   System.out.println(" отдел -" +  employees.getDepartment() + " " + employees.getSalary() );

        System.out.println (employees.toString()); // обращаемся к переопределенному классу toString
    }

    public  void printAllEmployees () {
        System.out.println("ВЫВОДИМ СПИСОК ДАННЫХ О ВСЕХ СОТРУДНИКАХ ");
        for (int i = 0; i < quantityElementsCreatedInTheArray; i++) {
            printOneEmployees (employees[i]);
        }
    }

    public  void  sumAllSalariesEmployees (){
        System.out.println("   ВЫВОДИМ СУММУ ЗАРПЛАТ ВСЕХ СОТРУДНИКОВ ");
        int sumAllSalaries = 0;
        for (int i = 0; i < quantityElementsCreatedInTheArray; i++){
            sumAllSalaries += employees[i].getSalary();
        }
        System.out.println("Сумма зарплат всех сотрудников = " + sumAllSalaries);
    }

    public void  averageAllSalariesEmployees () {
        System.out.println("   ВЫВОДИМ СРЕДНЮЮ ЗАРПЛАТУ ВСЕХ СОТРУДНИКОВ ");
        int summa = 0;
        for (int i = 0; i < quantityElementsCreatedInTheArray; i++) {
            summa += employees[i].getSalary();
        }
        int averageAllSalaries = summa / quantityElementsCreatedInTheArray;

        System.out.println("Средняя зарплата всех сотрудников = " + averageAllSalaries);
    }


    public void  minAllSalariesEmployees(){
        System.out.println("СОТРУДНИКОМ c минимальной зарплатой является ");
        int sumAllSalaries = employees[0].getSalary();
        int minSalaryIndex = 0;
        for (int i = 1; i < quantityElementsCreatedInTheArray; i++){
            if (sumAllSalaries > employees[i].getSalary()){
                sumAllSalaries = employees[i].getSalary();
                minSalaryIndex = i;
            }
        }
        printOneEmployees(employees[minSalaryIndex]);
    }

    public void  maxAllSalariesEmployees(){
        System.out.println("СОТРУДНИКОМ c максимальной зарплатой является ");
        int sumAllSalaries = employees[0].getSalary();
        int maxSalaryIndex = 0;
        for (int i = 1; i < quantityElementsCreatedInTheArray; i++){
            if (sumAllSalaries < employees[i].getSalary()){
                sumAllSalaries = employees[i].getSalary();
                maxSalaryIndex = i;
            }
        }
        printOneEmployees(employees[maxSalaryIndex]);
    }
    /*
    public static void printAllsurnamesEmployees (Employee[] employees) {
        System.out.println("ВЫВОДИМ СПИСОК Имен Отчеств и Фамилий ВСЕХ СОТРУДНИКОВ ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("   " + employees[i].getName() + " " + employees[i].getMiddlename() + " " + employees[i].getSurname());
        }
    }
    */
    // ввод числа с клавиатуры в программу
    public static int inputNumbersInt (){
        Scanner range = new Scanner(System.in);
        //Ввводим число и проверяем его на отритцательность и сужествование
        if (range.hasNextInt())
        { return range.nextInt();
        } else { return -101; }
    }

    public void  indexingAllSalariesEmployees (){
        System.out.println("Введите процент со знаком + или -, на который хотите увеличить или уменьшить заработную плату ВСЕХ сотрудников ");
        int k = 0;
        do {
            System.out.print("      = ");
            k = inputNumbersInt();
        } while ( k < -100 || k > 100 );
        for (int i = 0; i < employees.length; i++){

            employees[i].setSalary((employees[i].getSalary()/100)* k + employees[i].getSalary());

        }
    }

    public void printAllsurnamesEmployees(EmployeesBook employeesBook) {
        System.out.println("ВЫВОДИМ СПИСОК Имен Отчеств и Фамилий ВСЕХ СОТРУДНИКОВ ");
        for (int i = 0; i < quantityElementsCreatedInTheArray; i++) {
            System.out.println("   " + employees[i].getName() + " " + employees[i].getMiddlename() + " " + employees[i].getSurname());
        }
    }


    public boolean equalsS(Employee objectOne,Employee objectTwo ) {
        Employee employees = objectTwo;
        return  employees.equals(objectOne);
    }

}

