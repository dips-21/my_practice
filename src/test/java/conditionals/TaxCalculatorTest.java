package conditionals;


import org.junit.Test;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class TaxCalculatorTest {

    @Test
    public void getTax(){
        double tax=TaxCalculator.getTax(15000,25);
        assertThat(tax,is(0.0));
    }


    @Test
    public void getTaxForMiddleSlab(){
        double tax=TaxCalculator.getTax(300000,25);
        assertThat(tax,is(45000.0));
    }

    @Test
    public void getTaxForMiddleSlabForSeniorCitizen(){
        double tax=TaxCalculator.getTax(300000,65);
        assertThat(tax,is(45000.0));
    }

    @Test
    public void getTaxForMiddleSlabForSeniorCitizen_01(){
        double tax=TaxCalculator.getTax(600000,65);
        assertThat(tax,is(90000.0));
    }

    @Test
    public void getTaxForMiddleSlab_01(){
        double tax=TaxCalculator.getTax(600000,35);
        assertThat(tax,is(120000.0));
    }

}