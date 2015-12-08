package ru.pavelnix;

/**
 * Класс описывающий треугольник
 * Class describing a triangle
 */
public class Triangle {
    /**
     * vertexA - первая вершина треугольника
     *          the first vertex of the triangle
     * vertexB - вторая вершина треугольника
     *          the second vertex of the triangle
     * vertexC - третья вершина треугольника
     *          the third vertex of the triangle
     */
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;

    /**
     * Конструктор треугольника
     * The class constructor
     *
     * @param vertexA - первая вершина треугольника
     *          the first vertex of the triangle
     * @param vertexB - вторая вершина треугольника
     *          the second vertex of the triangle
     * @param vertexC - третья вершина треугольника
     *          the third vertex of the triangle
     */
    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    /**
     * Метод, который считает площадь треугольника
     * A method that calculates the area of ​​a triangle
     *
     * @return - площадь треугольника
     * return area of a triangle
     */
    public float area() {

        return 1f / 2 * Math.abs((vertexB.getX() - vertexA.getX()) * (vertexC.getY() - vertexA.getY()) -
                (vertexC.getX() - vertexA.getX()) * (vertexB.getY() - vertexA.getY()));
    }

}
