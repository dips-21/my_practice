package testInterview;

public class Initializer {
    static{
        System.out.println("1");
    }
    private Initializer(){
        System.out.println("2");
    }
    {
        System.out.println("3");
    }

    public static void main(String[] args) {
        new Initializer();
    }
}
