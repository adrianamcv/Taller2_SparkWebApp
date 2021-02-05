package edu.escuelaing.arem.ASE.app;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatTest{

    Stat calc = new Stat();

    @Test
    public void testMean1() {
        calc.crearDatos("160,591,114,229,230,270,128,1657,624,1503");
        assertEquals(550.6, calc.mean(),0.1);
    }

    @Test
    public void testMean2() {
        calc.crearDatos("15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2");
        assertEquals(60.32, calc.mean(),0.1);
    }

    @Test
    public void testStddev1() {
        calc.crearDatos("160,591,114,229,230,270,128,1657,624,1503");
        assertEquals(572.03, calc.stddev(),0.1);
    }

    @Test
    public void testStddev2() {
        calc.crearDatos("15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2");
        assertEquals(62.23, calc.stddev(),0.1);
    }
}