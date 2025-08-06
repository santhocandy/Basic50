package org.example;

public class Array {

    int capacity = 10;
    int []arr = new int[capacity];
    int size = 0;

    public void insert(int pos, int element){
        if(size >= capacity){
            resize();
        }
        for(int i = size; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = element;
        size++;
    }

    public void display(){
       for(int i = 0; i < size; i++)
           System.out.print(arr[i]+" ");
        System.out.println();
    }

    public void delete(int pos){
        for(int i = pos; i < size - 1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    public void resize(){
        int []newarr = new int[capacity * 2];
        for(int i = 0 ; i < size; i++){
            newarr[i] = arr[i];
        }
        arr = newarr;
        capacity = capacity * 2;
    }

    public static void main(String[] args) {

        Array array = new Array();
        array.insert(0,10);
        array.insert(1,20);
        array.insert(2,30);
        array.insert(3,40);
        array.insert(4,50);
        array.insert(5,60);
        array.insert(6,70);
        array.insert(7,80);
        array.insert(8,90);
        array.insert(9,100);
        array.insert(10,110);
        array.insert(11,120);
        array.insert(12,130);
        array.insert(13,140);
        array.delete(1);
        array.display();

    }
}
