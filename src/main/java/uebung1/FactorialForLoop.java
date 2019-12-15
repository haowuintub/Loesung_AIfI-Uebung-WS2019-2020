package uebung1;

class FactorialForLoop {
    public static void main(String[] args) {

        int number = 5 ;
        long fac = 1 ;

        for (int i = 1; i <= number; i++) {

            fac *= i;

        }

        System.out.println(fac);

    }

}
