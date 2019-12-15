package uebung1;

class FactorialWhileLoop {

    public static void main(String[] args) {

        int number = 5 ;
        long fac = 1 ;
        int i = 1 ;

        while ( i <= number) {

            fac = fac * i ;
            i ++ ;

        }

        System.out.println(fac);
    }
}
