package coreJava.multithreading;

//this is myClass which implements runnable
//We pass object of this to thread constructor
class MyThread implements Runnable {
    int id;
    String client;

    public MyThread(int id, String client) {
        this.id = id;
        this.client = client;
    }

    //run method overridden
    public void run() {
        System.out.printf(Thread.currentThread().getName() + "running " + client + "\n");
        ThreadTest1.handleJob(id, client);
    }

}

class ThreadTest1 {

    static void handleJob(int id, String client) {
        System.out.printf(Thread.currentThread().getName() + "Accepted job<%d> for client<%s>%n \n", id, client);
        Worker.doWork(id);
        System.out.printf(Thread.currentThread().getName() + "Finished job<%d> for client<%s>%n\n", id, client);
    }

    public static void main(String[] args) {

        int n = args.length > 0 ? Integer.parseInt(args[0]) : 50;
        // Thread child = new Thread(new MyRunnable())

        Thread child = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " handling job");
            handleJob(n, "Jack");
        });
        child.setName("child-thread");
        child.setDaemon(n > 100); //JVM does not wait for a background thread(whose daemon property is true) to exit
        System.out.println(Thread.currentThread().getName() + " starting child thread");
        child.start();
        //Created a new Thread by passing Object of class which implements Runnable
        //MyThread implements Runnable
        Thread dipsThread = new Thread(new MyThread(n, "Dips"));
        dipsThread.setName("dips-thread");
        System.out.println(Thread.currentThread().getName() + " starting Dips thread");
        dipsThread.start();
        System.out.println(Thread.currentThread().getName() + " calling jill handlejob");
        handleJob(60, "Jill");
    }
}