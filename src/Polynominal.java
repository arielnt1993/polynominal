
import java.util.NoSuchElementException;
import java.util.Random;


public class Polynominal {
    int constante;
    private Nodo root;
    private int size;
    public Polynominal(int constante){
        this.constante = constante;
    }
    public Polynominal(){
        Random rand = new Random();
        constante = rand.nextInt(50);
    }
    public void add(int x) {
        if(x!=0){
        Nodo n = new Nodo(x);
        n.next = root;
        root = n;
        size++;}
    }

    public int get(int pos) {
        if (pos < 0 || pos >= size) {
            throw new NoSuchElementException();
        }
        Nodo p = root;
        for (int i = 0; i < pos; i++) {
            p = p.next;
        }
        return p.value;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString(){
        StringBuilder parts = new StringBuilder("P(x) = ");
        Nodo p = root;
        int aux = size-1;
        for (int i = 0; i <size ; i++) {
            parts.append(p.value);
            if (size-i==1){
                p = p.next;
                break;
            }

            parts.append("x^");
            parts.append(aux);
            parts.append("+");
            aux--;
            p = p.next;
        }


        return  parts.toString();
    }
    public  Iterator iterator(){
        return new Iterator(root);
    }
}

class Nodo {
    int value;
    Nodo next;

    public Nodo(int value) {
        this.value = value;
    }
}

class Iterator {
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
