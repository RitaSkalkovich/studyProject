package InOutSystemProject.Record;

public enum Status {
    INOFFICE("В офисе"),
    OUTOFOFFICE("Не в офисе"),
    WITHOUTCARD("Без карты");

    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}