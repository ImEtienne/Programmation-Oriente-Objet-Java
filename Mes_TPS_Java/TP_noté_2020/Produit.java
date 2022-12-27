package TP_noté_2020;


/**
 * Décrivez votre classe Produit ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public final class Produit
{
    private final String nom;
    private final Date date;
    private final Type type;
    
    public Produit(String nom, Date datePeremption, Type type){
        this.nom = nom;
        this.date = datePeremption; 
        this.type = type;
    }
    
    public Produit copy(){
        return new Produit(this.nom, this.date, this.type);
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public Type getType(){
        return this.type;
    }
    
    @Override
    public String toString(){
        return this.nom + this.date + this.type;
    }
}
