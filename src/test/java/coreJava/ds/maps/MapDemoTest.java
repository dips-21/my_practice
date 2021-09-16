package coreJava.ds.maps;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MapDemoTest {
    MapDemo mapDemo = new MapDemo();

    @Test
    public void getMapping() {
        assertThat(mapDemo.getRequestMapping("/question", "GET"), is("qstnController.getQsts()"));
    }

    @Test
    public void getMapping_01() {
        assertThat(mapDemo.getRequestMapping("/question", "POST"), is("qstnController.save"));
    }

    @Test
    public void getMissing() {
        assertThat(mapDemo.getRequestMapping("/question", "DELETE"), is("405-method-not-allowed"));
    }

    @Test
    public void getMapping_02() {
        assertThat(mapDemo.getRequestMapping("/exam", "DELETE"), is("examController.End()"));
    }

    @Test
    public void getMapping_03() {
        assertThat(mapDemo.getRequestMapping("/score", "DELETE"), is("score_delete()"));
    }
    @Test
    public void getMapping_not_found() {
        assertThat(mapDemo.getRequestMapping("/student", "DELETE"), is("404-not-found"));
    }
}