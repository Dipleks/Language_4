package contMenu.TEST_SER;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class T3
{
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();

        FileReader reader = new FileReader("test.txt");
        ObjectMapper objectMapper = new ObjectMapper();
        Number number = objectMapper.readValue(reader, Number.class);

    }
}
