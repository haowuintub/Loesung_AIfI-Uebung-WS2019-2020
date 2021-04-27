package uebung2_2;

public class BinomialCoefficientRefactored {

    public static void main(String[] args) {
        int n = 29;
        int k = 6;

        double ans = calcBinomialCoefficient(n, k);
        System.out.println("The Binomial Coefficient of " + n + " over " + k + " is " + ans);
    }

    private static double calcBinomialCoefficient(int n, int k) {
        double binomialCoefficient = calcFact(n) / (calcFact(k) * calcFact(n - k));
        return binomialCoefficient;
    }

    private static double calcFact(int basis) {
        double fac = 1.0 ;
        for (int i = 1; i <= basis; i++) {
            fac = fac * i;
        }
        return fac;
    }
}
