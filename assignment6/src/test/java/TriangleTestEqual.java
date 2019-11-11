import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle t1 = new Triangle(5, 5, 5);
    boolean expectedTrue = true, expectedFalse = false;

    @Test
    void isTriangleTest() {
        assertEquals(expectedTrue, t1.isTriangle());
    }

    @Test
    void isValidTest() {
        assertEquals(expectedTrue, t1.isValid());
    }

    @Test
    void isRightTest() {
        assertEquals(expectedFalse, t1.isRight());
    }

    @Test
    void isScaleneTest() {
        assertEquals(expectedFalse, t1.isScalene());
    }

    @Test
    void isIsoscelesTest() {
        assertEquals(expectedFalse, t1.isIsosceles());
    }

    @Test
    void isEquilateralTest() {
        assertEquals(expectedTrue, t1.isEquilateral());

    }

    @Test
    void computeTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        t1.compute(5,5,5);
        String answer = "Equilateral";
        assertEquals(answer, outContent.toString());
    }

    @Test
    void getAreaTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        t1.getArea(5,5,5);
        String answer = "10.825317547305483";
        assertEquals(answer, outContent.toString());
    }


}