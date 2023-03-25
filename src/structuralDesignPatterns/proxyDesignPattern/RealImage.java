package structuralDesignPatterns.proxyDesignPattern;

public class RealImage implements Image {
    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk(fileName);
    }

    private void loadImageFromDisk(String fileName) {
        System.out.println("Loaded " + fileName + " from disk");
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying real image " + fileName);
    }
}
