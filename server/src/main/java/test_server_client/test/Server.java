package test_server_client.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread{

    public static List<ClientConnection> connects = new ArrayList<>();

    private final int port = 4444;
    private ServerSocket serverSoket;

    public Server() {
        try {
            serverSoket = new ServerSocket(port);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            try {
                ClientConnection clientConnection = new ClientConnection(serverSoket.accept());
                sendMessageAll("added: " + clientConnection.toString());
                Server.connects.add(clientConnection);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void startServer() {
        start();
    }

    public void stopServer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void sendMessageAll(String msg) {
        for(ClientConnection client : connects) {
            client.send(msg);
        }
    }
}
