package TP3_Java.Exo2;
/**
 * Décrivez votre classe Personne ici.
 *
 * @author Etienne
 * @version 19:08 21/11/2021
 */
public final class Personne
{
    private final String nom;
    private final Date birth;
    
    public Personne(String nom, Date birth){
        this.nom = nom;
        this.birth = birth;
    }
    //constructeur de copie
    public Personne(Personne p){
        this.nom = p.nom;
        this.birth = new Date(p.birth);
    }
    //la copie du coonstructeur
    public Personne copy(){
        return new Personne(this.nom, new Date(this.birth));
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public Date getBirth(){
        return this.birth;
    }
}
