
import java.util.NoSuchElementException;
import java.util.Random;


public class Polynominal {


    private Nodo root;
    private int size;
    private int constante;

    public Polynominal(int[] coefs) {
        for (int coef : coefs) {
            insert(coef);
        }
    }

    public Polynominal() {
        Random random = new Random();
        constante = random.nextInt(20);
    }
    public void add(Polynominal pol){
        
        int pointer = 0;
        Nodo orig = root;
        System.out.println("el tamaño del poli x es: "+pol.size());

        for (int i = 0; i <size ; i++) {
            if(pol.getExp(pointer)==orig.exponente){
            orig.value += pol.getCoef(pointer);
            pointer++;
            }
            orig = orig.next;
            if (pol.size()-pointer==0){
                break;
            }
        }


    }
    public void insert(int x) {
        //System.out.println(x);
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
        if (p == null) {
            parts.append(constante);
            return parts.toString();
        }
        for (int i = 0; i < size; i++) {
            if (p.value != 0) {
                if (p.value < 0) {
                    parts.append("(");
                    parts.append(p.value);
                    parts.append(")");
                } else {
                    parts.append(p.value);
                }
                if (p.exponente != 0) {
                    parts.append("x^");
                    parts.append(p.exponente);
                }
                if (size - i > 1) {
                    parts.append("+");
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

