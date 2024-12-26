import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test1CountLetters() {
        int actual = Main.countLetters("");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test2CountLetters() {
        int actual = Main.countLetters("qwerty");
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test3CountLetters() {
        int actual = Main.countLetters("aaa");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test4CountLetters() {
        int actual = Main.countLetters("1f2f3f4f5");
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test5CountLetters() {
        int actual = Main.countLetters("87*28&29jjk");
        int expected = 3;
        assertEquals(expected, actual);
    }
}
