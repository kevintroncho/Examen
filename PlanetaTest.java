//llibreries per al test
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlanetaTest {  
    //crearem els objectes amb 3 atributs segons el que diu el constructor de l'altra pg
    Planeta terra = new Planeta("Terra", 1500, 3000);
    Planeta marte = new Planeta("Marte", 1200, 3000);
    Planeta jupiter = new Planeta("Jupiter", 1200, 3000);
    Planeta pluto =new Planeta("Pluto", 1200, 1900);

    //funcio de planeta enano el que fa es que en quan un planeta executa aquesta funcio es compara el
    // valor del diametre del planeta que ha iniciat la funcio i guarda el valor del return en una nova
    //variable que hem dit resultatenano. al assertEquals li diem que esperem 0 ja que terra es mes gran
    // i actualment el valor esta guardat en resultatenano i resultatenano2
    @Test
    public void testPlanetaEnano()
    {     
        int resultatenano = terra.planetaEnano();
        int resultatenano2 = marte.planetaEnano();

        assertEquals(0, resultatenano);
        assertEquals(1, resultatenano2);

    }    
    //quan s'executa expansio el que fa es que automaticament s'actualitza el valor de diametre del objecte
    //i guardem este valor a una nova variable que hem dit diametrexpansio demanant el valor actualitzat
    //del diametre fent lo getDiametre. Al assertEquals esperem 4500 ia que lo diametre valia 1500*3 i 
    //actualment ho tenim guardat a diametrexpansio
    @Test 
    public void testExpansio()
    {
        terra.expansio();
        int diametrexpansio = terra.getDiametre();
        
        assertEquals(4500,diametrexpansio);

    }
    //aqui fem 2 colisions

    // la primera fem que jutpiter colisiona en meteorito que li diem que pesa 200 i com se li resta
    //lo pes del meteorit lo demanem en getPes i lo guardem en la nova variable pescolisio. En assertEquals
    //com sa restat 3000 (pes inicial de jupiter) menos 200 (pes del meteorit) esperem que done 2800
    //i actualment tenim guardat a pescolisio. tambe hem de comprovar si mos retorna un 1 ia que es mes 
    //gran que 1800 i si es aixi mos ha de retornar lo 1, ho dem creant una variable ques diu comprovaciocolisio
    //i en un altre assertEquals diem que esperem un 1 i lo tenim actualment guardat en comprovaciocoliso

    //la segona fem que pluto colisiona en un meteorito que diem que pesa 200, se li resta lo pes del meteorit
    //i mentalment sabem que pesa menos de 1800 per tant se li augmenta automaticament al diametre la mitat 
    //del pes del meteorit (100), obtenim lo diametre de pluto amb pluto.getDiametre actualitzat i el guardem
    //a una nova variable ques diu diametrecolisio. al assertEquals esperem 1300 perque lo diametre era 1200
    //mes la meitat del que pesa lo meteorit (100) es 1300 i el tenim actualment a diametrecolisio. queda 
    //comprovar si aixo dona 0 o 1, ha de donar 0 pero ho fem en un assertNotEquals per tant no esperem un 1
    // i el tenim guardat a comprovaciocolisio2
    @Test 
    public void testColisio()
    {
        int comprovaciocoliso = jupiter.colisio(200);
        int pescolisio = jupiter.getPes();
        assertEquals(2800, pescolisio);
        
        int comprovaciocolisio2 = pluto.colisio(200);
        int diametrecolisio = pluto.getDiametre();
        assertEquals(1300, diametrecolisio);
        
        assertEquals(1, comprovaciocoliso);
        assertNotEquals(1, comprovaciocolisio2);              

    }    
}