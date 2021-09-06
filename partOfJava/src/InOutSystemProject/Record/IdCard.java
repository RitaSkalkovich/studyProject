
package InOutSystemProject.Record;

import java.util.Random;

// TODO: 9/1/2021 Why here main method? [Pavel.Chachotkin]
// DONE by method getArray();
public class IdCard {

    int arrayLength = 10;
    int upperBounder = 10;
    int[] array = generateIdCard(arrayLength, upperBounder);


    public int[] getArray() {
        System.out.print(array[0]);
        System.out.print(array[1]);
        System.out.print(array[2]);
        System.out.print(array[3]);
        System.out.print(array[4]);
        System.out.print(array[5]);
        System.out.print(array[6]);
        System.out.print(array[7]);
        System.out.print(array[8]);
        System.out.print(array[9]);
        System.out.println();

        return array;
    }

    private static int[] generateIdCard(int arrayLength, int upperBounder) {
        int[] array = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperBounder);

        }
        return array;
    }


}




