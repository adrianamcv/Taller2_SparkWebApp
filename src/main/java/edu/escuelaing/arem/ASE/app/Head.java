package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author Adriana Castañeda
 */

public class Head<T> {
    private Node<T> firstN;
    private Node<T> lastN;

    public Head(Node<T> firstN, Node lastN) {
        this.firstN = firstN;
        this.lastN = lastN;
    }

    /**
     * Permite obtener el primer nodo en la lista
     * @return Primer nodo en la lista
     */
    public Node getFirstN() {
        return firstN;
    }

    /**
     * Permite modificar el primer nodo de la lista
     * @param firstN Nuevo primer nodo de la lista
     */
    public void setFirstN(Node firstN) {
        this.firstN = firstN;
    }

    /**
     * Permite obtener el último nodo en la lista
     * @return ültimo nodo en la lista
     */
    public Node getLastN() {
        return lastN;
    }

    /**
     * Permite modificar el último nodo en la lista
     * @param lastN Nuevo último nodo en la lista
     */
    public void setLastN(Node lastN) {
        this.lastN = lastN;
    }
}
