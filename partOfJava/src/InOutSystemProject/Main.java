package InOutSystemProject;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IdCardJournal id = new IdCardJournal();

        Employee teamManager = new TeamManager("Ivan", "Ivanov");
        id.registerEmployee(teamManager);
        id.enterToOffice(teamManager);
        System.out.println("Можешь войти " + id.isEmployeehasAccessToOffice(teamManager));

        Employee accountant = new Accountant("Marya", "Petrovna");
        id.registerEmployee(accountant);
        id.enterToOffice(accountant);
        System.out.println("Можешь войти " + id.isEmployeehasAccessToOffice(accountant));

        Employee teamManager2 = new TeamManager("Name", "Surname");
        id.enterToOffice(teamManager2);

        Employee teamManager3 = new TeamManager("Name", "Surname");
        id.registerEmployee(teamManager3);
        id.enterToOffice(teamManager3);
        System.out.println(teamManager3.status);


        Employee helpDesk = new HelpDesk("Name", "Surname");
        id.leaveOffice(helpDesk);
        System.out.println(helpDesk.status);


        VIP teamManager5 = new TeamManager("Ivan", "Ivanov");
        teamManager5.isGetAccess(); // менеджер с именем может войти в комнату


    }
}
//        teamManager.isGetAccess(); // менеджер с именем может войти в комнату
//    VIP.isGetAccess(); как сделать это

//    getStatus(1);
//
//
//    private static void getStatus(int numberOfStatus) {
//        System.out.println(Status.INOFFICE.getNumberOfStatus());
//        System.out.println(Arrays.toString(Status.values()));


//    // вывод кол-во сотрудников в офисе
//    // если проходит по айди - в офисе
//    // если проходит по звонку - пометка+в офисе
//    // если не прошел - не в офисе
//    // кол-во в офисе по типу сотрудников



