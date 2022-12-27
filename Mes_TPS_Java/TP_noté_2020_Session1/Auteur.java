package TP_noté_2020_Session1;


/**
 * Décrivez votre classe Auteur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Auteur
{
    private String nom;
    private Date dateDenaissance;
    
    public Auteur(String nom, Date dateDenaissance){
        this.nom = nom;
        this.dateDenaissance = dateDenaissance;
    }
    
    public Auteur(Auteur a){
        this.nom = a.nom;
        this.dateDenaissance = a.dateDenaissance;
    }
}
