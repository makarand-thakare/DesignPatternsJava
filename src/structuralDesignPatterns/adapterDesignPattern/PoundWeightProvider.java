package structuralDesignPatterns.adapterDesignPattern;

// This class provides weight in pounds
public class PoundWeightProvider {
    double weight;

    public PoundWeightProvider(double weight) {
        this.weight = weight;
    }

    public double getWeightInPound() {
        return weight;
    }
}
