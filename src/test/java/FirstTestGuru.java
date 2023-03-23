import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTestGuru {

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
    }


    @Test
    void secondTest() {
        Assertions.assertTrue(3 > 1);
    }
}