package test_server_client.test.my_test_3;

public class MyClient
{
    public static void main(String[] args) {
        Client client = new Client(4444);
        client.connect();
    }
}
