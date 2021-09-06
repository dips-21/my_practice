package multithreading;

public class StringThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1=new StringBuilder();

       // Thread t2 = new Thread(new Appender(sb));
        //t1.start();
        //t2.start();
        // t3.start();
        while (true) {
            System.out.println(sb.toString());
            Thread.sleep(1000);
        }

    }
}

class Appender implements Runnable {
    StringBuilder stringBuilder;
    int start;
    int end;

    public Appender(StringBuilder stringBuilder, int start, int end) {
        this.stringBuilder = stringBuilder;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int num = start;
        while (num < 10) {
            stringBuilder.append(num++).append(",");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //@Override
    public void run1(){
        int num=start;

    }
}
