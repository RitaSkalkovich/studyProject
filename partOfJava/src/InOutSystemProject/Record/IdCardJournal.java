package InOutSystemProject.Record;

import InOutSystemProject.Employee.Employee;

import java.time.Instant;
import java.util.HashMap;

public class IdCardJournal {

    // TODO: 9/1/2021 HashMap must have type [Pavel.Chachotkin]
    public HashMap idCards = new HashMap();  // пустой словарь
    public int amountOfEmployeesInOffice = 0; // TODO: 9/1/2021 Can I register users more than 15? [Pavel.Chachotkin]

    public void enterToOffice(Employee employee) throws Exception {
        // TODO: 9/1/2021 Must be caught exception from validate method [Pavel.Chachotkin]
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

        } // TODO: 9/1/2021 And what should be if contains user? [Pavel.Chachotkin]
    }

    public boolean isEmployeeHasAccessToOffice(Employee employee) {
        return this.idCards.containsKey(employee.name + employee.surname);
    }


}


