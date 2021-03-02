package t_9_IO_and_NIO.Serialization.Proger1;

import java.io.Serializable;

/** Чтобы объект превратить в бинарный файл, надо имплиментировать в нем Serializable */
public class Employee implements Serializable {
    String name;
    String department;
    int age;
    double salary;
    /** Чтобы объект превратить в бинарный файл, надо имплиментировать в нем Serializable */
    Car car;

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
