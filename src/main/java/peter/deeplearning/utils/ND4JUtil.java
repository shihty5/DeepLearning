package peter.deeplearning.utils;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class ND4JUtil {
    public static void array() {
        INDArray x = Nd4j.create(new double[]{1, 2, 3, 4, 5}, new int[]{3, 2});
        System.out.print(x);
    }
}
