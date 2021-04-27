package kahoot;

public class uebung9_1 {
    public static void main(String[ ] args) {
        double x = 1.0;
        add5(x);
        System.out.println(x);
        x = add10(x);
        System.out.println(x);
    }
        private static void add5(double x) {
            x = 5.0 + x;
        }
            private static double add10(double x) {
                x = 10.0 + x;
                return x;
            }
}
