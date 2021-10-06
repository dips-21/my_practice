package coreJava.overloadOverload;

import coreJava.abstraction.Man;
import coreJava.abstraction.Person;
import coreJava.abstraction.Women;

public interface SqlRepo {

    String addUser(Person p);

    String addUser(Man men);

    String addUser(Women women);     //three overloaded versions

    static String repoName() {
        return "default-name";
    }
}
