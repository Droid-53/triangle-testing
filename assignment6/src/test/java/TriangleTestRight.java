import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestRight {
    Triangle t1 = new Triangle(3, 4, 5);
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
        assertEquals(expectedTrue, t1.isRight());
    }

    @Test
    void isScaleneTest() {
        assertEquals(expectedTrue, t1.isScalene());
    }

    @Test
    void isIsoscelesTest() {
        assertEquals(expectedFalse, t1.isIsosceles());
    }

    @Test
    void isEquilateralTest() {
        assertEquals(expectedFalse, t1.isEquilateral());

    }

    @Test
    void computeTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        t1.compute(5,5,5);
        String answer = "Right";
        assertEquals(answer, outContent.toString());
    }

    @Test
    void getAreaTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        t1.getArea(3,4,5);
        String answer = "6.0";
        assertEquals(answer, outContent.toString());
    }


}