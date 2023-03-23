import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

public class FirstTestGuru {

    @Test
    void firstTest() {
        Assertions.assertFalse(3 < 2);
    }

    @Test
    void secondTest() {
        Assertions.assertFalse(3 < 1);
    }
}
