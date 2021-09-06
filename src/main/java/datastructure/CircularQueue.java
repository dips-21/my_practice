package datastructure;

public class CircularQueue {
        int Q[],front ,rare,count;
        int maxSize;
        void CreateQueue(int size){
            Q=new int[size];
            front=0;
            rare=-1;
            count=0;
        }
        void enqueue(int e) {
            count++;
            rare=(rare+1)%Q.length;
            Q[rare] = e;
        }
        boolean isFull(){
            if(count==maxSize-1)
                return true;
            else
                return false;
        }
        int dequeue(){
            int temp;
            count--;
            temp=Q[front];
            front=(front+1)%maxSize;
            count--;
            return(temp);
        }
        boolean isEmpty(){
            if(count==0)
                return true;
            else
                return false;
        }
        void printCircularQueue()
        {
            int i,c;
            c=0;
            i=front;
            while(c < count)
            {
                System.out.println(Q[i]);
                i=(i+1)%maxSize;
                c++;
            }
        }


    public static void main(String[] args) {

    }
    }
