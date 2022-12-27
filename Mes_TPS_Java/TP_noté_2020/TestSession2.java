package TP_noté_2020;
import java.util.ArrayList;

/**
 * Décrivez votre classe TestSession2 ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestSession2
{
    public static void main(String [] args){
        Date date1 = new Date(15, 12, 2021);
        Produit lait = new Produit("lait", date1, Type.ALIMENTAIRE);
        Produit chemise = new Produit("chemise", date1, Type.VETEMENT);
        Commande commande = new Commande(3);
        commande.ajoutProduit(lait);
        commande.ajoutProduit(chemise);
        Client etienne = new Client("Etienne");
        Client jinwon = new Client("Jinwon");
        try{
            etienne.ajoutCommande(commande);
            jinwon.ajoutCommande(commande);
        } catch(CommandeException e){
            System.out.println(e);
        }
        System.out.println(etienne.getClient());
        //System.out.println(jinwon.getClient());
    }
}
