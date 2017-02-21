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
    double[] adjustedWeights = null;
    while(errorFlag){
        errorFlag = false;
        error = 0;
        for(int i = 0; i< data.length; i++){
            double weightedSum = perceptron.calculatedWeightedSum(data[i][0], weights);
            int result = perceptron.applyActivationFunction(weightedSum);
            error = data[i][1][0] - result;
            if(error != 0.0){
                errorFlag = true;
            }
            adjustedWeights = perceptron.adjustWeights(data[i][0], weights, error);
            System.out.println(" " + weights[0] + " | " + weights[1] + " " + data[0][0] + data[0][1] + data[1][0] +"  >  " + result + "  " + error);
            weights = adjustedWeights;
        }
    }
}
}
