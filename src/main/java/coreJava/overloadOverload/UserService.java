package coreJava.overloadOverload;

import coreJava.abstraction.Person;

public class UserService{
    SqlRepo repo;
    UserService(SqlRepo repo){
        this.repo=repo;
    }

    String addUser(Person p){
        return repo.addUser(p);
    }
}
