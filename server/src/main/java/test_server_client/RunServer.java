package test_server_client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RunServer
{
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)){
            while (true){
                Socket socket = serverSocket.accept();
                new Thread(new Server(socket)).start();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
