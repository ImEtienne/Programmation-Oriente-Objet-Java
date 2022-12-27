package TP2_Java;
/**
 * Décrivez votre classe Casillo ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Casillo
{
    private long valeurParDefaut;
    public Casillo(){
        this.valeurParDefaut = 1000000000;
    }
    public Chronometre chronometre(){
        return new Chronometre();
    }
    public Attente attente(long duree){
        return new Attente(duree);
    } 
    
    public Attente attenteDefaut(){
        return new Attente(valeurParDefaut);
    }
    
    public void changeDefaut(long duree){
        this.valeurParDefaut = duree;
    }
}