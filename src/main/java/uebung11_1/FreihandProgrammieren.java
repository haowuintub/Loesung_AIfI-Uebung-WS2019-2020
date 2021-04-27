package uebung11_1;

import java.util.Arrays;
import java.util.List;

class FreihandProgrammieren {

    public static void main(String[] args) {
        List<Double> list = Arrays.asList(2.3, 5.0, 1.2, -3.4, Math.PI, 0.0);
        System.out.println("Der Durchschnitt meiner Zahlen ist: " + mean(list));

    }

    private static String mean(List<Double> list) {
        if (list.isEmpty()) {
            return "List is Empty";
        }
        Double sum = 0.0;
        for (Double a : list) {
            sum += a;
        }
        Double result = sum / list.size();
        return result.toString();
    }
}

