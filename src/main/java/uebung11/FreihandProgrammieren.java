package uebung11;

import java.util.Arrays;
import java.util.List;

class FreihandProgrammieren {

    public static void main(String[] args) {
        List<Double> myNumbers = Arrays.asList(2.3, 5.0, 1.2, -3.4, Math.PI, 0.0);
        System.out.println("Der Durchschnitt meiner Zahlen ist: " + mean(myNumbers));

    }

    private static String mean(List<Double> myNumbers) {
        if (myNumbers.isEmpty()) {
            return "List is Empty";
        }

        Double sum = 0.;
        for (Double num : myNumbers) {
            sum += num;
        }
        Double result = sum/myNumbers.size() ;
        return  result.toString();
    }
}
