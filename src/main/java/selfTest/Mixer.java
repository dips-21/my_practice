package selfTest;

public class Mixer {
        Mixer() { }
        Mixer(Mixer m) { m1 = m; }
        Mixer m1;
        public static void main(String[] args) {
            Mixer m2 = new Mixer();
            Mixer m3 = new Mixer(m2);  m3.go();    //hi
            Mixer m4 = m3.m1;          m4.go();    //hi
            Mixer m5 = m2.m1;          m5.go();   //null pass so null pointer exception
        }
        void go() { System.out.print("hi "); }
    }
