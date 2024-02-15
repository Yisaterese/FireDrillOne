public class ZerosAndOnesArray {

    //public static int[] returnArrayOfZerosAndOnes(int[] array) {
        public static void main(String[] args) {
            int[] array = {1,23,4,5,6,34};
            int[] myArray = new int[array.length];
            int counter = 0;
            for (int index = 0; index < array.length-1; index++) {
                if (array[index] % 2 == 0) {
                    myArray[counter] = array[index] * 0;
                }
                if (array[index] % 2 == 1) {
                    myArray[index] = 1;
                }
                counter++;
            }
            System.out.print(myArray[counter]);
           // return myArray;
        //}
    }
}