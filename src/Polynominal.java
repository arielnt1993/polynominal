
import java.util.NoSuchElementException;
import java.util.Random;


public class Polynominal {


    private Nodo root;
    private int size;

    public Polynominal(int[] coefs) {
        for (int coef : coefs) {
            if (coef != 0) {
                insert(coef);
            }
        }
    }

    public Polynominal() {
        Random random = new Random();
        int constante = random.nextInt(20);
        Nodo cons = new Nodo(constante);
        cons.next = root;
        root = cons;
        cons.exponente = 0;
        size++;
    }

    public void add(Polynominal pol) {
        Nodo orig = root;
        int pointer = 0;
        int pointer2 = pol.size() - size;
        if (size >= pol.size()) {
            for (int i = 0; i < size; i++) {
                if (orig.exponente == pol.getExp(pointer)) {
                    orig.value += pol.getCoef(pointer);
                    pointer++;
                }
                orig = orig.next;
            }
        } else {
            pointer = pointer2;
            System.out.println(pol.getCoef(pointer));
            for (int i = pointer2 - 1; i > -1; i--) {
                insert(pol.getCoef(i));
                orig.value += pol.getCoef(pointer);
                pointer++;
                orig = orig.next;

            }
        }

    }

    public void insert(int x) {
        Nodo n = new Nodo(x);
        n.next = root;
        root = n;
        size++;
        n.exponente = size - 1;
    }

    public void checkPos(int pos) {
        if (pos < 0 || pos >= size) {
            throw new NoSuchElementException();
        }
    }

    public int getCoef(int pos) {
        checkPos(pos);
        Nodo p = root;
        for (int i = 0; i < pos; i++) {
            p = p.next;
        }

        return p.value;
    }

    public void setCoef(int x, int pos) {
        checkPos(pos);
        Nodo tmp = root;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }
        tmp.value = x;
    }

    public int getExp(int pos) {
        checkPos(pos);
        Nodo tmp = root;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }
        return tmp.exponente;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {

        StringBuilder parts = new StringBuilder("P(x) = ");
        Nodo p = root;
        if (size == 0) {
            parts.append(p.value);
        }

        for (int i = 0; i < size; i++) {
            if (p.value != 0) {
                if (p.value < 0) {
                    parts.append("("+p.value+")");
                } else {
                    parts.append(p.value);
                }
                if (p.exponente != 0) {
                    parts.append("x^"+p.exponente);
                }
                if (size - i > 1  ) {
                    parts.append("+");
                }
            }

            p = p.next;



        }


        return parts.toString();
    }

    public float valueOf(float x) {
        Nodo tmp = root;
        float exp;
        float y = 0;
        for (int i = 0; i < size; i++) {
            exp = (float) Math.pow(x, tmp.exponente);
            exp *= tmp.value;
            y += exp;
            tmp = tmp.next;

        }

        return y;
    }
}

