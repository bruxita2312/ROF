package org.gradle;

import org.junit.Test;
import org.junit.Assert;

public class Fechatest {

    @Test
    public void test_getFechaActual(){
    	Fecha tester = new Fecha();
		String fechaActual = tester.getFechaActual();
		Assert.assertEquals(fechaActual,"16/06/2018");
    }

    @Test
    public void test_get_mesactual(){
        Fecha tester = new Fecha();	
		int mesactual = tester.get_mesactual();
        Assert.assertEquals(mesactual,6);
    }

    @Test
    public void test_numero_mes(){
        Fecha tester = new Fecha();
		Assert.assertEquals(tester.numero_mes("febrero"),"02");        
    }

    @Test
    public void test_nombre_mes(){
        Fecha tester = new Fecha();
        Assert.assertEquals(tester.nombre_mes(2),"febrero");
    }
}