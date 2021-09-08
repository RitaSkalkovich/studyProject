package InOutSystemProject.Record;

// TODO: 9/8/2021 Write constant names by UPPER_SNAKE_CASE [Pavel.Chachotkin]
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