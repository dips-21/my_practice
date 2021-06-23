package coreJava.iostream.tourism;
import java.io.*;
public class SiteObjectStore {
        public boolean persist(Site site) {
            try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(site.name + ".store"))){
                output.writeObject(site); //serialization
                return true;
            }catch(Exception e){
                return false;
            }
        }
        //deserialiazation
        public Site fetch(String name) {
            try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(name + ".store"))){
                return (Site) input.readObject(); //deserialization
            }catch(Exception e){
                return new Site(name);
            }
        }
    }

