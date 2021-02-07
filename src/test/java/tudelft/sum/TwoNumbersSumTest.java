package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    void addTwoNoComplement(){
        ArrayList a1 = new ArrayList();
        a1.add(3);
        a1.add(1);

        ArrayList a2 = new ArrayList();
        a2.add(6);
        a2.add(2);

        ArrayList result = new ArrayList();
        ArrayList expectResult = new ArrayList();
        expectResult.add(9);
        expectResult.add(3);
        TwoNumbersSum tns = new TwoNumbersSum();
        result = tns.addTwoNumbers(a1, a2);

        Assertions.assertEquals(expectResult, result);
    }

    @Test
    void addTwoOneComplement(){
        ArrayList a1 = new ArrayList();
        a1.add(3);
        a1.add(5);

        ArrayList a2 = new ArrayList();
        a2.add(4);
        a2.add(7);

        ArrayList result = new ArrayList();
        ArrayList expectResult = new ArrayList();
        expectResult.add(8);
        expectResult.add(2);
        TwoNumbersSum tns = new TwoNumbersSum();
        result = tns.addTwoNumbers(a1, a2);

        Assertions.assertEquals(expectResult, result);
    }

    @Test
    void addTwoExtraDigit(){
        ArrayList a1 = new ArrayList();
        a1.add(7);
        a1.add(5);

        ArrayList a2 = new ArrayList();
        a2.add(4);
        a2.add(7);

        ArrayList result = new ArrayList();
        ArrayList expectResult = new ArrayList();
        expectResult.add(1);
        expectResult.add(2);
        expectResult.add(2);
        TwoNumbersSum tns = new TwoNumbersSum();
        result = tns.addTwoNumbers(a1, a2);

        Assertions.assertEquals(expectResult, result);
    }
}
