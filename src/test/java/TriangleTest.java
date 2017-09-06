package test.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import main.java.Triangle;

/**
 * Created by rzhou on 06/09/2017.
 */
public class TriangleTest {

    private final ByteArrayOutputStream consoleLog = new ByteArrayOutputStream();
    //given
    Triangle triangle = new Triangle();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(consoleLog));
    }

    @After
    public void tearDown() throws Exception {
        consoleLog.close();
    }

    @Test
    public void should_print_one_asterisk() throws Exception {
        //when
        consoleLog.reset();
        triangle.printAsterisk();

        //then
        assertThat(consoleLog.toString(), is("*\n"));
    }

    @Test
    public void should_draw_horizontal_line_with_asterisk() throws Exception {
        consoleLog.reset();
        triangle.drawHorizontalLine(8);
        assertThat(consoleLog.toString(), is("********\n"));
    }

    @Test
    public void should_draw_vertical_line_with_asterisk() throws Exception {
        consoleLog.reset();
        triangle.drawVerticalLine(3);
        assertThat(consoleLog.toString(), is("*\n*\n*\n"));
    }
}
