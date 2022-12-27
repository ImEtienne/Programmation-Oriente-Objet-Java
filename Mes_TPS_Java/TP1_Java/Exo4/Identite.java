package TP1_Java.Exo4;
/**
 * Décrivez votre classe Identite ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Identite
{
    private String Prenom;
    private String Nom;
    private InformationDeDate InfoDate;
    
    public Identite(String Prenom,String Nom, InformationDeDate InfoDate){
        this.Prenom = Prenom;
        this.Nom = Nom;
        this.InfoDate = InfoDate;
    }
}
