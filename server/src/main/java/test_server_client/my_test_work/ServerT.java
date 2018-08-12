package test_server_client.my_test_work;

import data.Exams;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class ServerT extends Thread
{

    public static void main(String[] args) {
        ServerT serverT = new ServerT();
        serverT.startServer();
    }

    @Override
    public void run() {
            try {
                ServerSocket serverSocket = new ServerSocket(4444);
                Socket socket = serverSocket.accept();
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream, true);

                boolean c = true;
                while (c) {

                    String l = inputStream.readUTF();
                    System.out.println(l);
                    if (l.equals("PS")) {
                        Exams exams = new Exams();
                        Map<Integer, String> ruPS;
                        ruPS = exams.getExamRuPS();
                        for (int i = 0; i < 700; i++) {
                            printWriter.println(ruPS.get(i));
                        }
                    } else if(l.equals("PSE")) {
                        Exams exams1 = new Exams();
                        Map<Integer, String> enPS;
                        enPS = exams1.getExamEnPS();
                        for (int i = 0; i < 700; i++) {
                            printWriter.println(enPS.get(i));
                        }
                    }
                    c = false;
                }
                outputStream.close();
                socket.close();
                serverSocket.close();

                ServerT serverT = new ServerT();
                serverT.startServer();

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public void startServer(){
        start();
    }
}
