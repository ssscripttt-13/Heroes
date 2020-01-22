import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FooTest {
    @Test
    void constructor() {
        int number = 7;
        Foo f = new Foo(number);

        assertEquals(number, f.getNumber(), "bad constructor");
    }
}
