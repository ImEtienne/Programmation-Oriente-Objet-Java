 
/**
 * Décrivez votre classe Chainon ici.
 *
 * @author Etienne KIBONGANI
 * @version 15:45 - 18/11/2021
 */
public class Chainon
{
    private String info;
    private Chainon suivant;
    public Chainon(String val){
        this.info = val;
        suivant = null;
    }
    
    public Chainon(String val, Chainon s){
        info = val;
        suivant = s;
    }
    
    public String getInfo(){
        return info;
    }
    public Chainon getSuivant(){
        return suivant;
    }
    public void setSuivant(Chainon s){
        this.suivant = s;
    }
}
