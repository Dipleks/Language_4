package test_server_client;

public class MainServer
{
    public static void main(String[] args) {
        System.out.println("server");
        Server server = new Server();
        server.startServer();
    }
}
