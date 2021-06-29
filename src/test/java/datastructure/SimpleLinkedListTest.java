package datastructure;

import org.hamcrest.Matchers;
import org.junit.Test;
import sunbeamPractical.Singer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class SimpleLinkedListTest {
    @Test
    public void reverseOfNode() {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add(10);
        simpleLinkedList.add(20);
        simpleLinkedList.add(30);
        simpleLinkedList.add(40);
        /*simpleLinkedList.add(50);
        simpleLinkedList.add(60);*/
        System.out.println(simpleLinkedList);
        simpleLinkedList.reverseNodes();
        System.out.println(simpleLinkedList);
       // assertThat(simpleLinkedList.reverseNodes(1).data, is(40));

      /*  assertThat(simpleLinkedList.get(2), is(30));
        assertThat(simpleLinkedList.get(3), is(20));
        assertThat(simpleLinkedList.get(4), is(10));*/
    }
}

        //10--20--30
     /*   @Test
        public void add () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.add(40);
            assertThat(simpleLinkedList.get(0), is(10));
            assertThat(simpleLinkedList.get(1), is(20));
            assertThat(simpleLinkedList.get(2), is(30));
            assertThat(simpleLinkedList.get(3), is(40));
        }
        @Test
        public void getNthFromLast () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.add(40);
            simpleLinkedList.add(50);
            simpleLinkedList.add(60);
            assertThat(simpleLinkedList.getNthNodeFromLast(3).data, is(40));
            assertThat(simpleLinkedList.getNthNodeFromLast(1).data, is(60));
            //10--->20-->30-->40-->50-->60  prev=null curr=10 nextNode 20
            //10<---20<--30<--40<--50<--60 (head)      prev=10   cur=20 next=30
            //60-->50-->40-->30-->20-->10
            //prevNode currNode nextNode

            //
        }

        @Test
        public void remove () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.removeLast();
        }

        @Test
        public void remove1 () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.removeLast();
            assertThat(simpleLinkedList.get(0), is(10));
            assertThat(simpleLinkedList.get(1), is(20));
            boolean isException = false;
            try {
                assertThat(simpleLinkedList.get(2), is(30));
            } catch (NullPointerException e) {
                isException = true;
            }
            assertThat(isException, is(true));

            // simpleLinkedList.add(30);
        }

        @Test(expected = NullPointerException.class)
        public void remove_exception () {
            SimpleList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.removeLast();
            simpleLinkedList.get(2);
        }

        @Test
        public void remove2 () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.removeLast();
            LinkNode<Integer> node = simpleLinkedList.getNode(1);
            assertThat(node.data, is(20));
            assertThat(node.next, Matchers.nullValue());
        }

        @Test
        public void remove_object () {
            SimpleLinkedList<Singer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(new Singer("arijit"));
            simpleLinkedList.add(new Singer("amal"));
            simpleLinkedList.add(new Singer("arman"));
            simpleLinkedList.add(new Singer("neha Kakkar"));

            simpleLinkedList.remove(new Singer("arman"));
            LinkNode<Singer> node = simpleLinkedList.getNode(2);
            System.out.println(simpleLinkedList);
            assertThat(simpleLinkedList.get(0).getName(), is("arijit"));
            assertThat(simpleLinkedList.get(1).getName(), is("amal"));
            assertThat(simpleLinkedList.get(2).getName(), is("neha Kakkar"));
            //getnode.next
        }
        @Test
        public void remove_position () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.add(40);//
            simpleLinkedList.add(50);
            simpleLinkedList.add(60);
            simpleLinkedList.remove(3);
            // LinkNode<Integer> node=simpleLinkedLi
            // st.get();
            assertThat(simpleLinkedList.get(0), is(10));
            assertThat(simpleLinkedList.get(1), is(20));
            assertThat(simpleLinkedList.get(2), is(30));
            assertThat(simpleLinkedList.get(3), is(50));
            assertThat(simpleLinkedList.get(4), is(60));

            // assertThat(node.data,is(60));
            //assertThat(node.next, Matchers.nullValue());
        }
        @Test
        public void add_position () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.add(50);
            simpleLinkedList.add(2, 40);
            System.out.println(simpleLinkedList);
            assertThat(simpleLinkedList.get(0), is(10));
            assertThat(simpleLinkedList.get(1), is(20));
            assertThat(simpleLinkedList.get(2), is(40));
            assertThat(simpleLinkedList.get(3), is(30));
            assertThat(simpleLinkedList.get(4), is(50));
        }
        @Test
        public void add_positionAtZero () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.add(50);
            simpleLinkedList.add(0, 40);
            System.out.println(simpleLinkedList);
            assertThat(simpleLinkedList.get(0), is(40));
            assertThat(simpleLinkedList.get(1), is(10));
            assertThat(simpleLinkedList.get(2), is(20));
            assertThat(simpleLinkedList.get(3), is(30));
            assertThat(simpleLinkedList.get(4), is(50));
        }
        @Test
        public void add_positionAtOne () {
            SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
            simpleLinkedList.add(10);
            simpleLinkedList.add(20);
            simpleLinkedList.add(30);
            simpleLinkedList.add(50);
            simpleLinkedList.add(1, 40);
            System.out.println(simpleLinkedList);
            assertThat(simpleLinkedList.get(0), is(10));
            assertThat(simpleLinkedList.get(1), is(40));
            assertThat(simpleLinkedList.get(2), is(20));
            assertThat(simpleLinkedList.get(3), is(30));
            assertThat(simpleLinkedList.get(4), is(50));
        }
    }
}*/
