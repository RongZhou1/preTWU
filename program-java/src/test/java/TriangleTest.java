
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
public class TriangleTest {

    private Triangle triangle;
    private final ByteArrayOutputStream consoleLog = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();
        System.setOut(new PrintStream(consoleLog));
        consoleLog.reset();
    }

    @After
    public void tearDown() throws Exception {
        consoleLog.close();
    }

    @Test
    public void should_print_one_asterisk() throws Exception {

        triangle.printAsterisk();
        assertThat(consoleLog.toString(), is("*\n"));
    }

    @Test
    public void should_draw_horizontal_line_with_asterisk() throws Exception {

        triangle.drawHorizontalLine(8);
        assertThat(consoleLog.toString(), is("********\n"));
    }

    @Test
    public void should_draw_vertical_line_with_asterisk() throws Exception {
        triangle.drawVerticalLine(3);
        assertThat(consoleLog.toString(), is("*\n*\n*\n"));
    }
}
