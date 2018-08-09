package test_server_client.my_test;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread
{
    public static List<ConnectClient> list = new ArrayList<>();
    private final int port = 4444;
    private ServerSocket serverSocket;

    public Server(){
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void sendMassege(String s){
        for (ConnectClient c : list) {
            c.send(s);
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                ConnectClient connectClient = new ConnectClient(serverSocket.accept());
                sendMassege("test connectClient: " + connectClient.toString());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void startServer(){
        start();
    }

    public void stopServer(){

    }
}
