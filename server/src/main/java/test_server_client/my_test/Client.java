package test_server_client.my_test;

import exams.Exams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Map;

public class Client
{
    private Socket socket;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;
    private InetAddress inetAddress;
    private int port;

    public Client(int port) {
        try {
            inetAddress = InetAddress.getByName("localhost");
            this.port = port;
        } catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
    void connect(){
        try {
            socket = new Socket(inetAddress, port);
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectInputStream = new ObjectInputStream(socket.getInputStream());

            Exams exams = new Exams();
            Map<Integer, String> ruPS;
            ruPS = exams.getExamRuPS();
            for (int i = 0; i < 700; i++) {
//                System.out.println(enPS.get(i));
                objectOutputStream.writeObject(ruPS.get(i));
            }
//            objectOutputStream.writeObject("Test Client");

            while (true){
                String str = (String) objectInputStream.readObject();
                System.out.println(str);
                objectOutputStream.writeObject("test connect");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
