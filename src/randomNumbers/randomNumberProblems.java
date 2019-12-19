package randomNumbers;

import java.util.*;

public class randomNumberProblems {

    // problem 1
    // given non uniform probabilities to array of numbers <a, b, c, d ...>
    // write a random generator that honors non uniform probability
    // and generates a number in the given array with the set unequal probabilities

    public static int nonuniformRandomNumberGenerator(List<Integer> numbers, List<Double> probabilities) {

        // create a continuous distribution list so that given probabilities are spread in fashion <p0, p0 + p1, ...>
        // add each sum probabilities to the list
        List<Double> prefixSumOfProbabilities = new ArrayList();

        // eg probs >> 0 + 0.5, 0.5 + 0.3 ...
        for (double p : probabilities) {
            prefixSumOfProbabilities.add((prefixSumOfProbabilities.isEmpty() ? 0 :
                    prefixSumOfProbabilities.get(prefixSumOfProbabilities.size() - 1)) + p);
        }

        // generate random number between [0, 1) using random in java
        Random random = new Random();

        // next double random value
        double val = random.nextDouble();

        // now, should assign generated random value to continuous distribution list
        // use java binary search to figure out the index
        System.out.println(val);
        System.out.println(prefixSumOfProbabilities);

        int it = Collections.binarySearch(prefixSumOfProbabilities, val);

        System.out.println(it);

        // it is most likely negative since it is very rare it can match the exact prob
        if (it < 0) {
            it = Math.abs(it) - 1;
        }

        return numbers.get(it);

    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,5,7,9));
        List<Double> probs = new ArrayList<Double>(Arrays.asList(0.3,0.3,0.2,0.2));

        System.out.println(nonuniformRandomNumberGenerator(numbers, probs));
    }
}
