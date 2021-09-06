package coreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Casting {
    public static void main(String[] args) {
        int i=8;
        long m=9l;
        m=i;
        i= (int) m; //narrow casting
        HashMap<String,String> map=new HashMap<>();
        callMap(map);
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    private static void callMap(HashMap<String, String> map) {
        map.put("one","dips is _______________________________________________");
        takeMap(map,"one");
        if (map instanceof LinkedHashMap)
            takeLinkedHashMap((LinkedHashMap<String, String>) map,"one"); //downcasting ,unsafe  //class caste


    }


    static void takeLinkedHashMap(LinkedHashMap<String,String> s, String key){
    System.out.println("linked map has "+s.get(key));
}

    static void takeMap(Map<String,String> s, String key){
        System.out.println("map has "+ s.get(key));
    }


}