package creationalDesignPatterns.prototypePattern;

public class MainPrototypeDesignPattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape(1);
        System.out.println(shape.type);

        Shape shape2 = ShapeCache.getShape(2);
        Shape shape3 = ShapeCache.getShape(2);
        
        // Different objects
        System.out.println(shape2);
        System.out.println(shape3);
    }
}
