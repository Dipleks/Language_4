package test_server_client;

import exams.Exams;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;

public class Server implements Runnable
{
    private Socket socket;
    private Exams exams = new Exams();

    public Server(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true)){

            Map<Integer, String> enPS;
            enPS = exams.getExamEnPS();
//            for (int i = 0; i < 700; i++) {
//                System.out.println(enPS.get(i));
//            }
            if (scanner.hasNextLine()){
                printWriter.print("test");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
