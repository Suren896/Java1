package com.geekbrains.lesson1.practice5;

public class TestEmployee {

    public static void task4And5(){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Алексей", "Менеджер", "dadwa@mail.ru", "89256789871", 35000, 25);
        employees[1] = new Employee("Андрей", "Продавец", "da@mdawdail.ru", "8918468", 15000, 42);
        employees[2] = new Employee("Максим", "Директор", "dadwa@mail.ru", "89256789871", 85000, 62);
        employees[3] = new Employee("Александр", "Продавец", "dadwa@mail.ru", "89256789871", 15000, 32);
        employees[4] = new Employee("Кирилл", "Продавец", "dadwa@mail.ru", "89256789871", 15000, 23);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                System.out.println(employees[i]);
            }
        }
    }

    public static void main(String[] args) {
        task4And5();
    }
}