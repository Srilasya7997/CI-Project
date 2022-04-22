import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class word_counterTest {
    public static word_counter wc_cntr;

    @BeforeClass
    public static void setup(){wc_cntr = new word_counter();}
    //Test case by Lasya
    @Test
    public void test_wordcount()
    {
        assertEquals(4,word_counter.wordcnt("This is the string"));
    }
    
    //Integration  testing
    //@Test
    //public void test_integration1()
    //{
        //assertEquals(6.0,wc_cntr.test_wordcount(wc_cntr.wordcnt("This is integration"));
   // }

}

