package test_server_client.my_test;

public class MyClient
{
    public static void main(String[] args) {
        Client client = new Client(4444);
        client.connect();
    }
}
