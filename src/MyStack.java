public class MyStack {
private boolean isEmpty= true;
private final int[] array = new int[10];
private int numberOfElements;

public boolean isEmpty() {
    return true;
}

public void push(int element){

    array[numberOfElements] = element;
    numberOfElements++;
}
    public void pop(){

        numberOfElements--;
    }

    public int getSize(){
        return numberOfElements;
    }

    public int search(int number){
        int counter = 0;
        for(int index = 0; index < array.length; index++){
            if(array[counter++] == number) {
                return counter;
            }
        }
        return -1;
    }

    public int peek(){
       /* if(numberOfElements == 0){
            throw new EmptyStackException();
        }*/
       return array[numberOfElements-1];
    }

}
