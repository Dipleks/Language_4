package test_server_client.test.my_test_3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client implements IT
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

//            Exams exams = new Exams();
//            Map<Integer, String> ruPS;
//            ruPS = exams.getExamRuPS();
//            for (int i = 0; i < 700; i++) {
////                System.out.println(enPS.get(i));
//                objectOutputStream.writeObject(ruPS.get(i));
//            }
            Socket socket = new Socket("localhost", 4444);
            Scanner scanner = new Scanner(socket.getInputStream(), "UTF-8");

            Map<Integer, String> m = new HashMap<>();
            for (int i = 0; i < 700; i++) {
                System.out.println(m.get(i));
                objectOutputStream.writeObject(m.get(i));
            }
//            objectOutputStream.writeObject("Test Client");

//            while (true){
//                String str = (String) objectInputStream.readObject();
//                System.out.println(str);
//                objectOutputStream.writeObject("test connect");
//            }
        } catch (IOException /*| ClassNotFoundException*/ e) {
            e.printStackTrace();
        }

    }
}
