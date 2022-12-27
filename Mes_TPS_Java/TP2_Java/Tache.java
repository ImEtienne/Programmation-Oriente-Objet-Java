package TP2_Java;
/**
 * Décrivez votre classe Tache ici.
 *
 * @author KIBONGANI ETIENNE
 * @version (un numéro de version ou une date)
 */
public class Tache
{
    private String description;
    private long DateLimite;
    public Tache(String description, long duree){
        this.description = description;
        this.DateLimite = (duree + System.nanoTime());    
    }
    
    public long getDateLimite(){
        return (DateLimite - System.nanoTime());
    }
    
    public String getDescription(){
        return description;
    }
    
    public long getDateLimiteJours(){
        return getDateLimiteHeures()/24;
    }
    
    public long getDateLimiteHeures(){
        return getDateLimiteMinutes()/60;
    }
    
    public long getDateLimiteMinutes(){
        return getDateLimiteEnSecondes()/60;
    }
    
    public long getDateLimiteEnSecondes(){
        return getDateLimite()/1000000000;
    }
    
    @Override
    public String toString(){
        return description + "  " + getDateLimite()/1000000;
    }
}