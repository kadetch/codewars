import java.util.List;

public class OutlierIntegerInArray {

    private Integer even = 0;
    private Integer countEven = 0;

    private Integer odd = 0;
    private Integer countOdd = 0;

    public Integer getOutlier(List<Integer> arrayForSearch) {
        if (arrayForSearch.size() < 3) return -1;
        isEvenOrOdd(arrayForSearch);
        return (countEven == 1 || countOdd == 1) ?
                ((countEven == 1) ? even : odd) : null;
    }

    private void isEvenOrOdd(List<Integer> inputArray) {
        for (Integer intJ : inputArray) {
            if ((intJ & 1) == 0) {
                countEven++;
                even = intJ;
            } else {
                countOdd++;
                odd = intJ;
            }
        }
    }
}
