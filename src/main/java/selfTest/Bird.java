package selfTest;

public class Bird {
    {
        System.out.println("bird initialiser block ");
    }

    static { //initialiser block
        System.out.println("bird staic initialiser block 1");
    }
    public Bird() {
        System.out.println("bird ctor ");
    }
}

class Raptor extends Bird {
    static {
        System.out.println("raptor static initialiser block 1  ");
    }

    public Raptor() {
        System.out.println("raptor constructor");
    }

    {  //initialiser block
        System.out.println("raptor initialiser block ");
    }

    static { //initialiser block
        System.out.println("raptor staic initialiser block 2");
    }
}
//static block runs first on class load (First time it is referred) and only runs once.
//Hawk.main() , parent constructor or intialiser blocks will run before child
class Hawk extends Raptor {
    Hawk(){
        System.out.println("Hawk ctor");
    }
    public static void main(String[] args) {
        System.out.println("pre ");
        new Hawk();
        System.out.println("=========================");
        new Hawk();
        System.out.println("hawk ");
    }
}
