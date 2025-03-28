package coreJava;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ConnectionPool {
    private static ConnectionPool _connectionPoolInstance;
    Queue freeConnectionQueue;
    Queue busyConnectionQueue;

    private ConnectionPool() {
        freeConnectionQueue = new ArrayBlockingQueue(50);
        busyConnectionQueue = new ArrayBlockingQueue(50);
    }

    public static ConnectionPool getInstance() {

        if (_connectionPoolInstance == null) {
            _connectionPoolInstance = new ConnectionPool();
        }
        return _connectionPoolInstance;
    }

    public static void main(String[] args) {
       ConnectionPool connectionPool= ConnectionPool.getInstance();
        ConnectionPool connectionPool1=ConnectionPool.getInstance();
        System.out.println(connectionPool==connectionPool1);


    }
}
