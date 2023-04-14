package easy;

import java.util.List;
import java.util.Objects;

/**
 * @author Daniel
 * @Date 13/04/2023
 */

public class ValidateSubSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        for (Integer integer : array) {
            if (sequence.size() > 0 && Objects.equals(integer, sequence.get(0))) {
                sequence.remove(0);
            }
        }
        return sequence.size() == 0;
    }

}
