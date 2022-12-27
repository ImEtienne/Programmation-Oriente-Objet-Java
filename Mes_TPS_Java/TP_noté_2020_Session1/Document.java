package TP_noté_2020_Session1;


/**
 * Décrivez votre classe Document ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public final class Document
{
    private final String titre;
    private final Auteur auteur;
    private final Type type;
    
    public Document(String titre, Auteur auteur, Type type){
        this.titre = titre;
        this.auteur = auteur;
        this.type = type;
    }
    
    
    public Document(Document d){
        this.titre = d.titre;
        this.auteur = d.auteur;
        this.type = d.type;
    }
}
