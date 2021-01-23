package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void Test1(){
        String result = "";
        Mirror m = new Mirror();
        result = m.mirrorEnds("abXYZba");

        Assertions.assertEquals("ab", result);
    }


    @Test
    public void Test2(){
        String result = "";
        Mirror m = new Mirror();
        result = m.mirrorEnds("abca");

        Assertions.assertEquals("a", result);
    }


    @Test
    public void Test3(){
        String result = "";
        Mirror m = new Mirror();
        result = m.mirrorEnds("aba");

        Assertions.assertEquals("aba", result);
    }

    @Test
    public void noInput(){
        String result = "";
        Mirror m = new Mirror();
        result = m.mirrorEnds("");

        Assertions.assertEquals("", result);
    }

    @Test
    public void noResult(){
        String result = "";
        Mirror m = new Mirror();
        result = m.mirrorEnds("abcd");

        Assertions.assertEquals("", result);
    }

    @Test
    public void evenInputLength(){
        String result = "";
        Mirror m = new Mirror();
        result = m.mirrorEnds("abcddcba");

        Assertions.assertEquals("abcddcba", result);
    }

    @Test
    public void evenInputLength2(){
        String result = "";
        Mirror m = new Mirror();
        result = m.mirrorEnds("abcXYcba");

        Assertions.assertEquals("abc", result);
    }

    @Test
    public void unevenInputLength(){
        String result = "";
        Mirror m = new Mirror();
        result = m.mirrorEnds("abcdcba");

        Assertions.assertEquals("abcdcba", result);
    }
}
