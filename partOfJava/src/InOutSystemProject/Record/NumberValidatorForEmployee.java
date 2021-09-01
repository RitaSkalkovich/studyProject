package InOutSystemProject.Record;

public class NumberValidatorForEmployee {
    public static void validate(int amount) throws Exception {
        if (amount >= 0 && amount <= 15) {
            System.out.println("Количество мест есть");
        } else {
            throw new Exception("Мест уже нет");
            // TODO: 9/1/2021 Must be created custom exception [Pavel.Chachotkin]
        }
    }
}
