package ru.pavelnix;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Класс, который тестирует классы Triangle и ValidateTriangle
 */
public class TriangleTest {

    private Point vertexA;
    private Point vertexB;
    private Point vertexC;
    private float square;
    private Triangle triangle;
    private ValidateTriangle validateTriangle;
    private boolean validate;

    /**
     * Метод выполняющийся перед каждым тестом
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        vertexA = new Point(0.0f, 0.0f);
        vertexB = new Point(0.0f, 1.0f);
        vertexC = new Point(0.0f, 2.0f);
        square = 0.0f;
        validate = false;
        triangle = new Triangle(vertexA, vertexB, vertexC);
        validateTriangle = new ValidateTriangle(vertexA, vertexB, vertexC);
    }

    /**
     * Метод, который тестирует метод
     * validateTriangle.validate(), который проверяет существование треугольника
     */
    @Test
    public void testValidate() {
        assertEquals(validate, validateTriangle.validate());
    }

    /**
     * Метод, который тестирует метод
     * triangle.square(), который считает площадь треугольника
     */
    @Test
    public void testSquare() {
        assertEquals(square, triangle.square());
    }
}