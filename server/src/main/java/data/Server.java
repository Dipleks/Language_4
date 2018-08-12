package data;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class Server extends Thread
{

    public static void main(String[] args) {
        Server server = new Server();
        server.startServer();
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(4444);
            Socket socket = serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            boolean c = true;
            while (c) {
                String l = inputStream.readUTF();

                Exams exams = new Exams();
                if (l.equals("PS_EN")) {
                    Map<Integer, String> enPS;
                    enPS = exams.getExamEnPS();
                    for (int i = 0; i < 700; i++) {
                        printWriter.println(enPS.get(i));
                    }
                }
                if (l.equals("PS_RU")) {
                    Map<Integer, String> ruPS;
                    ruPS = exams.getExamRuPS();
                    for (int i = 0; i < 700; i++) {
                        printWriter.println(ruPS.get(i));
                    }
                }
                if (l.equals("TO_BE_EN")) {
                    Map<Integer, String> enToBe;
                    enToBe = exams.getExamEnToBe();
                    for (int i = 0; i < 400; i++) {
                        printWriter.println(enToBe.get(i));
                    }
                }
                if (l.equals("TO_BE_RU")) {
                    Map<Integer, String> ruToBe;
                    ruToBe = exams.getExamRuToBe();
                    for (int i = 0; i < 400; i++) {
                        printWriter.println(ruToBe.get(i));
                    }
                }
                c = false;
            }
            outputStream.close();
            printWriter.close();
            socket.close();
            serverSocket.close();

            Server server = new Server();
            server.startServer();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void startServer(){
        start();
    }
}
