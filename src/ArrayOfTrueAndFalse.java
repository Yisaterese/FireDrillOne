public class ArrayOfTrueAndFalse {
    public static boolean[] returnTrueAtoddAndFalseAtEvenElement(int[] array) {
        boolean[] bool = new boolean[array.length];
        int counter = 0;
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] % 2 == 0) {
                bool[index] = false;
                counter++;
            }
        }
        return bool;
    }
}