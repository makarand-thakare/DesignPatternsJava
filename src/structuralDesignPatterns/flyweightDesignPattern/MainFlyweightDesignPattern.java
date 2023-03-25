package structuralDesignPatterns.flyweightDesignPattern;

public class MainFlyweightDesignPattern {
    public static void main(String[] args) {

        Shape whiteCircle = ShapeFactory.getShape("white");
        Shape whiteCircle2 = ShapeFactory.getShape("white");
        Shape whiteCircle3 = ShapeFactory.getShape("white");

        System.out.println(whiteCircle);
        System.out.println(whiteCircle2);
        System.out.println(whiteCircle3);
        System.out.println();

        Shape greenCircle = ShapeFactory.getShape("green");
        Shape greenCircle2 = ShapeFactory.getShape("green");

        System.out.println(greenCircle.hashCode());
        System.out.println(greenCircle2.hashCode());

    }
}
