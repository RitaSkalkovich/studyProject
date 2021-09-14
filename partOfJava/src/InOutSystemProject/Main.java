package InOutSystemProject;

import InOutSystemProject.Cabinet.Cabinet;
import InOutSystemProject.Employee.Employee;
import InOutSystemProject.Employee.ItDepartment;
import InOutSystemProject.Employee.Managers.*;
import InOutSystemProject.Employee.HelpDesk;
import InOutSystemProject.Employee.ServiceStaff;

import InOutSystemProject.Record.IdCardJournal;



import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        IdCardJournal info = new IdCardJournal(15);


        Employee teamManager = new TeamManager("Ivan", "Ivanov");
        info.registerEmployee(teamManager);
        info.enterToOffice(teamManager, teamManager.idCard);
        System.out.println("Можешь войти " + info.isEmployeeHasAccessToOffice(teamManager));
        System.out.println(teamManager.status);

        Employee accountant = new Accountant("Marya", "Petrovna");
        info.registerEmployee(accountant);
        info.enterToOffice(accountant);
        System.out.println("Можешь войти " + info.isEmployeeHasAccessToOffice(accountant));
        System.out.println(accountant.status);

        Employee teamManager2 = new TeamManager("Petr", "Surname");
        info.enterToOffice(teamManager2);

        Employee teamManager3 = new TeamManager("Sergei", "Surname");
        info.registerEmployee(teamManager3);
        info.enterToOffice(teamManager3);
        System.out.println(teamManager3.status);


        Employee helpDesk = new HelpDesk("Name", "Surname");
        info.leaveOffice(helpDesk);
        System.out.println(helpDesk.status);
        System.out.println(info.getAllAmount() + " общее количество в офисе");


        VIP heplDesk1 = new HelpDesk("Ivan", "Ivanov");
        heplDesk1.isGetAccess();

        HelpDesk[] hepDeskEmployee = new HelpDesk[]{new HelpDesk("Ivan", "Ivanov")};
        Cabinet<HelpDesk> cabinet = new Cabinet<>(hepDeskEmployee);
        cabinet.storeEmployeeInCabinet();


        // регистрация нескольких сотрудников
        Employee[] employeeSeveral = new Employee[]{teamManager, teamManager2, teamManager3};
        IdCardJournal idCardJournalSeveralEmployee = new IdCardJournal();
        idCardJournalSeveralEmployee.registerWorkers(employeeSeveral);

        // регистация одного сотрудника
        ItDepartment employeeOne = new ItDepartment("Eva", "Ivanovna");
        IdCardJournal idCardJournalNewEmployee = new IdCardJournal();
        idCardJournalNewEmployee.registerWorkers(employeeOne);
        idCardJournalNewEmployee.validateInOffice(employeeOne);

        // Хранение в виде листа
        ArrayList<Cabinet> employeeList = new ArrayList<>();

        // инициализация с множеством сотрудников
        ItDepartment[] employeeItDepartment = new ItDepartment[]{new ItDepartment("Inna", "Ivanovna"), new ItDepartment("Sergei", "Ivanov")};
        Cabinet<ItDepartment> employeeInCabinetItDepartment = new Cabinet<>(employeeItDepartment);
        // инициализация с одним
        HelpDesk[] employeeHelpDesk = new HelpDesk[]{new HelpDesk("Ivan", "Ivanov")};
        Cabinet<HelpDesk> employeeInCabinetHelpDesk = new Cabinet<>(employeeHelpDesk);
        // инициализация без
        ServiceStaff[] employeeServiceStaff = new ServiceStaff[]{};
        Cabinet<ServiceStaff> employeeInCabinetServiceStaff = new Cabinet<>(employeeServiceStaff);

        // Добавление
        employeeList.add(employeeInCabinetHelpDesk);
        employeeList.add(employeeInCabinetItDepartment);

        // Вывод всех находящихся в кабинете
        System.out.println(employeeList);



        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("InfoAboutEmployeeInOffice.new"))) {
            oos.writeObject(info);
        } catch (IOException e) {
            System.out.println(e);
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("InfoAboutEmployeeInOffice.new"))) {

             info = (IdCardJournal) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(info.getAllAmount());
    }
}
