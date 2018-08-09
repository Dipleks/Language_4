package test_server_client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest
{
    public static void main(String[] args) throws IOException {
        try(Socket s = new Socket("localhost", 8189);
            Scanner in = new Scanner(s.getInputStream(), "UTF-8"))
        {
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
    }
}
