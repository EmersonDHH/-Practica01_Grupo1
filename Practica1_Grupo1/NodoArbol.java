public class NodoArbol {
    private int valor;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    // Getter y Setter para valor
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Getter para izquierdo
    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    // Getter para derecho
    public NodoArbol getDerecho() {
        return derecho;
    }

    // INSERTAR
    public void insertar(int _valor) {
        if (_valor < this.valor) {
            if (this.izquierdo == null) {
                this.izquierdo = new NodoArbol(_valor);
            } else {
                this.izquierdo.insertar(_valor);
            }
        } else {
            if (this.derecho == null) {
                this.derecho = new NodoArbol(_valor);
            } else {
                this.derecho.insertar(_valor);
            }
        }
    }


    //BUSCAR
    public boolean buscar (int _valor){
        if (this.valor == _valor) {
            return true;
        } else if (_valor < this.valor) {
            if (this.izquierdo != null) {
                return this.izquierdo.buscar(_valor);
            } else {
                return false;
            }
        } else {
            if (this.derecho != null) {
                return this.derecho.buscar(_valor);
            } else {
                return false;
            }
        }
    }

}
