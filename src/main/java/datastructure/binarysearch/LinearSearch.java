package datastructure.binarysearch;

public class LinearSearch implements Searchable{

    public boolean search(int arr[], int key) {
        return search(arr,key,0,arr.length-1);
    }
    @Override
    public boolean search(int arr[], int key, int start, int end) {
        //li
        return false;
    }
}