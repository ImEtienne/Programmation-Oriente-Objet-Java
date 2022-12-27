package TP3_Java.Exo2;
/**
 * Décrivez votre classe Salles ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Salles
{
    private int capacite;
    
    public Salles (int capacite){
        this. capacite = capacite;
    }
    
    public Salles (Salles s){
        this.capacite = s.capacite;
    }
    
    public int getCapacite(){
        return this.capacite;
    }
}
