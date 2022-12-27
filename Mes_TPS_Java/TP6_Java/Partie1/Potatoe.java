package TP6_Java.Partie1;
/**
 * Décrivez votre classe Potatoe ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Potatoe
{
    private double poids;
    private int nombreDeGermes;
    private static final int POURCENT_GERMES = 10;
    
    public Potatoe(double poids, int nombreDeGermes){
        this.poids = poids;
        this.nombreDeGermes = nombreDeGermes;
    }
    
    public Potatoe(double p){
        this.poids = p;
        this.nombreDeGermes = (int)(POURCENT_GERMES * poids);
    }
    
    @Override
    public String toString(){
        return "Patate : " + "[" + this.poids + "Kg - " + this.nombreDeGermes + "yeux]";
    }
}
