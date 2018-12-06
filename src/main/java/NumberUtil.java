public class NumberUtil {

    public static boolean isDivisible(Integer given, Integer firstDivider, Integer secondDivider) {
        if (given == null || given <= 0) return false;
        if (firstDivider == null || secondDivider == null || firstDivider == 0 || secondDivider == 0) return false;

        return given % firstDivider == 0 && given % secondDivider == 0;
    }
}
