package coreJava.oops;

public class Polymorphism {

    public interface Animatable {
        public void animate();
    }


   static class PlayerPiece extends GameShape implements Animatable {
        public void movePiece() {
            System.out.println("moving game piece");
        }

        public void animate() {
            System.out.println("animating...");
        }   // more code
    }

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        PlayerPiece player = new PlayerPiece();
        Object o = player;
        GameShape shape = player;
        Animatable mover = player;
    }
}