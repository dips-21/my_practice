package coreJava.interfacese_lf_test;

public class q3 {
}

    class Clidder {
        private final void flipper() {
            System.out.println("Clidder");
        }
    }

     class Clidlet extends Clidder {
        public final void flipper() {
            System.out.println("Clidlet");
        }

        public static void main(String[] args) {
            new Clidlet().flipper();
        }
    }
