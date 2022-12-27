package TP1_Java.Exo4;


/**
 * Décrivez votre classe Utilisateur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Utilisateur
{
    private Identite identite;
    private boolean enseignant;
    
    public Utilisateur(Identite identite,boolean enseignant){
        this.identite = identite;
        this.enseignant = enseignant;
    }
}
