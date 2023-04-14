public class Planetaahir 
{
    //inicialitzem les variables nom diametre i que seran els atributs dels objectes
    String nom;
    int diametre;
    int pes;    

    //Constructor amb atributs serveix per a crear instancies dels objectes tipus planetes amb atributs
    //Contructor amb tots els parametres    
    
    /**
     * @param nom 
     * @param diametre
     * @param pes
     */
    public Planetaahir(String nom, int diametre, int pes)
    {
        this.nom = nom;
        this.diametre = diametre;
        this.pes = pes;
    }

    //Constructor sense atributs serveix per a crear instancies dels objectes sense cap atribut (no sabem per a que)
    //Contructor buit
    public Planetaahir(){}

    //La clase planetaEnano el que fa es que si quan s'executa la funcio amb algun dels objectes i el 
    //seu diametre es menor que 1300 retorna 1 i si es major que 1300 retorna 0
    
    /**
     * @return 
     * 
     */
    public int planetaEnano()
    {
        if(this.diametre < 1300)
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }

    //el que fa la classe expansio es que si algun objecte dels que tenim creats executa aquesta funcio
    // el seu diametre es multiplica per 3
    
    /**
     * 
     */
    public void expansio()
    {        
        this.diametre = this.diametre * 3;
    }

    //la funcio colisio te un valor d'entrada (int) que s'anomena meteorito i el qual li donarem valor al Test
    // quan s'executa si o si al pes de l'objecte li restem el pes del meteorito si aquest pes es major o 
    //igual a 1800 retornarem 1 i si no el diametre de l'objecte agumentara (sumar) la meitat del pes del 
    //meteorit (meteorito-2) i retornarem 0
    
    /**
     * @param meteorito
     * @return 
     */
    public int colisio(int meteorito)
    {
        this.pes = this.pes - meteorito;

        if(this.pes >= 1800){
            return 1;
        }

        else{
            this.diametre = this.diametre + (meteorito/2);
            return 0;
        }

       
    }

    //Getters i setters
    //els getters son per a consultar el valor d'un atribut al moment que volem
    //per exemple el get diametre el que retorna es el valor del diametre de l'objecte amb terra.getDiametre
    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getDiametre()
    {
        return this.diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }
    
    public int getPes()
    {
        return this.pes;
    }

    public void setPes(int pes)
    {
        this.pes = pes;
    }    
}