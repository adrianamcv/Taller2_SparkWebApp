package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author Adriana Castañeda
 */

public class LinkedList<E>{

    private int size;
    private Head head = new Head(null, null);

    /**
     * Método para validar si la lista se encuentra vacía
     * @return Retonar true si la lista se encuentra vacía, o false de lo contrario
     */
    public boolean isEmpty() {
        int s = getSize();
        if (s == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *Método para agregar nuevos valores a la lista
     * @param e Dato que contiene el nodo
     */
    public void add(E e) {
        Node<E> n = null;
        if(head.getFirstN() == null) {
            n = new Node<>(e,null,1);
            head.setFirstN(n);
        }else{
            Node<E> temp = head.getFirstN();
            int cnt = 1;
            while (temp.getNext() != null) {
                cnt++;
                temp = temp.getNext();
            }
            n = new Node<E>(e, null, cnt+1);
            temp.setNext(n);
            head.setLastN(n);
        }
        size++;
    }

    /**
     * Metodo para encontrar cualquier nodo en la lista a partir del indice
     * @param index Inidice del nodo a consultar
     * @return Retorna el valor del nodo consultado
     */
    public E get(int index) {
        Node<E> tmp = head.getFirstN();
        if(index<=0){
            tmp = null;
        } else {
            while (tmp.getNext() != null) {
                if (tmp.getPosition() != index) {
                    tmp = tmp.getNext();
                } else {
                    break;
                }
            }
        }
        return tmp.getVal();
    }

    /**
     * Permite validar el tamaño de la lista
     * @return Retorna el tamaño de la lista
     */
    public int getSize() {
        return size;
    }

    /**
     * Método para modificar el tamaño de la lista
     * @param size Nuevo valor para el tamaño de la lista
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Permite obtener la cabeza de la lista
     * @return Primer elemento de la lista
     */
    public Head getHead() {
        return head;
    }

    /**
     * Permite modificar el valor de la cabeza de la lista
     * @param head Nueva cabeza de la lista
     */
    public void setHead(Head head) {
        this.head = head;
    }
}
