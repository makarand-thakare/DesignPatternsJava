package structuralDesignPatterns.adapterDesignPattern;

public class MainAdapterDesignPattern {

    public static void main(String[] args) {

        // Class to provide weight in pounds
        PoundWeightProvider poundWeightProvider = new PoundWeightProvider(22.0462);
        double weightInPound = poundWeightProvider.getWeightInPound();

        System.out.println("Weight in pounds " + weightInPound);

        // But the client doesn't understand weight in pounds,
        // so we convert it into KGs with the help of adapter
        WeightAdapter weightAdapter = new WeightAdapter(poundWeightProvider);
        double weightInKGs = weightAdapter.getWeightInKGs();

        System.out.println("Weight in KGs " + weightInKGs);
    }
}
