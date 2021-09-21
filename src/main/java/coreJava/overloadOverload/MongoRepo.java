package coreJava.overloadOverload;

import coreJava.abstraction.Man;
import coreJava.abstraction.Person;
import coreJava.abstraction.Women;

public class MongoRepo implements SqlRepo {
    String db = "MongoDb";

    @Override
    public String addUser(Person p) {
        String msg = "Person to " + db;
       System.out.println(msg);
        return msg;
    }

    @Override
    public String addUser(Man men) {
        String msg = "Man to " + db;
        System.out.println(msg);
        return msg;
    }

        @Override
        public String addUser (Women women){
            String msg = "women to " + db;
            System.out.println(msg);
            return msg;
        }
    }

