import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class string_functionsTest {
    public static string_functions str_funs;

    @BeforeClass
    public static void setup(){str_funs = new string_functions();}
    //Test case by Lasya
    @Test
    public void test_wordcount()
    {
        assertEquals(4,str_funs.wordcnt("This is the string"));
    }

    public void test_no_of_occr_word()
    {
        assertEquals(2,str_funs.no_of_occr_word("This is red apple in a red bucket","red"));
    }

    public void test_gen_random_string()
    {
        assertTrue(!str_funs.gen_random_string().isEmpty());
    }

    public void test_gen_random_number()
    {
        assertTrue(400 < str_funs.gen_random_number());
    }
    
    //  Integration  testing
    @Test
    public void test_integration1()
    {
        assertEquals(1,str_funs.wordcnt(str_funs.gen_random_string("ThisString",str_funs.gen_random_number())));
    }

}

