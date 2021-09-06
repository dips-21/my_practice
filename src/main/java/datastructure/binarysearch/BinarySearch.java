package datastructure.binarysearch;

public class BinarySearch implements Searchable{
    @Override
    public boolean search(int[] arr, int key, int start, int end) {
        start=0;
        end=arr.length;
        int mid=start+ arr.length/2;
        for (int i = 0; i < arr.length ; i++){  //3 5 8 11 15 27 43 62 85
           // if(mid<=key)
                //return mid+1;
        }
        //return mid-1;
        return false;
    }
}
