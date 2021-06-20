package assignmentJni.networking.basic;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        SocketAddress address=new InetSocketAddress("127.0.0.01",9999);
        Socket socket=new Socket();
        System.out.println("client connecting");
        socket.connect(address);
        System.out.println("client connected");
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        System.out.println("sending data");
        dataOutputStream.writeInt(6);

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        System.out.println("receiving result");
        int result = dataInputStream.readInt();
        System.out.println("result is "+result);

    }
}
