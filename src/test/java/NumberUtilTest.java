import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilTest {

    @Test
    public void should_3_is_divisible_by_1_and_3() {
        assertTrue(NumberUtil.isDivisible(3, 1, 3));
    }

    @Test
    public void should_12_is_divisible_by_2_and_6() {
        assertTrue(NumberUtil.isDivisible(12, 2, 6));
    }

    @Test
    public void should_100_is_not_divisible_by_5_and_3() {
        assertFalse(NumberUtil.isDivisible(100, 5, 3));
    }

    @Test
    public void should_12_is_not_divisible_by_7_and_5() {
        assertFalse(NumberUtil.isDivisible(12, 7, 5));
    }
}
