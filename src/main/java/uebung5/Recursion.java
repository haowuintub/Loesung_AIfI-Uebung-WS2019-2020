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
        if (n == 1) {
            return 1;
        } else {
            return factorialRecursive(n - 1) * n;
        }
    }




//     Recursive Factorial (with comments for individual steps)

//    static long factorialRecursive(long n) {
//        System.out.println(" calling factorialRecursive(" + n + ")");
//        if (n == 1) {
//            System.out.println("factorialRecursive(" + n + ") = 1");
//            return 1;
//        } else {
//            long ll = factorialRecursive(n - 1) * n;
//            System.out.println("factorialRecursive(" + n + ") = " + ll);
//
//            return ll;
//        }
//    }

}
