package ru.pavelnix;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

    private Point vertexA;
    private Point vertexB;
    private Point vertexC;
    private float square;
    private Triangle triangle;

    @Before
    public void setUp() throws Exception {
        vertexA = new Point(0.0f, 0.0f);
        vertexB = new Point(0.0f, 1.0f);
        vertexC = new Point(1.0f, 0.0f);
        square = 1.0f;
        triangle = new Triangle(vertexA, vertexB, vertexC);
    }

    @Test
    public void testSquare() {
        assertEquals(square, triangle.square());
    }
}