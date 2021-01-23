package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void test1(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("xxggxx");

        Assertions.assertEquals(true, result);
    }

    @Test
    public void test2(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("xxgxx");

        Assertions.assertEquals(false, result);
    }

    @Test
    public void test3(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("xxggyygxx");

        Assertions.assertEquals(false, result);
    }

    @Test
    public void multipleHappy(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("xxggyyggyyggxx");

        Assertions.assertEquals(true, result);
    }

    @Test
    public void multipleUnhappy(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("xxgxgxxgxx");

        Assertions.assertEquals(false, result);
    }

    @Test
    public void noGs(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("xxyyxx");

        Assertions.assertEquals(false, result);
    }

    @Test
    public void extremelyHappy(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("xxgggxx");

        Assertions.assertEquals(true, result);
    }

    @Test
    public void gAtStart(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("gxxyyxxy");

        Assertions.assertEquals(false, result);
    }

    @Test
    public void happyGatStart(){
        Boolean result = false;
        GHappy m = new GHappy();
        result = m.gHappy("ggxyxyxyx");

        Assertions.assertEquals(true, result);
    }
}
