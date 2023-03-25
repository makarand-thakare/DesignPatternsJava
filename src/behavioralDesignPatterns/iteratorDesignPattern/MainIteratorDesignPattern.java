package behavioralDesignPatterns.iteratorDesignPattern;

public class MainIteratorDesignPattern {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (MyIterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
