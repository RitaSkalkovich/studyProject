package InOutSystemProject;

enum Status {
    INOFFICE(1),
    OUTOFOFFICE(2),
    WITHOUTCARD(3);

    private int numberOfStatus;

    Status(int numberOfStatus) {
        this.numberOfStatus = numberOfStatus;
    }

    public int getNumberOfStatus() {
        return numberOfStatus;
    }
}