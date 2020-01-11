package uebung11;

public class ExceptionsExample {

    public static void main(String[] args) {

        try {
            System.out.println(divide(9, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(divide1(9,5));

        System.out.println(divide2(9, 5));


    }


    // Checked Exception - Caught in main
    private static int divide(double a, double b) throws Exception {
        int c = (int) (a / b);
        double d = a / b;

        if (c != d) {
            throw new Exception(); // Checked Exception
        }

        return c;
    }

    // Checked Exception - Caught in divide1
    private static int divide1(double a, double b) {
        int c = (int) (a / b);
        double d = a / b;
        try {
            if (c != d) {
                throw new Exception(); // Checked Exception
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return c;
    }


    // Unchecked Exception (Runtime Exception) - Does not need to be caught
    private static int divide2(double a, double b) {
        int c = (int) (a / b);
        double d = a / b;

        if (c != d) {
            throw new RuntimeException(); // Unchecked Exception
        }

        return c ;
    }



}
