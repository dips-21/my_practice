package coreJava.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterableTest {
    @Test
    public void iteratableTest() {
        Iterable<String> facebookFeed = getFacebookFeeds();
        Iterator<String> iterator = facebookFeed.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

    }

  /*  List<String> getFacebookFeeds(){ //this exposes size of list ,get ,add ,allows to get any element
        return null;
    }*/

    Iterable<String> getFacebookFeeds() { //this exposes size of list ,get ,add ,allows to get any element
        return new FaceboookFeed();
    }

    class FaceboookFeed implements Iterable<String> {

        @Override
        public Iterator<String> iterator() {
            return new ScrollingIterator();
        }
        class ScrollingIterator implements Iterator<String>{
            String postId;
            final int batchSize=50;

            @Override
            public boolean hasNext() {
                //select from where postId>{postId}
                return false;
            }

            @Override
            public String next() {
               String sql= "select from where postId>{postId}";
               //facebook.com/posts?fromId=postId &batchSize=50
               //facebook.com/posts/{postId}?batchSize=50
               //query.execute(sql);
                String[] records={"g1","g2","g3","g4","g5"};
                postId="g5";
                return null;
            }
        }
    }



}
