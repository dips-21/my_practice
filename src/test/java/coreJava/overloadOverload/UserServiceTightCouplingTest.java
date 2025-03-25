package coreJava.overloadOverload;

import coreJava.abstraction.Man;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UserServiceTightCouplingTest {

    @Test
    public void addUser() {
        MySqlRepo mySqlRepo = new MySqlRepo();
        Man p = new Man("dipak", 23, "laugh");
        UserServiceTightCoupling userService = new UserServiceTightCoupling(mySqlRepo);
        assertThat(userService.addUser(p), is("person to mySql"));

    }

   @Test  // (tight coupling -if we change in one class then other class affected by it.)
    public void addUserMongoRepo() {
        SqlRepo sqlRepo = new MongoRepo();
        Man p = new Man("dipak", 23, "laugh");
      //  UserServiceTightCoupling userService = new UserServiceTightCoupling(sqlRepo);    //tight coupling
      //loose coupling
       UserService userService=new UserService(sqlRepo);
        assertThat(userService.addUser(p), is("person to MongoDb"));

       MySqlRepo mySqlRepo = new MySqlRepo();
       userService=new UserService(mySqlRepo);
       assertThat(userService.addUser(p), is("person to MongoDb"));
    }
    @Test  // (tight coupling -if we change in one class then other class affected by it.)
    public void sqlRepoName() {
        SqlRepo sqlRepo = new MongoRepo();
        SqlRepo.repoName();

    }
}