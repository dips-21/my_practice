package exceptions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

public class ConfigurationTest {

    Configuration configuration = new Configuration();

    @Test
    public void addPermission() {
        configuration.addPermission("dips", "jack");
        configuration.addPermission("dips", "john");
        configuration.addPermission("ron", "dips");
        configuration.addPermission("jill", "dips");
        configuration.addPermission("dips", "rina");
        assertThat(configuration.hasPermission("dips", "jack"), is(true));
        assertThat(configuration.hasPermission("dips", "jill"), is(false));
    }


}