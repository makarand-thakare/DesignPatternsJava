package structuralDesignPatterns.proxyDesignPattern;

public class ProxyImage implements Image {
    RealImage realImage;
    String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }
}
