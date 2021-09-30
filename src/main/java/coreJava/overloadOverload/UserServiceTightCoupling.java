package coreJava.overloadOverload;

import coreJava.abstraction.Person;

public class UserServiceTightCoupling {
    MySqlRepo repo;
    UserServiceTightCoupling(MySqlRepo repo){
        this.repo=repo;
    }

    String addUser(Person p){
        return repo.addUser(p);
    }
}
