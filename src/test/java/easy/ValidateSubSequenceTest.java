package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @Date 13/04/2023
 */

class ValidateSubSequenceTest {

    @Test
    public void testValidateSubSequenceSimpleInnerArray() {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        List<Integer> innerArray = new ArrayList<>();
        innerArray.add(2);
        innerArray.add(4);

        Assertions.assertTrue(ValidateSubSequence.isValidSubsequence(array, innerArray));
    }

    @Test
    public void testValidateSubSequenceSimpleInnerArrayWrongOrder() {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        List<Integer> innerArray = new ArrayList<>();
        innerArray.add(4);
        innerArray.add(2);

        Assertions.assertFalse(ValidateSubSequence.isValidSubsequence(array, innerArray));
    }

}