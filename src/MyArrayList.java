public class MyArrayList {
    private boolean isEmpty;
    private final int[] array = new int[10];
    private int numberOfElements;

    int[] newArray = new int[array.length];
    public boolean getIsEmpty(){
        isEmpty = false;
       return isEmpty;
    }
    public void add(int number){
        for(int index = 0; index < array.length; index++ ){
            newArray[index] = number;
        }
        if(numberOfElements == array.length){
            int[] doubleArrayLength = new int[newArray.length*2];
            for(int index = 0; index < newArray.length; index++ ){
                doubleArrayLength[index] = newArray[index];
            }
            newArray[numberOfElements] = number;
            numberOfElements++;
        }

    }
    public void remove(){
       int[] copyArray = new int[array.length-1];
       for(int index = 0; index < copyArray.length; index++){
           copyArray[index] = newArray[index];
       }

    }
    public int length(){
        return numberOfElements;
    }
}
