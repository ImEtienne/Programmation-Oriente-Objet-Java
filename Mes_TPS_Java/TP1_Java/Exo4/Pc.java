package TP1_Java.Exo4;

/**
 * Décrivez votre classe Pc ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pc 
{
    private String nom;
    private int NumeroModele;
    private int Annee;
    private int [] AdresseIp;
    private String NomSalle;
    
    public Pc(String nom, int NumeroModele, int Annee, int [] AdresseIp, String NomSalle){
        this.nom = nom;
        this.NumeroModele = NumeroModele;
        this.Annee = Annee;
        this.AdresseIp = AdresseIp;
        this.NomSalle = NomSalle;
    }
}
