package InOutSystemProject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getStatus(1);
    }

    private static void getStatus(int numberOfStatus) {
        System.out.println(Status.INOFFICE.getNumberOfStatus());
        System.out.println(Arrays.toString(Status.values()));
    }


}
