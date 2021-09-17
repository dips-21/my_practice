package coreJava.ds.maps;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RequestMappingLinearTest {
    RequestMappingLinear requestMapping = getRequestMapping();

    protected RequestMappingLinear getRequestMapping() {
        return new RequestMappingLinear();
    }

    @Test
    public void getMapping() {
        assertThat(requestMapping.getRequestMapping("/question", "GET"), is("qstnController.getQsts()"));
    }

    @Test
    public void getMapping_01() {
        assertThat(requestMapping.getRequestMapping("/question", "POST"), is("qstnController.save"));
    }

    @Test
    public void getMissing() {
        assertThat(requestMapping.getRequestMapping("/question", "DELETE"), is("405-method-not-allowed"));
    }

    @Test
    public void getMapping_02() {
        assertThat(requestMapping.getRequestMapping("/exam", "DELETE"), is("examController.End()"));
    }

    @Test
    public void getMapping_03() {
        assertThat(requestMapping.getRequestMapping("/score", "DELETE"), is("score_delete()"));
    }
    @Test
    public void getMapping_not_found() {
        assertThat(requestMapping.getRequestMapping("/student", "DELETE"), is("404-not-found"));
    }
}