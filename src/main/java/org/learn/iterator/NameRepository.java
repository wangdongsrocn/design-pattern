package org.learn.iterator;

public class NameRepository implements Container {
    public String[] name = {"Tom", "Jack", "Judy", "Alice"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[index++];
            }
            return null;
        }
    }
}
