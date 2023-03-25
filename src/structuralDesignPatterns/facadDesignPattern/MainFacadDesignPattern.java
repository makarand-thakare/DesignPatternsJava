package structuralDesignPatterns.facadDesignPattern;

public class MainFacadDesignPattern {
    public static void main(String[] args) {
        ShapeFacad shapeFacad = new ShapeFacad();
        shapeFacad.drawCircle();
        shapeFacad.drawTriangle();
    }
}
