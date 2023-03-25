package structuralDesignPatterns.facadDesignPattern;

public class ShapeFacad {
    Shape circle;
    Shape triangle;

    public ShapeFacad() {
        circle = new Circle();
        triangle = new Triangle();
    }

    void drawCircle() {
        circle.draw();
    }

    void drawTriangle() {
        triangle.draw();
    }
}
