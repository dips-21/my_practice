package exceptions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

public class InstagramFeedTest {


    @Test
    public void getPost() throws UnAuthorizedException {    //checked
        InstagramFeed instagramFeed = new InstagramFeed("dips", new Configuration());
        assertThat(instagramFeed.getPost("dips"),is("feeds"));
    }

}