public class Helper {
   /* private int data;

    private Helper() {
        data = 5;
    }*/

    public static class Test {
   /*     public static void main(String[] args) {
            Helper helper=new Helper();
            System.out.println(helper.data);
        }
    }*/

       /* static Test t;
        static  int count=0;

        public static void main(String[] args) throws  InterruptedException{
            Test t1=new Test();
            t1=null;
            System.gc();
            Thread.sleep(1000);
            t=null;
            Test t2=new Test();
            t1=null;
            System.gc();
            Thread.sleep(1000);
            System.out.println("finalize method called"+count+"times");
        }
        @Override
        protected void finalize(){
            count++;
            t=this;
        }*/

        public Test(int i){
            System.out.println("1");
            new Test(10);


        }
    }
}