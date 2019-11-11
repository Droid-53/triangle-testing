import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestNotTriangle {
    Triangle t1 = new Triangle(0, 0, 0);
    boolean expectedTrue = true, expectedFalse = false;

    @Test
    void Triangle(){

    }

    @Test
    void isTriangleTest() {
        assertEquals(expectedFalse, t1.isTriangle());
    }

    @Test
    void isValidTest() {
        assertEquals(expectedFalse, t1.isValid());
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
        boolean compat = t1.isEquilateral() && t1.isTriangle();
        assertEquals(expectedFalse, compat);

    }

    @Test
    void computeTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        t1.compute(2, 3, 4);
        String answer = "Error. Something went wrong.";
        assertEquals(answer, outContent.toString());
    }

    @Test
    void getAreaTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        t1.getArea(2,3,4);
        String answer = "2.9047375096555625";
        assertEquals(answer, outContent.toString());
    }


}