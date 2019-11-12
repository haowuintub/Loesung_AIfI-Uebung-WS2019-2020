package uebung5;

class Recursion {

    public static void main(String[] args) {

        long n = 5 ;

        long facIterative = factorialIterative(n);
        System.out.println(n + "! (iterative) = " + facIterative);

        long facRecursive = factorialRecursive(n);
        System.out.println(n + "! (recursive) = " + facRecursive);

    }

    // Iterative Factorial
    static long factorialIterative(long n){
        long fac = 1 ;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }

        return fac ;
    }


    // Recursive Factorial

    static long factorialRecursive(long n) {
        if (n == 1) { //Abbruchbedingung
            return 1;
        }
     else {
            return factorialRecursive(n-1) * n ;
        }
    }

}
