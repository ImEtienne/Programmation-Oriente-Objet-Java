package TP_noté_2020;
import java.util.ArrayList;


/**
 * Décrivez votre classe Client ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Client
{
    private String nom;
    private static final int MAX = 20;;
    private ArrayList<Commande> clnt;
    
    public Client(String nom){
        this.nom = nom;
        this.clnt = new ArrayList<Commande>(MAX);
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public ArrayList<Commande> getClient(){
        return this.clnt;
    }
    
    public void ajoutCommande(Commande client)throws CommandeException{
        if(this.clnt.size() < 1) this.clnt.add(client);
        else 
        throw (new CommandeException("Commande Exception: Pleine " + this.clnt));
    }
    
    public ArrayList<Commande> listeProduitsAlimentaires(Produit p){
        ArrayList<Commande> listeCommande = new ArrayList<>();
        for(int i=0; i < clnt.size(); i++ ){
            if(clnt.get[i].getType() == Type.ALIMENTAIRE)
                listeCommande.add(clnt.get(i));
        }
        return listeCommande;
    }
}
