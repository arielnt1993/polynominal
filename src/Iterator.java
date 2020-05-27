public class Iterator {
    private Nodo actual;

    public Iterator(Nodo actual) {
        this.actual = actual;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public int next() {
        int value = actual.value;
        actual = actual.next;
        return value;
    }
}
