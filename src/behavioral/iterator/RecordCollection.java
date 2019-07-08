package behavioral.iterator;

public class RecordCollection implements IContainer {
    private String recordArray[] =
            {"first", "second", "third", "fourth", "fifth"};

    public IIterator createIterator() {
        return new RecordIterator();
    }

    private class RecordIterator implements IIterator {
        private int index;

        public boolean hasNext() {
            return index < recordArray.length;
        }

        public Object next() {
            if (this.hasNext())
                return recordArray[index++];
            else
                return null;
        }
    }
}
