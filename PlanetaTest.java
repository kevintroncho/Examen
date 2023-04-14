import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetaTest {   
            Planeta terra = new Planeta(20, 50, 20, 20, 20);
            Planeta jupiter = new Planeta(30, 50, 15, 20,20);
            Planeta mart = new Planeta(10, 50,15,20,20);
            Planeta saturn = new Planeta(10, 50, 15, 20,20);
            Planeta venus = new Planeta(10, 20, 15, 20, 20);
            Planeta mercuri = new Planeta(20, 10, 2, 15, 20);
    @Test 
    public void testConversioKelvin()
    {
        terra.conversioKelvin();
        int temperaturaactualitzada = terra.getTemperaturaMitjana();

        assertEquals(293, temperaturaactualitzada);           
    }    


    @Test 
    public void testPlanetaHabitable()
    {
        int contar =jupiter.planetaHabitable();
        assertEquals(1, contar);

        int contar2 = mart.planetaHabitable();
        assertEquals(0, contar2);

        int contar3 = saturn.planetaHabitable();
        assertEquals(0, contar3);

        int contar4 = venus.planetaHabitable();
        assertEquals(0, contar4);
    }


    @Test 
    public void testCalculPes()
    {
        venus.calculPes(60);
        int pesennewtons = venus.getGravetat();

        assertEquals(1200, pesennewtons);
    }  
    

    @Test 
    public void testPlanetaEquilibrat()
    {   
        int contarequilibrat = mercuri.planetaEquilibrat();
        assertEquals(1, contarequilibrat);

        int contarnoequilibrat = terra.planetaEquilibrat();
        assertEquals(0, contarnoequilibrat);
    }  
}
