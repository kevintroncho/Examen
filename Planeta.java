public class Planeta 
{
    //Inicialitzem les variables que utilitzarem com a atributs de la classe planeta.
    int temperaturaMitjana;
    int quantitatAigua;
    int radiacio;
    int gravetat;
    int distanciaSol;    

    
    //Contructor amb tots els parametres      
    /**
     * @param temperaturaMitjana es l'atribut que determina el valor de la temperatura mitjana del planeta
     * @param quantitatAigua es l'atribut que determina el valor la quantitat d'aigua que te el planeta
     * @param radiacio es l'atribut que determina el valor de la radiacio del planeta
     * @param gravetat es l'atribut que determina el valor de la gravetat del planeta
     * @param distanciaSol es l'atribut que determina el valor de la distancia al sol a la que esta el planeta
     */
    public Planeta(int temperaturaMitjana, int quantitatAigua, int radiacio, int gravetat, int distanciaSol) 
    {
        this.temperaturaMitjana = temperaturaMitjana;
        this.quantitatAigua = quantitatAigua;
        this.radiacio = radiacio;
        this.gravetat = gravetat;
        this.distanciaSol = distanciaSol;
    } 

    
    
    //Contructor buit
    /**
     * Els constructors buits serveixen per si volem crear una nova instancia sense atributs.
     */
    public Planeta(){}


    
    /**
     * El metode conversioKelvin agafa l'atribut de temperaturaMitjana (int) del planeta i li suma 270 per a
     * fer la conversió
     */
    public void conversioKelvin()
    {
        this.temperaturaMitjana = this.temperaturaMitjana + 273;          
    }


    
    /**
     * @return tornara 1 si la temperatura mitjana del planeta menor que 45 però major que 20, si la quantitat
     * d'aigua supera 40 i si la radiació es infrerior a 25. Si això no es cumpleix retornarà 0
     */
    public int planetaHabitable()
    {
        //ACABAR
        if(this.temperaturaMitjana <= 45 && temperaturaMitjana >= 20 && quantitatAigua >= 40 && radiacio <= 25){
            return 1;
        }
        else{
            return 0;
        }

    }


    
    /**
     * @param pesPersona es la variable d'entrada que determina el pes de la persona
     * @return retornarem la gravetat desprès de fer la multiplicació que dirà el pes total.
     */
    public int calculPes(int pesPersona)
    {
        //ACABAR  
        this.gravetat = this.gravetat * pesPersona;
        return this.gravetat;        
    }


    
    /**
     * @return tonara 1 si la quantitat d'aigua d'un planeta es igual al resultat de dividir la distancia al sol
     * del planeta entre la radiacio i retornarà 0 si aixo no es compleix.
     */
    public int planetaEquilibrat()
    {
        //ACABAR
        if(quantitatAigua == (distanciaSol / radiacio )){
            return 1;   
        }
        
        else{
            return 0;    
        }
    }


    //Getters i setters
    public int getTemperaturaMitjana() 
    {
        return temperaturaMitjana;
    }

    public void setTemperaturaMitjana(int temperaturaMitjana) 
    {
        this.temperaturaMitjana = temperaturaMitjana;
    }

    public int getQuantitatAigua() 
    {
        return quantitatAigua;
    }

    public void setQuantitatAigua(int quantitatAigua) 
    {
        this.quantitatAigua = quantitatAigua;
    }

    public int getRadiacio()
    {
        return radiacio;
    }

    public void setRadiacio(int radiacio) 
    {
        this.radiacio = radiacio;
    }

    public int getGravetat() {
        return gravetat;
    }

    public void setGravetat(int gravetat) {
        this.gravetat = gravetat;
    }

    public int getDistanciaSol() 
    {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) 
    {
        this.distanciaSol = distanciaSol;
    }    
}
