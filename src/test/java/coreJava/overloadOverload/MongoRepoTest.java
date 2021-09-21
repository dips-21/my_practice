package coreJava.overloadOverload;

import coreJava.abstraction.Man;
import coreJava.abstraction.Person;
import coreJava.abstraction.Women;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MongoRepoTest {
    /*  Explanation:-  here SqlRepo is an interface and we cant create object of it.this interface
       has two implementation MySqlRepo and MongoRepo..so we are passing MySqlRepo object to interface.
        After that i had created person object of type man.
        man is a run time type of person.
        and Person is a compile time type of person variable.
        ********
        object on which method is called is decided on runtime type of that object for eg. addUser method is present
        in both MySqlRepo and MongoRepo and in SqlRepo.
          In call s.addUser(p) based on run time type of s..
          here compile time type of s is SqlRepo and run time is MySqlRepo.
          So method will be called from Run time type of s which is MySqlRepo.
          this is  example of overriding.

        and whatever parameter we want to add is compile time type.


     */
    @Test
    public void addUser() {
        SqlRepo s = new MySqlRepo();
        Person p = new Man("me", 26, "fear");//overriding   //compile time type
        s.addUser(p); //object on which method calling is a run time type n parameter is compile time type
        addToRepo(s, p);

    }

    @Test
    public void testAddUserMySqlRepo() {
        SqlRepo sqlRepo = new MongoRepo();                   //from which class rtt
        Person person = new Man("dips", 26, "fear");//overriding
        addToRepo(sqlRepo, person);   //parameter compile time
        assertThat(sqlRepo.addUser(person), is("Person to MongoDb"));
    }

    @Test
    public void testAddUserMongoRepo() {
        SqlRepo sqlRepo = new MongoRepo();
        Man m = new Man("me", 26, "fear");//overriding
        addToRepo(sqlRepo, m);
        assertThat(sqlRepo.addUser(m), is("Man to MongoDb"));
    }

    @Test
    public void testAddUserSqlRepo() {
        SqlRepo sqlRepo = new MySqlRepo();
        Man m = new Man("me", 26, "fear");//overriding
        addToRepo(sqlRepo, m);
        assertThat(sqlRepo.addUser(m), is("Man to mysql"));
    }

    @Test
    public void testAddUserSqlRepo1() {
        SqlRepo sqlRepo = new MySqlRepo();
        Person p = new Women("me", 26, "fear");//overriding
        addToRepo(sqlRepo, p);
        assertThat(sqlRepo.addUser(p), is("Person to mysql"));
    }


    @Test
    public void testAddUserSqlRepo2() {
        SqlRepo sqlRepo = new MySqlRepo();
        Person p = new Man("me", 26, "fear");//overriding
        addToRepo(sqlRepo, p);
        assertThat(sqlRepo.addUser(p), is("Person to mysql"));
    }

    @Test
    public void testAddUserMongoRepo3() {
        SqlRepo sqlRepo = new MongoRepo();
        Man p = new Man("me", 26, "fear");//overriding


        Man p1 = new Man("me", 26, "fear");//overriding
        assertThat(addToRepo(sqlRepo, p),is("Person to MongoDb"));
        assertThat(sqlRepo.addUser(p), is("Man to MongoDb"));
    }

    @Test
    public void testAddUserSqlRepo4() {
        String s="kuch bhi";
        String s1=new String("kuch bhi");
        System.out.println(s.equals(s1));
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        SqlRepo sqlRepo = new MySqlRepo();
        Man p = new Man("me", 26, "fear");//overriding
        assertThat(addToRepo(sqlRepo, p),is("Person to mysql"));
        assertThat(sqlRepo.addUser(p), is("Man to mysql"));
    }



    String addToRepo(SqlRepo r, Person p) {
        return r.addUser(p);
    }


    @Test
    public void testAddUser1() {
    }
}