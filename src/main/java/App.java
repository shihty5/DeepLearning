import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class App {
    public static void main(String args[]) {
        System.out.print("Hello!");
        INDArray nd = Nd4j.create(new float[]{1, 2, 3, 4}, new int[]{2, 2});
        INDArray x = Nd4j.create(new double[]{1, 2, 3, 4, 5, 6}, new int[]{3, 2});
        System.out.print(x);
    }
}
