package coreJava.abstraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class PersonTest {
String sql="insert into users where name=%s and hobby=%s";
   @Test
   public void add01(){
       Person p = new Child("", 5, "");
       //new PersonTest().addUser(p);
   }

    @Test
    public void add02(){
        Child p = new Child("", 5, "");
        addUser(p); // based on parameter type , that will be on compile time type overloading
    }
    @Test
    public void add_woman(){
        Person p = new Women("dips", 25, "sitting at an angle");
        this.addUser(p);
    }

    @Test
    public void getHobby(){
        Person p = new Women("dips", 25, "watch");
        assertThat(getCostHobby(p),is(320));
        p = new Child("dips", 25, "watch");
       assertThat(getCostHobby(p),is(50));

    }

    void addUser(Person p){ //with abstraction ,compile time type is person but run time type can be man,woman,child
        String q = String.format(sql, p.getName(), p.getHobby()); //p.getHobby overriding on run time type of p
        System.out.println("person "+q);
    }

    void addUser(Child p){ //with abstraction ,separate for man
        String q = String.format(sql, p.name, p.hobby);
        System.out.println(q);
    }
    void addUser(Women p){ //with abstraction ,separate for man
        String q = String.format(sql, p.name, p.hobby);
        System.out.println(q);
    }

    int getCostHobby(Person person){
       int fixedCost=10;
       int p= person.getHobby().length(); //f3()
        addUser(person); //f13()
       return p*fixedCost;
    }


}