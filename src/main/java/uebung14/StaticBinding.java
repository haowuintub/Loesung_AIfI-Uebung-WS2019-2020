package uebung14;

public class StaticBinding {

    private static int add(int a, int b) {
        int answer = a + b ;
        System.out.println(a + " + " + b + " = " + answer);
        return answer ;
    }

    private static int add(int a) {
        int answer = a + 1;//a++, ++a
        System.out.println(a + " + 1 = " + answer);
        return answer;
    }

    private static double add(double a, double b) {
        double answer = a + b ;
        System.out.println(a + " + " + b + " = " + answer);
        return answer ;
    }

    public static void main(String[] args) {
        // Static Binding! Binding between method call and method definition occurs at compile time (early binding)
        // An example for this occurs in Method Overloading
        add(4, 6);
        add(100);
        add(2.0, 9000.);

    }

}
