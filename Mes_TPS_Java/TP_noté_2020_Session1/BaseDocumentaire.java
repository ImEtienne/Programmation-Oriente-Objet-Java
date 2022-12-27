package TP_noté_2020_Session1;
import java.util.ArrayList;


/**
 * Décrivez votre classe BaseDocumentaire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class BaseDocumentaire
{
    private ArrayList<Document> document;
    private static final int MAX = 100;
    
    public BaseDocumentaire(){
        this.document = new ArrayList<Document>(MAX);
    }
    
    public BaseDocumentaire(BaseDocumentaire b){
        this.document = b.document;
    }
    
    public void ajout(Document d)throws BaseDocumentException{
        if(document.size() < MAX) document.add(d);
        else throw (new BaseDocumentException("Vide :" + this.document));
    }
    public Document MagazineAuteur(Auteur a){
        for(int i = 0;)
    }
}
