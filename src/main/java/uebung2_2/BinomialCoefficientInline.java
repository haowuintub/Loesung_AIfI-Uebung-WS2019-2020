package uebung2_2;

public class BinomialCoefficientInline {

    public static void main(String[] args) {
        int n = 49;
        int k = 6;

        double nFac = 1.0 ;
        for (int i = 1; i <= n; i++) {
            nFac = nFac * i;
        }

        double kFac = 1.0 ;
        for (int i = 1; i <= k; i++) {
            kFac = kFac * i;
        }

        double nkFac = 1.0 ;
        for (int i = 1; i <= (n - k); i++) {
            nkFac = nkFac * i;
        }

        double biCoeff = nFac / (kFac * nkFac);

        System.out.println("The Binomial Coefficient of " + n + " over " + k + " is " + biCoeff);
    }

}
