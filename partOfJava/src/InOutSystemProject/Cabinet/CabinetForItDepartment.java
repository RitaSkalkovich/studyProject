package InOutSystemProject.Cabinet;

import InOutSystemProject.Employee.HelpDesk;
import InOutSystemProject.Employee.ItDepartment;

public class CabinetForItDepartment<T extends ItDepartment> {
    public T[] employee;

    public CabinetForItDepartment(T[] employee) {
        this.employee = employee;

    }

    public void move() {
        System.out.println("Есть доступ в кабинет CabinetForItDepartment");
    }


}
