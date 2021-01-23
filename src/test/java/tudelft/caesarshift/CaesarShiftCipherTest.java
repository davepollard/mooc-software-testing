package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void onlyLetters(){
        String result = "";
        CaesarShiftCipher c = new CaesarShiftCipher();
        result = c.CaesarShiftCipher("abc", 1);

        Assertions.assertEquals("bcd", result);
    }

    @Test
    public void letterAndSpace(){
        String result = "";
        CaesarShiftCipher c = new CaesarShiftCipher();
        result = c.CaesarShiftCipher("abc abc", 1);

        Assertions.assertEquals("bcd bcd", result);
    }

    @Test
    public void invalidChar(){
        String result = "";
        CaesarShiftCipher c = new CaesarShiftCipher();
        result = c.CaesarShiftCipher("ab&c", 1);

        Assertions.assertEquals("invalid", result);
    }
}
