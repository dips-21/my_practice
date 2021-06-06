package interfaceDemo;

import java.util.List;

interface Drawable {
    void draw();
}

interface Printable {
    void print();
}


class WordDocument implements Printable {

    @Override
    public void print() {
        System.out.println("Printing word document");
    }
}

class PaintFile implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing ");
    }
}


 class Shape implements Printable, Drawable {
    @Override
    public void draw() {
        System.out.println("drawing shape");
    }

    @Override
    public void print() {
        System.out.println("printing shape");
    }

}

class PrintDrawable{
    int i;
    //static  int j=0;

    public static void main(String[] args) {
       Printable printable=new WordDocument();
       printable.print();
      Drawable drawable=new PaintFile();
      drawable.draw();

     Shape s1=new Shape();
      s1.print();
      s1.draw();

      Drawable d1=new Shape();
      d1.draw();

      Printable p=new Shape();
      p.print();


//        System.out.println(p.i);
//        System.out.println(PrintDrawable.j);
    }
    //Shape s=new Shape()
    //s.draw()
    //PaintFile pf=new PaintFile();
    //pf.draw()
    void drawAll(List<Drawable> drawableList){
        for (Drawable d:drawableList){
            d.draw();
        }
    }
}


