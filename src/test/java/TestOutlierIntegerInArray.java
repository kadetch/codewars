import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

public class TestOutlierIntegerInArray {

    @Test
    public void test() {
        findOddInteger();
        findEvenInteger();
    }

    private void findOddInteger() {
        // The Odd Outlier Integer in array
        List<Integer> outlierIntegerForFind = new ArrayList<>();
        outlierIntegerForFind.add(2);
        outlierIntegerForFind.add(4);
        outlierIntegerForFind.add(6);
        outlierIntegerForFind.add(8);
        outlierIntegerForFind.add(9);
        outlierIntegerForFind.add(10);
        outlierIntegerForFind.add(100);
        outlierIntegerForFind.add(150);
        outlierIntegerForFind.add(156);

        assertEquals("The array has the odd outlier integer",
                (long) 9,
                (long) new OutlierIntegerInArray().getOutlier(outlierIntegerForFind));
    }

    private void findEvenInteger() {
        // The Odd Outlier Integer in array
        List<Integer> outlierInteger = new ArrayList<>();
        outlierInteger.add(1);
        outlierInteger.add(3);
        outlierInteger.add(5);
        outlierInteger.add(7);
        outlierInteger.add(9);
        outlierInteger.add(11);
        outlierInteger.add(101);
        outlierInteger.add(155);
        outlierInteger.add(159);
        outlierInteger.add(200);
        Integer even =  new OutlierIntegerInArray().getOutlier(outlierInteger);
        assertEquals("The array has the even outlier integer", (long) 200, (long) even);
    }

    @Test
    public void ArrayIsIncorrect(){
        List<Integer> outlierInteger = new ArrayList<>();
        outlierInteger.add(1);
        outlierInteger.add(3);
        assertEquals("The array has the incorrect size", (long) -1, (long) new OutlierIntegerInArray().getOutlier(outlierInteger));
    }

    @Test
    public void ArrayHaveNotOutlier(){
        List<Integer> outlierInteger = new ArrayList<>();
        outlierInteger.add(1);
        outlierInteger.add(3);
        outlierInteger.add(5);
        outlierInteger.add(7);
        outlierInteger.add(3111111);
        assertNull("The array has not the outlier integer", (Object) new OutlierIntegerInArray().getOutlier(outlierInteger));
    }
}
