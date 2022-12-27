package TP_noté_2021;
import java.util.ArrayList;


/**
 * Décrivez votre classe Document ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Document
{
    private String titre;
    private ArrayList<Auteur> auteur;
    private Type type;
    
    public Document(String titre, ArrayList<Auteur> auteur, Type type ){
        this.titre = titre;
        this.auteur = auteur;
        this.type = type;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public boolean chercheDocument(Auteur ch){
        ArrayList<Document> a = new ArrayList<Document>();
        for(int i = 0; i < auteur.size(); i++ ){
            if(auteur.get(i).getNom().equals("ch")) return a.add(ch.getNom().get(i));
        }
        return null;
    }
}
