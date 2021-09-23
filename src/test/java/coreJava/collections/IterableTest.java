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
        List<String> feeds = Arrays.asList("one", "two", "three");
        return feeds;
    }

    class InfiniteScrollable implements Iterable<String> {

        @Override
        public Iterator<String> iterator() {
            return null;
        }
    }


}
