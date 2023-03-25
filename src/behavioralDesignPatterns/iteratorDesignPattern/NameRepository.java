package behavioralDesignPatterns.iteratorDesignPattern;

public class NameRepository implements Container {

    String[] names = {"name1", "name2", "name3", "name4"};

    @Override
    public MyIterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements MyIterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (index < names.length) {
                return names[index++];
            }
            return null;
        }
    }
}
