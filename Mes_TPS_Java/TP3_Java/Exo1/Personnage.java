package TP3_Java.Exo1;
/**
 * Décrivez votre classe Personnage ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Personnage
{
    private String nom;
    private int niveauVie;
    private Arme armeEnMain;
    private Arme armeDansLaPoche;
   
    public Personnage (String nom, int niveauVie, Arme armeEnMain, Arme armeDansLaPoche ){
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.armeEnMain = armeEnMain;
        this.armeDansLaPoche = armeDansLaPoche;
    }
    
    @Override
    public String toString(){
        return ("Nom user  : " + nom + "\n" +
                "Le niveau de vie : " + niveauVie + "\n"+
                "L'arme en main : " + armeEnMain + "\n" +
                "L'arme dans la poche : " + armeDansLaPoche); 
    } 
    
    public void attaquer(Personnage p){
        if(this.armeEnMain.getNombreUtilisation() !=0){
            p.niveauVie = p.niveauVie - this.armeEnMain.getForceAttaque();
            //ajoiter une méthode
        }
    }
    
    public void echangerArmes(){
        Arme temp = this.armeEnMain;
        this.armeDansLaPoche = this.armeEnMain;
        this.armeEnMain = temp;
    }
    
    public void nouvelleArme(Arme a){
        this.armeDansLaPoche = a;
    }
}
