package TP3_Java.Exo1;
/**
 * Décrivez votre classe Arme ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Arme
{
    private String nom;
    private int forceAttaque;
    private int nombreUtilisation;

    public Arme(String nom,int forceAttaque,int nombreUtilisation){
        this.nom = nom;
        this.forceAttaque = forceAttaque;
        this.nombreUtilisation = nombreUtilisation;
    }
    
    public int getNombreUtilisation(){
        return nombreUtilisation;
    }
    
    public int getForceAttaque(){
        return forceAttaque;
    }
    
    public void setForceAttaque(int forceAttaque){
        this.forceAttaque = forceAttaque;
    }
    
    @Override
    public String toString(){
        return   nom + "\n " +
                "La force D'attaque : " + forceAttaque + "\n" +
                "Le nombre D'utilisation : " + nombreUtilisation + "\n";
    }
}
