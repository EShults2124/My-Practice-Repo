import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SayHelloTest {

    @Test
    void testSayHello() {

        assertEquals("Hello World?", SayHello.helloWorld()); // will fail

    }

}
