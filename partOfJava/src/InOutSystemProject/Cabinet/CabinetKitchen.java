package InOutSystemProject.Cabinet;

import InOutSystemProject.Employee.Employee;


public class CabinetKitchen <T extends Employee> {
    public T[] employee;

    public CabinetKitchen(T[] employee) {
        this.employee = employee;

    }

    public void move() {
        System.out.println("Есть доступ в на кухню");
    }
}
