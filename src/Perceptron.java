/**
 * Created by Shantanu Johri on 21-02-2017.
 */
public class Perceptron {
    public static final int[][][] data = {{{0, 0}, {0}}, {{0, 1}, {0}}, {{1, 0}, {0}}, {{1, 1}, {1}}};
    public static final double LEARNING_RATE = 0.05;
    public static final double[] INITIAL_WEIGHTS = {Math.random(), Math.random()};


    public double calculatedWeightedSum(int[] data, double[] weights) {
        return 0.0;
    }
    public int applyActivationFunction(double weightedSum){
        return 0;
    }
    public double[] adjustWeights(int[] data, double[] weights, double error){
        return null;
    }
}