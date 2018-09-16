package contMenu;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Numbering
{
    public int n;

    Numbering() { }

    @Override
    public String toString() {
        return "" + n;
    }
}
