package test.java;

import main.java.PrimeFactors;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rzhou on 06/09/2017.
 */
public class PrimeFactorsTest {
    private PrimeFactors primeFactors = new PrimeFactors();
    private final ByteArrayOutputStream consoleLog = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(consoleLog));
    }

    @After
    public void tearDown() throws Exception {
        consoleLog.close();
    }

    @Test
    public void should_return_empty_when_give_1() throws Exception {
        consoleLog.reset();
        primeFactors.generate(1);
        assertThat(consoleLog.toString(), is(""));
    }

    @Test
    public void should_return_itself_when_give_prime() throws Exception {
        consoleLog.reset();
        primeFactors.generate(5);
        assertThat(consoleLog.toString(), is("5"));
    }

    @Test
    public void should_return_prime_factors_when_give_non_prime() throws Exception {
        consoleLog.reset();
        primeFactors.generate(30);
        assertThat(consoleLog.toString(), is("2,3,5"));
    }
}
