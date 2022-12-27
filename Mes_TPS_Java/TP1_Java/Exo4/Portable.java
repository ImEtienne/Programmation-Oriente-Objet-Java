package TP1_Java.Exo4;

/**
 * Décrivez votre classe Portable ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Portable
{
    private String Nom;
    private int NumeroDeModele;
    private int Annee;
    private int [] AdresseMac;
    private Utilisateur utilisateur;
    
    public Portable(String Nom,int NumeroDeModele, int Annee, int [] AdresseMac, Utilisateur utilisateur){
        this.Nom = Nom;
        this.NumeroDeModele = NumeroDeModele;
        this.Annee = Annee;
        this.AdresseMac = AdresseMac;
        this.utilisateur = utilisateur;
    }
}
