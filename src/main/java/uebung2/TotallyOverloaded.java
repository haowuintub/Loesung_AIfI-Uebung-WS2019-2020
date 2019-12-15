package uebung2;

public class TotallyOverloaded {

    public static void main(String[] args) {
        int num1 = 17 ;
        int num2 = 12 ;
        double pi = Math.PI ;
        double d = 5.3E2 ;
        // Aufgabe 1: Was erzeugt die folgende Ausgabe (inkl. Datentyp)?
        System.out.println(add(num1, num2));
        // Ausgabe 2: Was erzeugt die folgende Ausgabe (inkl. Datentyp)?
        System.out.println(add(num1));
        // Ausgabe 3: Was erzeugt die folgende Ausgabe (inkl. Datentyp)?
        System.out.println(add(pi, d));
        // Bonus: Was erzeugt die folgende Ausgabe (inkl. Datentyp)?
        System.out.println(add(add(add(3) + add(4,5),2), 6.2));
    }
    static int add(int a, int b) {
        return a + b ;
    }

    static int add(int a) {
        return ++a;
    }

    static double add(double a, double b) {
        return a + b;
    }

}


