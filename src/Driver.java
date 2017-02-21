/**
 * Created by Shantanu Johri on 21-02-2017.
 */
public class Driver {

public static void main(String args[]){
    int[][][] data = Perceptron.data;
    double[] weights = Perceptron.INITIAL_WEIGHTS;
    Driver driver = new Driver();
    Perceptron perceptron = new Perceptron();
    boolean errorFlag = true;
    double error = 0.0;
    while(errorFlag){
        for(int i = 0; i< data.length; i++){
            double weightedSum = perceptron.calculatedWeightedSum(data[i][0], weights);
            int result = perceptron.applyActivationFunction(weightedSum);
            error = data[i][1][0] - result;
        }
    }
}
}
