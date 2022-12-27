package TP_noté_2021;
/**
 * Décrivez votre classe Auteur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Auteur
{
    private String nom;
    private int anneeDeNaissance;
    
    public Auteur(String nom, int anneeDeNaissance){
        this.nom = nom;
        this.anneeDeNaissance = anneeDeNaissance;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public boolean equals(Auteur a){
        return (this.nom.equals(a.nom));
    }
}
