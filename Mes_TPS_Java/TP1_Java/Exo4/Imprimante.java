package TP1_Java.Exo4;

/**
 * Décrivez votre classe Imprimante ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Imprimante
{
    private String nom;
    private int NumeroModele;
    private int Annee;
    private int [] AdresseIp;
    private String NomDePilote;
    private InformationDeLocalisation infoLocalisation;
    
    public Imprimante(String nom, int NumeroModele, int Annee, int [] AdresseIp, String NomDePilote, InformationDeLocalisation infoLocalisation){
        this.nom = nom;
        this.NumeroModele = NumeroModele;
        this.Annee = Annee;
        this.AdresseIp = AdresseIp;
        this.NomDePilote = NomDePilote;
        this.infoLocalisation = infoLocalisation;
    }
}
