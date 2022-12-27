package TP_noté_2021;
import java.util.ArrayList;


/**
 * Décrivez votre classe BaseDocumentaire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class BaseDocumentaire
{
    private static final int TAILLE = 100;
    private ArrayList<Document> document;
    
    public BaseDocumentaire(){
        this.document = new ArrayList<Document>(TAILLE);
    }
    
    public void add(Document d) throws FullBaseException{
        if( document.size() < TAILLE) document.add(d) ;
        else 
            throw (new FullBaseException("Ne peut être ajouté" + this.document));  
    }
    
    public Document listeLivreAuteur(Auteur a){
        ArrayList<Document> l = new ArrayList<>();
        for(int i = 0; i < document.size(); i++){
            if(auteur.get(i) == a && auteur.getType() == Type.LIVRE) return l.add(auteur.get(i));
        }
        return null;
    }
    
    public Document chercheDocument(Auteur ch){
        for(int i=0; i< document.size(); i++){
            if(document.getNom().get(i) == ch && document.getType.Type.LIVRE == document.getType().get(i)) 
            return (document.getNom().get(i));
        }
        return null;
    }
}
