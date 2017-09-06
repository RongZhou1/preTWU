package test.java;

import main.java.Diamond;
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
public class DiamondTest {

    private Diamond diamond = new Diamond();
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
    public void should_draw_isosceles_triangle() throws Exception {
        consoleLog.reset();
        diamond.drawIsoscelesTriangle(3);
        assertThat(consoleLog.toString(), is("  *\n ***\n*****\n"));
    }

    @Test
    public void should_draw_diamond() throws Exception {
        consoleLog.reset();
        diamond.drawDiamond(3);
        assertThat(consoleLog.toString(), is("  *\n ***\n*****\n ***\n  *\n"));
    }

    @Test
    public void should_draw_diamond_with_name() throws Exception {
        consoleLog.reset();
        diamond.drawDiamondWithName(3, "Bill");
        assertThat(consoleLog.toString(), is("  *\n ***\nBill\n ***\n  *\n"));
    }
}
