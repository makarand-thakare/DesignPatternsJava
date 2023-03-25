package structuralDesignPatterns.proxyDesignPattern;

public class MainProxyDesignPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("abcd.png");
        image.displayImage();
    }
}
