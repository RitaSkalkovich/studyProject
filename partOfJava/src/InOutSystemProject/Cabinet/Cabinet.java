package InOutSystemProject.Cabinet;

import InOutSystemProject.Employee.Employee;

import java.util.Arrays;


public class Cabinet<T extends Employee> {
    public T[] employee;
    public T employees;

    public Cabinet(T[] employee) {
        this.employee = employee;

    }

    public Cabinet(T employees) {
        this.employees = employees;
    }

    public void storeEmployeeInCabinet() {
        for (T employee: employee
             ) {
            System.out.println("Количество в кабинете");
        }
    }

    @Override
    public String toString() {
        return "\n In Cabinet is " + Arrays.toString(employee);
    }
}
