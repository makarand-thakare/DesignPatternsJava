package creationalDesignPatterns.prototypePattern;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<Integer, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(int shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);

        // Returning the clone of stored object
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId(1);
        shapeMap.put(circle.getId(), circle);

        Shape square = new Square();
        square.setId(2);
        shapeMap.put(square.getId(), square);
    }
}
