public class MyArrayList {
    private boolean isEmpty;
    public  int[] array = new int[10];
    private int numberOfElements;

    public boolean getIsEmpty(){
        isEmpty = false;
       return isEmpty;
    }

    public void add(int number) {
        extendLength();
            array[numberOfElements] = number;
            numberOfElements++;
    }
    private void extendLength(){
            if (numberOfElements == array.length) {
                int[] doubleArrayLength = new int[array.length * 2];
                for (int index = 0; index < array.length; index++) {
                    doubleArrayLength[index] = array[index];
                }
               array = doubleArrayLength;
            }
        }

    public void remove(int num){
       int[] copyArray = new int[array.length];
       for(int index = 0; index < copyArray.length; index++){
           copyArray[index] = array[index];
           if(copyArray[index] == num){
                continue;
           }
       }
        array = copyArray;
        numberOfElements--;

    }


    public int length () {
        return numberOfElements;
    }

    }
