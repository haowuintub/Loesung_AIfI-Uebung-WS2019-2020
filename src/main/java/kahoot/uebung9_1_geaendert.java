package kahoot;

public class uebung9_1_geaendert {
        static double x = 1.0;
        public static void main(String[ ] args) {
//            double x = 1.0;
            add5(x);
            System.out.println(x);
            x = add10(x);
            System.out.println(x);
        }
        private static void add5(double a) {
            x = 5.0 + a;
        }
        private static double add10(double x) {
            x = 10.0 + x;
            return x;
        }
    }
