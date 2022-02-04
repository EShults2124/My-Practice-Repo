import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SayHelloTest {

    @Test
    public void testSayHello() {

        assertEquals("Hello World!", SayHello.helloWorld()); // will succees

    }

}
