package uebung1;

class InverseFactorial {

    public static void main(String[] args) {

        long fac = 1 ;

        for (int i = 1; i <= 1000; i++) {
            fac = i * fac;

            if (fac > 1000000) {
                System.out.println("i = " + i );
                break ;
            }
        }
    }
}
