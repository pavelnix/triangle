package ru.pavelnix;

import org.junit.Before;
import org.junit.Test;

public class SquareTriangleTest {

    private Point vertexA;
    private Point vertexB;
    private Point vertexC;
    private SquareTriangle squareTriangle;

    @Before
    public void setUp() throws Exception {
        vertexA = new Point(0.0f,0.0f);
        vertexB = new Point(0.0f, 1.0f);
        vertexC = new Point(1.0f, 0.0f);
        squareTriangle = new SquareTriangle(vertexA, vertexB, vertexC);
    }

    @Test
    public void testSquareTriangle(){

    }
}