package contMenu.TEST_SER;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class T1
{
    public static void main(String[] args) throws IOException {
        Number number = new Number();
        number.n = 4;

//        File writer = new File("test.txt");
//        FileWriter writer = new FileWriter("test.txt");
        FileOutputStream fos= new FileOutputStream("test.txt", true);
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(fos));

        bf.newLine();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(bf, number);

        fos.flush();
        fos.close();
        bf.close();
    }
}

