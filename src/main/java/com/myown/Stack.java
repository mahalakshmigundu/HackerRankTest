package com.myown;

public class Stack {

    private int maxSize;
    private int[] array;
    private int topIndex;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
        this.topIndex = -1;
    }

    public void push(int j){
        topIndex++;
        array[topIndex] = j;
    }

    public int pop(){
        int old_topValue = topIndex;
        topIndex--;
        return array[old_topValue];
    }

    public int peak(){
        return array[topIndex];
    }

    public void remove(){
        int[] tempArray = new int[array.length - 1];

        for (int i = 0, k = 0; i<array.length; i++) {

            // check if index is crossed, continue without copying
            if (i == topIndex ) {
                continue;
            }

            // else copy the element
            tempArray[k++] = array[i];
        }
        topIndex--;
        array = tempArray;
    }

    public boolean isEmpty(){
        return ( topIndex == -1);
    }

    public boolean isFull(){
        return (maxSize-1 == topIndex);
    }
}
