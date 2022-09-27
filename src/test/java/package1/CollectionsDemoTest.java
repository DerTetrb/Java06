package package1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionsDemoTest {
    @Test
    public void testgetQuantityString(){
        List<String> str = new ArrayList<>();
        str.add("First");
        str.add("Second");
        str.add("Thread");
        str.add("Four");
        char a = 'F';
        System.out.println(str);
        System.out.println(CollectionsDemo.getQuantityString(str, a));
        assertEquals(CollectionsDemo.getQuantityString(str, a), 2);
    }

}