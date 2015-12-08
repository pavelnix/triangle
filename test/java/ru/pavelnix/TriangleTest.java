package ru.pavelnix;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Класс, который тестирует классы Triangle и ValidateTriangle
 * The class which tests classes Triangle and ValidateTriangle
 */
public class TriangleTest {

    /**
     * Тестируем метод validateTriangle.validate(), который проверяет существование треугольника,
     * когда по заданным вершинам невозможно построить треугольник
     * Test method validateTriangle.validate(), which verify the existence of a triangle,
     * when given vertexes is impossible to construct a triangle
     */
    @Test
    public void whenGivenVertexesImpossibleConstructTriangle() {

        //Arrange
        Point vertexA = new Point(0.0f, 0.0f);
        Point vertexB = new Point(0.0f, 1.0f);
        Point vertexC = new Point(0.0f, 2.0f);
        ValidateTriangle triangle = new ValidateTriangle(vertexA, vertexB, vertexC);

        //Act
        boolean validate = triangle.validate();

        //Assert
        assertEquals(false, validate);
    }

    /**
     * Тестируем метод validateTriangle.validate(), который проверяет существование треугольника,
     * когда по заданным вершинам можно построить треугольник
     * Test method validateTriangle.validate(), which verify the existence of a triangle,
     * when given vertexes may to construct a triangle
     */
    @Test
    public void whenGivenVertexesMayConstructTriangle() {

        //Arrange
        Point vertexA = new Point(0.0f, 0.0f);
        Point vertexB = new Point(0.0f, 1.0f);
        Point vertexC = new Point(1.0f, 0.0f);
        ValidateTriangle triangle = new ValidateTriangle(vertexA, vertexB, vertexC);

        //Act
        boolean validate = triangle.validate();

        //Assert
        assertEquals(true, validate);
    }

    /**
     * Тестируем метод triangle.area(), который вычисляет площадь треугольника,
     * когда по заданным вершинам можно построить треугольник
     * Test method triangle.area(), which calculates the area of ​​a triangle,
     * when given vertexes may to construct a triangle
     */
    @Test
    public void whenGivenVertexesMayConstructTriangleCounterArea() {

        //Arrange
        Point vertexA = new Point(0.0f, 0.0f);
        Point vertexB = new Point(0.0f, 1.0f);
        Point vertexC = new Point(1.0f, 0.0f);
        Triangle triangle = new Triangle(vertexA, vertexB, vertexC);

        //Act
        float area = triangle.area();

        //Assert
        assertEquals(0.5f, area);
    }

    /**
     * Тестируем метод triangle.area(), который вычисляет площадь треугольника (равна 0),
     * когда по заданным вершинам невозможно построить треугольник
     * Test method triangle.area(), which calculates the area of ​​a triangle (is equal to zero),
     * when given vertexes is impossible to construct a triangle
     */
    @Test
    public void whenGivenVertexesImpossibleConstructTriangleThenAreaZero() {

        //Arrange
        Point vertexA = new Point(0.0f, 0.0f);
        Point vertexB = new Point(0.0f, 1.0f);
        Point vertexC = new Point(0.0f, 2.0f);
        Triangle triangle = new Triangle(vertexA, vertexB, vertexC);

        //Act
        float area = triangle.area();

        //Assert
        assertEquals(0.0f, area);
    }
}