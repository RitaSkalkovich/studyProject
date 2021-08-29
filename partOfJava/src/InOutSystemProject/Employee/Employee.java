package InOutSystemProject.Employee;

import InOutSystemProject.Record.Status;

public abstract class Employee {
    public String name;
    public String surname;
    public Status status;


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }


}
