package coreJava.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class XmlConverter {
    void writeXml(Object object) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = object.getClass();
        Field[] fieldArray = clazz.getDeclaredFields();
        for (Field f : fieldArray) {
            System.out.println("<" + f.getName() + ">");
            System.out.println(f.get(object));
            System.out.println("</" + f.getName() + ">");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
                //  m.invoke(object,"good evening");
            }
           Method m = clazz.getDeclaredMethod("sayHello", String.class);
           m.invoke(object, "where there is");



        }
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student s2 = new Student("ashu", 20, 5);
        new XmlConverter().writeXml(s2);
    }
}
