public class ArrayOfTrueAndFalse {
    public static boolean[] returnTrueAtoddAndFalseAtEvenElement(int[] array) {
        boolean[] boolArray = new boolean[array.length];
        for (int index = 0; index < array.length - 1; index++) {
            if(array[index] % 2 != 0){
                boolArray[index] = true;
            }
        }
        return boolArray;
    }
}