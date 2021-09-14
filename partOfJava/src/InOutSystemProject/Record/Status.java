package InOutSystemProject.Record;


public enum Status {
    IN_OFFICE("В офисе"),
    OUT_OF_OFFICE("Не в офисе"),
    WITHOUT_CARD("Без карты"),
    NOT_REGISTERED("Не наш работник");

    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}