public class MyStack {
private boolean isEmpty= true;
private final int[] array = new int[10];
private int numberOfElements;
    int[] newArray = new int[array.length];

public boolean isEmpty() {
    return true;
}

public void push(int element){
    for(int index = 0; index < array.length; index++){
        newArray[index] = element;
    }
    numberOfElements++;
}

public void pop(){
        numberOfElements--;
    }

    public int getSize(){
        return numberOfElements;
    }

    public int search(){

    }
}
