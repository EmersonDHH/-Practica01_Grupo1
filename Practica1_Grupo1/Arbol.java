public class Arbol {

    NodoArbol inicial;
    public Arbol() {
        this.inicial = null;
    }

    public void insertar(int valor) {
        if (this.inicial == null) {
            this.inicial = new NodoArbol(valor);
        } else {
            this.inicial.insertar(valor);
        }
    }

    public boolean buscar(int valor) {
        if (this.inicial == null) {
            return false;
        } else {
            return this.inicial.buscar(valor);
        }
    }
    
}
