package contMenu.TEST_SER;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class T2
{
    public static void main(String[] args) throws IOException {

//        FileReader reader = new FileReader("test.txt");

        FileInputStream fis = new FileInputStream("test.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));

        String s;

        if ((s = bf.readLine()) == null)
        {
            ObjectMapper objectMapper = new ObjectMapper();

            Number number = objectMapper.readValue(s, Number.class);

            System.out.println(number.toString());
        }
        while ((s = bf.readLine()) != null){
            ObjectMapper objectMapper = new ObjectMapper();

            Number number = objectMapper.readValue(s, Number.class);

            System.out.println(number.toString());
        }

        fis.close();
        bf.close();

    }
}
