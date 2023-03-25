package structuralDesignPatterns.flyweightDesignPattern;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> coloredShapes = new HashMap<>();

    public static Shape getShape(String color) {
        Circle circle = (Circle) coloredShapes.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circle.setRadius(7);
            coloredShapes.put(color, circle);
            System.out.println("Created circle with color " + color);
        }
        return circle;
    }
}
