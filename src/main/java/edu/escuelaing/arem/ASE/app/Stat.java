package edu.escuelaing.arem.ASE.app;

/**
 * @author Adriana Castañeda
 */

public class Stat {

    private LinkedList<Double> lval;

    public void crearDatos(String valores){
        this.lval = new LinkedList<>();
        String[] splitValores = valores.split(",");
        for (String s : splitValores){
            this.lval.add(Double.parseDouble(s));
        }
    }

     /**
     *
     * @return media aritmética de los valores ingresados
     */

    public double mean(){
        Node<Double> pointer = this.lval.getHead().getFirstN();
        double suma = 0.0;
        while (pointer != null){
            suma = suma + pointer.getVal();
            pointer = pointer.getNext();
        }
        return suma / this.lval.getSize();
    }

    /**
     *
     * @return Desviación estándar de los valores ingresados
     */
    public double stddev (){
        Node<Double> pointer = this.lval.getHead().getFirstN();
        double std = 0;
        double tmp = mean();
        while(pointer != null){
            std += Math.pow((pointer.getVal() - tmp),2);
            pointer = pointer.getNext();
        }
        std = std / (this.lval.getSize() -1);
        return  Math.sqrt(std);
    }
}
