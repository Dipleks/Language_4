package test_server_client.my_test_work;

import exams.Exams;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
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
//            InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream, true);

                boolean c = true;
                while (c) {
                    Exams exams = new Exams();
                    Map<Integer, String> ruPS;
                    ruPS = exams.getExamRuPS();
                    for (int i = 0; i < 700; i++) {
                        printWriter.println(ruPS.get(i));
                    }
                    c = false;
//            socket.close();
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
