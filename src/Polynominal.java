
import java.util.NoSuchElementException;
import java.util.Random;


public class Polynominal {


    private Nodo root;
    private int size;
    private int constante;

    public Polynominal(int[] coefs) {
        for (int coef : coefs) {
            add(coef);
        }
    }

    public Polynominal() {
        Random random = new Random();
        constante = random.nextInt(20);
    }

    public void add(int x) {
        //System.out.println(x);
        Nodo n = new Nodo(x);
        n.next = root;
        root = n;
        size++;
        n.exponente = size - 1;
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

    public void setCoef(int x, int pos) {
        if (pos < 0 || pos >= size) {
            throw new NoSuchElementException();
        }
        Nodo tmp = root;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }
        tmp.value = x;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {

        StringBuilder parts = new StringBuilder("P(x) = ");
        Nodo p = root;
        if (p == null) {
            parts.append(constante);
            return parts.toString();
        }
        for (int i = 0; i < size; i++) {

            if (p.value != 0) {
                if (p.value < 0) {
                    parts.append("(");
                }
                parts.append(p.value);
                if (p.value < 0) {
                    parts.append(")");
                }
                if (p.exponente != 0) {
                    parts.append("x^");

                    parts.append(p.exponente);
                    if (p.value > 0) {
                        parts.append("+");
                    }

                }
            }

            p = p.next;


        }


        return parts.toString();
    }

    public Iterator iterator() {
        return new Iterator(root);
    }
}

