package TP_noté_2020;
import java.util.ArrayList;

/**
 * Décrivez votre classe Commande ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Commande
{
    private int num;
    private ArrayList<Produit> alimentaires;
    private ArrayList<Produit> maison;
    private ArrayList<Produit> vetements;
    
    public Commande(int num){
        this.num = num;
        this.alimentaires = new ArrayList<Produit>();
        this.maison = new ArrayList<Produit>();
        this.vetements = new ArrayList<Produit>();
    }
    
    // public Commande copy(){
        // return new Commande(this.num, this.alimentaires, this.maison,
        // this.vetements);
    // }
    public int getNum(){
        return this.num;
    } 
    
    public ArrayList<Produit> getAlimentaires(){
        return alimentaires;
    }
    public ArrayList<Produit> getMaison() {
        return this.maison;
    }
    public ArrayList<Produit> getVetements(){
        return this.vetements;
    }
    
    public void ajoutProduit(Produit p){
        if(p.getType() == Type.ALIMENTAIRE){
            alimentaires.add(p);
        } else if(p.getType() == Type.MAISON){
            maison.add(p);
        } else{ //(p.getType() ==  Type.VETEMENT)
            vetements.add(p);
        }     
    }
    
    @Override
    public String toString(){
        String s1, s2, s3;
        s1 = ""; s2 = ""; s3 = "";
        for(Produit p : alimentaires){
            s1 += ("Nom : " + p.getNom() + " , date : " + p.getDate() + " , type : " + p.getType());
            s1 += '\n';
        }
        for(Produit p : maison){
            s2 += ("Nom : " + p.getNom() + " , date : " + p.getDate() + " , type : " + p.getType());
            s2 += '\n';
        }
        for(Produit p : vetements){
            s3 += ("Nom : " + p.getNom() + " , date : " + p.getDate() + " , type : " + p.getType());
            s3 += '\n';
        }
        return (s1 + s2 + s3);
    }
}
