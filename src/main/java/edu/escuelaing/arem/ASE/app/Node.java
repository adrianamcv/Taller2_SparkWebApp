package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author Adriana Castañeda
 */

public class Node<T>{
    private T value;
    private Node next;
    private int position;

    public Node (T value, Node<T> next, int position){
        this.value = value;
        this.next = next;
        this.position = position;
    }

    /**
     * Metodo para obtener el valor del nodo
     * @return valor del nodo
     */
    public T getVal() {
        return value;
    }

    /**
     * Permite obtener el nodo siguiente
     * @return Valor del nodo siguiente
     */
    public Node getNext() {
        return next;
    }

    /**
     * Permite obtener la posicion del nodo
     * @return Posicion del nodo
     */
    public int getPosition() {
        return position;
    }

    /**
     * Permite modificar el valor del nodo
     * @param val nuevo valor del nodo
     */
    public void setVal(T val) {
        this.value = value;
    }

    /**
     * Permite modificar el siguiente nodo
     * @param next Nuevo valor del siguiente nodo
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Permite modificar la posición del nodo
     * @param position Nueva posición del nodo
     */
    public void setPosition(int position) {
        this.position = position;
    }

}
