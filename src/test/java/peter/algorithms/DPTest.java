package peter.algorithms;

import org.junit.Assert;
import org.junit.Test;
import peter.algrorithms.DP;

public class DPTest {
    @Test
    public void testDP() {
        int value[] = {1, 3, 5};

        int result = DP.get(11, value, 4);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDP2() {
        int arr[] = {5, 3, 4, 8, 6, 7};
        int result = DP.getLongestIncreasingSubstringLentgh(arr);

        Assert.assertEquals(4, result);
    }

    @Test
    public void testmaxSubArray(){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max =DP.maxSubArray(arr);

        Assert.assertEquals(6, max);
    }
}
