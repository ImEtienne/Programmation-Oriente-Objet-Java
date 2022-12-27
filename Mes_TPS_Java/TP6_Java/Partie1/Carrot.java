package TP6_Java.Partie1;
/**
 * Décrivez votre classe Carrot ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Carrot
{
    private double poids;
    private int longueur;
    
    public Carrot(double poids, int longueur){
        this.poids = poids;
        this.longueur = longueur;
    }
    
    @Override
    public String toString(){
        return "Carotte : " + "[" + this.poids + "Kg - " + this.longueur + "cm]";
    }
}
