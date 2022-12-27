package TP2_Java;
/**
 * Décrivez votre classe GestionnaireDeTache ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GestionnaireDeTache
{
    private int LimiteTaches = 5000;
    private Tache [] tabTache;
    private int nombreTaches;
    
    public GestionnaireDeTache(){
        tabTache = new Tache[LimiteTaches];
        nombreTaches = 0;
    }
    
    public Tache creerTacheJours(String description, long jours){
        return creerTacheHeures(description, jours * 24);
    } 
    
    public Tache creerTacheHeures(String description, long heures){
        return  creerTacheMinutes(description, heures * 60);
    }
    
    public Tache creerTacheMinutes (String description, long minutes){
        return creerTacheSecondes(description, minutes * 60);
    }
    
    public Tache creerTacheSecondes(String description, long secondes){
        return new Tache (description, secondes * 1000000000);
    }
    
    public void ajouteTache (Tache tache){
        if (nombreTaches < LimiteTaches)tabTache [++nombreTaches] = tache;
    }
    
    public void afficheTache(){
        for(int i=0; i < nombreTaches; i++){
            System.out.println(tabTache[i].getDescription() + " " 
            + (double)tabTache[i].getDateLimiteHeures());
        }
    }
}
