package TP3_Java.Exo2;
/**
 * Décrivez votre classe Batiments ici.
 *
 * @author Etienne
 * @version 17:49 - 21/11/2021
 */
final public class Batiments
{
    private Salles[] sallesDeCours;
    private int num;
    
    public Batiments(Salles [] sallesDeCours, int num){
        this.sallesDeCours = new Salles[sallesDeCours.length];
        for(int i=0; i < sallesDeCours.length; i++){
            this.sallesDeCours[i] = sallesDeCours[i];
        }
        this.num = num;
    }
    
    public Batiments(Batiments b){
        this.sallesDeCours = new Salles[b.sallesDeCours.length];
        for(int i= 0; i < b.getSallesDeCours().length; i++){
            this.sallesDeCours[i] = new Salles(b.sallesDeCours [i]);
        }
        this.num = b.num;
    }
    
    public Salles [] getSallesDeCours(){
        return this.sallesDeCours;
    }
    
    public int getNum(){
        return this.num;
    }
}
