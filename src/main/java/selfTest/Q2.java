package selfTest;
class Alien {
    String invade(short ships) {
        return "a few";
    }

    String invade(short... ships) { //var args ships[] can take one or more arguments
        for (short i:ships) {
            System.out.println("item "+i);
        }
        return "many";
    }
}


    class Q2 {
        public static void main(String [] args) {
           /* long m=7l;
            int i=(int)m;
            int j=8;
            long n=j;*/
            //System.out.println(new Alien().invade((short) 7,(short) 6,(short) 8));
            System.out.println(new Alien().invade((short) 7));
        }
}


