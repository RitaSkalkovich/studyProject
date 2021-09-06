package InOutSystemProject.Cabinet;

import InOutSystemProject.Employee.Employee;


public class Cabinet<T extends Employee> {
    public T[] employee;

    public Cabinet(T[] employee) {
        this.employee = employee;

    }

    public void storeEmployeeInCabinet() {
        for (T employee: employee
             ) {
            System.out.println("Количество в кабинете");
        }
    }
}
