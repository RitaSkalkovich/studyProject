package InOutSystemProject.Record;

public class NumberValidatorForEmployee {
    public static void validate(int amount) throws Exception {
        if (amount >= 0 && amount <= 15) {
            System.out.println("Количество мест есть");
        } else {
            throw new Exception("Мест уже нет");
        }
    }
}
