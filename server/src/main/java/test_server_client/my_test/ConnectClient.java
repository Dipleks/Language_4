package test_server_client.my_test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

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
                String str = (String) objectInputStream.readObject();
                System.out.println(str);
            }
        } catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
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
