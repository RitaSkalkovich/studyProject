package InOutSystemProject.Record;

import InOutSystemProject.Employee.Employee;

import java.time.Instant;
import java.util.HashMap;

public class IdCardJournal {

    public HashMap idCards = new HashMap();  // пустой словарь
    public int amountOfEmployeesInOffice = 0;

    public void enterToOffice(Employee employee) throws Exception {
        NumberValidatorForEmployee.validate(amountOfEmployeesInOffice);
        if (this.isEmployeeHasAccessToOffice(employee)) {
            employee.status = Status.INOFFICE;

        } else if (!this.isEmployeeHasAccessToOffice(employee)) {
            employee.status = Status.WITHOUTCARD;
        }
        this.amountOfEmployeesInOffice++;
        System.out.println("Считает прибытие " + amountOfEmployeesInOffice);
    }

    public void leaveOffice(Employee employee) {
        employee.status = Status.OUTOFOFFICE;
        this.amountOfEmployeesInOffice--;
        System.out.println("Считает убытие " + amountOfEmployeesInOffice);
    }

    public void registerEmployee(Employee employee) {
        String key = employee.name + employee.surname;
        if (!this.idCards.containsKey(key)) {   // существует ли
            this.idCards.put(key, Instant.now().toString());  //!поменять на тру зарегистрировали и добавили айдишник

        }
    }

    public boolean isEmployeeHasAccessToOffice(Employee employee) {
        return this.idCards.containsKey(employee.name + employee.surname);
    }


}


