package contMenu.TEST_SER;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
class Number
{
    public int n;

    Number() { }

    @Override
    public String toString() {
        return "n = " + n;
    }
}
