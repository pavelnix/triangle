package ru.pavelnix;

/**
 * Класс, с помощью которого проверяется существование треугольника
 */
public class ValidateTriangle {
    /**
     * vertexA - первая вершина трегольника
     * vertexB - вторая вершина трегольника
     * vertexC - третья вершина трегольника
     */
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;

    /**
     * Конструктор треугольника
     *
     * @param vertexA - первая вершина трегольника
     * @param vertexB - вторая вершина трегольника
     * @param vertexC - третья вершина трегольника
     */
    public ValidateTriangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    /**
     * Метод для подсчета длины стороны
     *
     * @param vertexA - одна из вершин трегольника
     * @param vertexB - другая из вершин трегольника
     * @return длину стороны
     */
    private float lengthSide(Point vertexA, Point vertexB) {
        return (float) Math.hypot(vertexA.getX() - vertexB.getX(),
                vertexA.getY() - vertexB.getY());
    }

    /**
     * метод, который проверяет существование треугольника
     *
     * @return истину, если треугольник существует и ложь, если нет
     */
    public boolean validate() {
        float sideAB = lengthSide(vertexA, vertexB);
        float sideAC = lengthSide(vertexA, vertexC);
        float sideBC = lengthSide(vertexB, vertexC);

        return ((sideAB < sideAC + sideBC) &&
                (sideAC < sideAB + sideBC) &&
                (sideBC < sideAB + sideAC));
    }
}