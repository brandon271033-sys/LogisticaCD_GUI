package logistica;

public class NodoArbol {
    Producto producto;
    NodoArbol izquierdo, derecho;

    public NodoArbol(Producto producto) {
        this.producto = producto;
        this.izquierdo = null;
        this.derecho = null;
    }
}