import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestIsosceles {
    Triangle t1 = new Triangle(5, 5, 6);
    boolean expectedTrue = true, expectedFalse = false;

    @Test
    void Triangle(){
        assertEquals(expectedTrue, expectedTrue);
    }

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
        assertEquals(expectedTrue, t1.isIsosceles());
    }

    @Test
    void isEquilateralTest() {
        boolean compat = t1.isEquilateral() && t1.isTriangle();
        assertEquals(expectedFalse, compat);

    }

    @Test
    void computeTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        t1.compute(5, 5, 6);
        String answer = "Isosceles";
        assertEquals(answer, outContent.toString());
    }

    @Test
    void getAreaTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        t1.getArea(5,5,6);
        String answer = "12.0";
        assertEquals(answer, outContent.toString());
    }


}