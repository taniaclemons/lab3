import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        input2.add("a");

        assertEquals(input1, ListExamples.filter(input1, ));
    }

    @Test
    public void testMerge(){

    }
}
