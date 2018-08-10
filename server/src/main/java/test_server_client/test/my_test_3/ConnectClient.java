package test_server_client.test.my_test_3;

import exams.Exams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Map;

public class ConnectClient extends Thread
{
    private Socket socket;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    public ConnectClient(Socket socket) throws IOException {
        this.socket = socket;
        objectInputStream = new ObjectInputStream(this.socket.getInputStream());
        objectOutputStream = new ObjectOutputStream(this.socket.getOutputStream());
        start();
    }

    @Override
    public void run(){
        try {
            while (true){
                Exams exams = new Exams();
                Map<Integer, String> ruPS;
                ruPS = exams.getExamRuPS();
                for (int i = 0; i < 700; i++) {
                System.out.println(ruPS.get(i));
                    objectOutputStream.writeObject(ruPS.get(i));
                }
            }
        } catch (IOException ex){
            System.out.println("MISTAKE");
        }
    }

    //send - посылать
    public void send(String s){
        try {
            System.out.println(s);
            objectOutputStream.writeObject(s);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
