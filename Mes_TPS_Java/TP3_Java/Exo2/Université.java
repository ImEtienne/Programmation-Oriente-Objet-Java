package TP3_Java.Exo2;
/**
 * Décrivez votre classe Université ici.
 *
 * @author Etienne
 * @version 20:21 21/11/2021
 */
public final class Université
{
    final private  Batiments [] bats;
    final private Personne president;
    
    public Université(Batiments [] bats,Personne p){
        this.bats = new Batiments[bats.length];
        for(int i=0; i < bats.length; i++){
            this.bats[i] = new Batiments(bats[i]);
        }
        this.president = new Personne(p);
    }
    
    public Université(Université u){
        this.bats = new Batiments[u.bats.length];
        for(int i=0; i < u.getBats().length; i++){
            this.bats[i] = new Batiments(u.bats[i]);
        }
        this.president = new Personne(u.president);
    }
    
    public Batiments [] getBats(){
        Batiments [] bs = new Batiments[this.bats.length];
        for(int i=0; i < bs.length; i++){
            bs[i] = new Batiments(this.bats[i]);
            
        }
        return bs;
    }
    
    public Personne getPresident(){
        return new Personne(this.president);
    }
}
