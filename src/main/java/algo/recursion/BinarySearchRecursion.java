package algo.recursion;

public class BinarySearchRecursion {
    int binarySearch(int[] num, int findNum) {
        int start = 0;
        int end = num.length - 1;
        return binarySearch(num, findNum, start, end);
    }
//Is this hiring for a specific project .If then can you please brief about it or let me know the technologies used
 //   there
    //We have used Java ,Spring boot ,MySql ,Git for version control ,Maven as build and dependency management tool
// mvn clean install (command to build)
    //Git pull( get latest changes) ,commit (save changes locally), push(save changes to server)
    //merge rebase (rebase on top of remote changes,clean history)
    int binarySearch(int[] arr, int targetValue, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (targetValue == arr[mid]) {
            return mid;
        }

        if (targetValue > arr[mid]) {
            return binarySearch(arr, targetValue, mid + 1, end);
        }

        if (targetValue < arr[mid]) {
            return binarySearch(arr, targetValue, start, mid - 1);
        }
        return -1;
    }
}
