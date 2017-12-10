package peter.algrorithms;

public class DP {
    /**
     * LeetCode 53. Maximum Subarray
     */
    public static int maxSubArray(int[] A) {
        int[] result = new int[A.length];
        int max = A[0];
        result[0] = A[0];

        for (int i = 1; i < A.length; i++) {

            if (result[i - 1] > 0) {
                result[i] = result[i - 1] + A[i];
            } else {
                result[i] = A[i];
            }
            max = Math.max(max, result[i]);
        }

        return max;
    }

    /**
     * 硬币问题
     *
     * @param length
     * @param value
     * @param index
     * @return
     */
    public static int get(int length, int value[], int index) {
        int min[] = new int[length];
        min[0] = 0;
        for (int i = 1; i < min.length; i++) {
            min[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < value.length; j++) {
                if (value[j] <= i && min[i - value[j]] + 1 < min[i]) {
                    min[i] = min[i - value[j]] + 1;
                }
            }
        }

        return min[index];
    }

    /**
     * 最长上升子序列长度
     *
     * @param arr
     * @return
     */
    public static int getLongestIncreasingSubstringLentgh(int arr[]) {

        int result[] = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    result[i] = result[j] + 1;
                }
            }
        }

        int maxLength = 1;

        for (int eachResult : result) {
            if (eachResult > maxLength) {
                maxLength = eachResult;
            }
        }

        return maxLength;
    }
}
