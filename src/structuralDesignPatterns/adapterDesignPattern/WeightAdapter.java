package structuralDesignPatterns.adapterDesignPattern;

public class WeightAdapter implements WeightInKg {

    PoundWeightProvider poundWeightProvider;

    public WeightAdapter(PoundWeightProvider poundWeightProvider) {
        this.poundWeightProvider = poundWeightProvider;
    }

    // Do the conversion/adaption here
    @Override
    public double getWeightInKGs() {
        double inKG = poundWeightProvider.getWeightInPound() / 2.205;
        return Math.round(inKG);
    }
}
