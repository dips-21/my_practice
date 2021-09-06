package datastructure;

public class LinearQueue {
   int Q[],front ,rare;
   void CreateQueue(int size){
      Q=new int[size];
      front=0;
      rare=-1;
   }
   void enqueue(int e) {
      rare++;
      Q[rare] = e;
   }
      boolean isFull(){
        if(rare==Q.length-1)
           return true;
        else
           return false;
   }
   int dequeue(){
      int temp;
      temp=Q[front];
      front++;
      return(temp);
   }
   boolean isEmpty(){
      if(front>rare)
         return true;
      else
         return false;
   }
   void printQueue()
   {
      for (int i = front; i >=rare ; i++) {
         System.out.println(Q[i]);
      }
   }
}
